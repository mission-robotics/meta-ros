inherit python3native ros_ament_cmake pkgconfig ros_insane_dev_so

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI:append = " file://0001-nanogui-CMakeList-fix-find-file.patch \
                   file://0002-nanflann-CMakeList-fix-check-for-compiler.patch \
                   file://0003-libfyaml-fix-script_libfyaml-for-cross-compile.patch \
                   file://0004-patch-mathplot.patch \
                   file://0005-patch-mathplot-cpp.patch \
"

ROS_BUILD_DEPENDS:remove = "${ROS_UNRESOLVED_DEP-libopenni2-dev}"

DEPENDS:append = " \
    qtbase \
    python3-numpy-native \
    ament-package-native \
    ament-cmake-native \
    rosidl-typesupport-c-native \
"

PREFERRED_VERSION_libfreenect = "0.5.%"

RDEPENDS:${PN} = " \
    libfreenect "

FILES:${PN} += "/usr/share/mrpt/* \
                /usr/share/metainfo/* \
                /usr/share/mime/* \
                /usr/share/nanoflann/* \
"