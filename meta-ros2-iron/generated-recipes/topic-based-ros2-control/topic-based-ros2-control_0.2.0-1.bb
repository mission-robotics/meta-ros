# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "ros2 control hardware interface for topic_based sim"
AUTHOR = "Marq Rasmussen <marq.razz@gmail.com>"
ROS_AUTHOR = "Jafar <jafar@picknik.ai>"
HOMEPAGE = "https://github.com/PickNikRobotics/topic_based_ros2_control"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "topic_based_ros2_control"
ROS_BPN = "topic_based_ros2_control"

ROS_BUILD_DEPENDS = " \
    angles \
    hardware-interface \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    hardware-interface \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    hardware-interface \
    rclcpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    picknik-ament-copyright \
    ros2-control-test-assets \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PickNikRobotics/topic_based_ros2_control-release/archive/release/iron/topic_based_ros2_control/0.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/topic_based_ros2_control"
SRC_URI = "git://github.com/PickNikRobotics/topic_based_ros2_control-release;${ROS_BRANCH};protocol=https"
SRCREV = "bc32d434a901aaf1c27bd1b4b44606194d11bf2c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}