# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "The depthai_examples package"
AUTHOR = "sachin <sachin@luxonis.com>"
ROS_AUTHOR = "Sachin Guruswamy"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "depthai-ros"
ROS_BPN = "depthai_examples"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    depthai \
    depthai-bridge \
    depthai-descriptions \
    depthai-ros-msgs \
    foxglove-msgs \
    image-transport \
    opencv \
    rclcpp \
    ros-environment \
    rviz-imu-plugin \
    sensor-msgs \
    std-msgs \
    stereo-msgs \
    vision-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    depthai \
    depthai-bridge \
    depthai-descriptions \
    depthai-ros-msgs \
    foxglove-msgs \
    image-transport \
    opencv \
    rclcpp \
    ros-environment \
    rviz-imu-plugin \
    sensor-msgs \
    std-msgs \
    stereo-msgs \
    vision-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    depth-image-proc \
    depthai \
    depthai-bridge \
    depthai-descriptions \
    depthai-ros-msgs \
    foxglove-msgs \
    image-transport \
    opencv \
    rclcpp \
    robot-state-publisher \
    ros-environment \
    rviz-imu-plugin \
    sensor-msgs \
    std-msgs \
    stereo-msgs \
    vision-msgs \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/luxonis/depthai-ros-release/archive/release/iron/depthai_examples/2.7.4-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/depthai_examples"
SRC_URI = "git://github.com/luxonis/depthai-ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "a9920b9c5112cbf4b860a1ffe1e9b9e3c1c3c83b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
