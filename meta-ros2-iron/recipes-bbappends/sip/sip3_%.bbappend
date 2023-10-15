do_install:class-native() {

    # Fix path issues in sipconfig.py
    sed -i -e 's@//@/@g' -e 's@${D}@@g' sipconfig.py
    # We need additional paths to find QtCore and QtWidgets
    sed -i -e "s@\('CXXFLAGS':\s\+'\)\(.*\)'@\1\2 -I\${STAGING_DIR_NATIVE}/usr/include/QtCore -I\${STAGING_DIR_NATIVE}/usr/include/QtWidgets'@" sipconfig.py

    # install sipconfig.py
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages
    install -m 0644 sipconfig.py ${D}${libdir}/${PYTHON_DIR}/site-packages/sipconfig.py


    oe_runmake install INSTALL_ROOT=${D}${base_prefix}
}
