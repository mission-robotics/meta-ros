inherit pkgconfig

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

DEPENDS += "\
    eigen3-cmake-module \
    python3-numpy-native \
"
