ROS_BUILD_DEPENDS:append = " python3-numpy-native "

# Warnings are treated as errors, which is not good for us
do_configure:prepend() {
    sed -i -e 's|-Werror||g' ${S}/CMakeLists.txt
}