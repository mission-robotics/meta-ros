
# inherit pypi python3native qmake5 qmake5_paths

# PACKAGES =+ "${PN}"

BBCLASSEXTEND = "native"

# PACKAGES =+ "${PN} ${PN}-foo"
# PROVIDES:${PN}:class-native:-foo = "${PN}-foo"

# PROVIDES:${PN} += "foobar-abc"


# PACKAGECONFIG:append:pn-qtbase-native = " gui openssl "

DEPENDS = " \
    python3 \
    python3-ply-native \
    python3-toml-native \
    qtbase \
    qtdeclarative \
    qtquickcontrols2 \
    sip3 sip3-native \
    python3-pyqt5-sip-native \
"
# python3-pyqt5-sip-native 
# sip3 sip3-native 

DEPENDS:class-native = " \
    python3 \
    qtbase-native \
    qtdeclarative-native \
    qtquickcontrols2 \
    qtquickcontrols2-native \    
    sip3 sip3-native \
    python3-pyqt5-sip-native \
"

RDEPENDS:${PN} = " \
    python3-core \
    qtbase \
    qtdeclarative  \
    qtquickcontrols2 \
    qtquickcontrols2-mkspecs \
"

DISABLED_FEATURES = " \
    PyQt_Desktop_OpenGL \
    PyQt_Accessibility \
    PyQt_SessionManager \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', '', 'PyQt_OpenGL', d)} \
"

PYQT_MODULES = " \
    QtCore \
    QtGui \
    QtNetwork \
    QtXml \
    QtNetwork \
    QtQml \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'QtQuick QtWidgets QtQuickWidgets', '', d)} \
"


do_install:class-native() {

    cd ${S}

    # find . -name "Makefile*" | xargs -r sed -i "s,(INSTALL_ROOT)${STAGING_DIR_NATIVE},(INSTALL_ROOT),g"
    # find . -name "Makefile*" | xargs -r sed -i "s,(INSTALL_ROOT)\" ${STAGING_DIR_NATIVE},(INSTALL_ROOT)\" ,g"
    # find . -name "installed.txt" | xargs -r sed -i "s,${STAGING_DIR_NATIVE},,g"
    
    oe_runmake MAKEFLAGS='-j 1' install INSTALL_ROOT=${D} # INSTALL_ROOT=${D}${base_prefix}

    # qmake5_base_fix_install ${STAGING_DIR_NATIVE}

    find ${D} \( -name "*.pri" -or -name "*.prl" \) -exec \
        sed -i -e 's|${STAGING_DIR_NATIVE}|$$[QT_HOST_PREFIX/get]|g' \
            -e 's|${STAGING_DIR_HOST}|$$[QT_SYSROOT]|g' {} \
            -e '/QMAKE_PRL_BUILD_DIR/d' {} \;

    # Replace host paths with pkg-config built-in variable
    find ${D} -name "*.pc" -exec \
        sed -i -e 's|prefix=${STAGING_DIR_HOST}|prefix=|g' \
            -e 's|${STAGING_DIR_HOST}|${pc_sysrootdir}|g' {} \;

    # Replace resolved lib path with the lib name
    find ${D} -name "*.cmake" -exec \
        sed -i -e 's@/[^;]*/lib\([^;]*\)\.\(so\|a\)@\1@g' {} \;

}

do_install() {
    cd ${S}
    oe_runmake MAKEFLAGS='-j 1' install
}

do_configure_pyqt() {
}

do_configure_pyqt:class-target() {

    cd ${S}
    echo "py_platform = linux" > pyqt.cfg
    echo "py_inc_dir = %(sysroot)/$includedir/python%(py_major).%(py_minor)${PYTHON_ABI}" >> pyqt.cfg
    echo "py_pylib_dir = %(sysroot)/${libdir}/python%(py_major).%(py_minor)" >> pyqt.cfg
    echo "py_pylib_lib = python$%(py_major).%(py_minor)" >> pyqt.cfg
    echo "pyqt_module_dir = ${D}/${libdir}/python%(py_major).%(py_minor)/site-packages" >> pyqt.cfg
    echo "pyqt_bin_dir = ${D}/${bindir}" >> pyqt.cfg
    echo "pyqt_sip_dir = ${D}/${datadir}/sip/PyQt5" >> pyqt.cfg
    echo "pyuic_interpreter = ${D}/${bindir}/python%(py_major).%(py_minor)" >> pyqt.cfg
    echo "pyqt_disabled_features = ${DISABLED_FEATURES}" >> pyqt.cfg
    echo "qt_shared = True" >> pyqt.cfg
    QT_VERSION=`${OE_QMAKE_QMAKE} -query QT_VERSION`
    echo "[Qt $QT_VERSION]" >> pyqt.cfg
    echo "pyqt_modules = ${PYQT_MODULES}" >> pyqt.cfg
    echo yes | ${PYTHON} configure.py --verbose --qmake  ${STAGING_BINDIR_NATIVE}/${QT_DIR_NAME}/qmake --configuration pyqt.cfg --sysroot ${STAGING_DIR_HOST}
   
    qmake5_base_do_configure
}

do_configure_pyqt:class-native() {

    cd ${S}
    echo "py_platform = linux" > pyqt.cfg
    echo "py_inc_dir = $includedir/python%(py_major).%(py_minor)${PYTHON_ABI}" >> pyqt.cfg
    echo "py_pylib_dir = %(sysroot)/${libdir}/python%(py_major).%(py_minor)" >> pyqt.cfg
    echo "py_pylib_lib = python$%(py_major).%(py_minor)" >> pyqt.cfg
    echo "pyqt_module_dir = ${libdir}/python%(py_major).%(py_minor)/site-packages" >> pyqt.cfg
    echo "pyqt_bin_dir = ${bindir}" >> pyqt.cfg
    echo "pyqt_sip_dir = ${datadir}/sip/PyQt5" >> pyqt.cfg
    echo "pyuic_interpreter = ${bindir}/python%(py_major).%(py_minor)" >> pyqt.cfg
    echo "pyqt_disabled_features = ${DISABLED_FEATURES}" >> pyqt.cfg
    echo "qt_shared = True" >> pyqt.cfg
    QT_VERSION=`${OE_QMAKE_QMAKE} -query QT_VERSION`
    echo "[Qt $QT_VERSION]" >> pyqt.cfg
    echo "pyqt_modules = ${PYQT_MODULES}" >> pyqt.cfg

    echo yes | ${PYTHON} configure.py \
        --verbose \
        --qmake  ${STAGING_BINDIR_NATIVE}/${QT_DIR_NAME}/qmake \
        --configuration pyqt.cfg \
        --sysroot ${STAGING_DIR_NATIVE}
    
    qmake5_base_do_configure
}

do_configure[noexec] = "1"
addtask configure_pyqt after do_configure before do_compile

# pyqt_fix_sources() {
#     find ${PKGD}/usr/src/debug/${PN} -type f -exec sed -i "s,\(${B}\|${S}\),/usr/src/debug/${PN}/${PV},g" {} \;
# }

# PACKAGESPLITFUNCS += "pyqt_fix_sources"

FILES:${PN} += "${PYTHON_SITEPACKAGES_DIR} ${OE_QMAKE_PATH_PLUGINS} /usr/lib/python3.10/site-packages/PyQt5/"
FILES:${PN}:class-native += "${PYTHON_SITEPACKAGES_DIR} ${OE_QMAKE_PATH_PLUGINS} /usr/lib/python3.10/site-packages/PyQt5/"

