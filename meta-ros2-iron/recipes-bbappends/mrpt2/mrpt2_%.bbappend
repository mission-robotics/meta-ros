inherit python3native ros_ament_cmake pkgconfig

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI:append = " file://0001-nanogui-CMakeList-fix-find-file.patch \
                   file://0002-nanflann-CMakeList-fix-check-for-compiler.patch \
                   file://0003-libfyaml-fix-script_libfyaml-for-cross-compile.patch \
                   file://0004-patch-mathplot.patch \
                   file://0005-patch-mathplot-cpp.patch \
"

# file://003-libfyaml-CMakeList-fix-check-for-compilers.patch 

ROS_BUILD_DEPENDS:remove = "${ROS_UNRESOLVED_DEP-libopenni2-dev}"

# EXTRA_OECMAKE:append = "-DCMAKE_STAGING_PREFIX=${S}/foobar/"
# export CMAKE_PREFIX_PATH ="${S}/foobar/"
# export entypo.ttf_ROOT = "${S}/foobar/"

DEPENDS:append = " \
    qtbase \
    python3-numpy-native \
    ament-package-native \
    ament-cmake-native \
    rosidl-typesupport-c-native \
"