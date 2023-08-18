# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "This package defines messages commonly used in mapping packages."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "Mabel Zhang <mabel@openrobotics.org>"
HOMEPAGE = "http://ros.org/wiki/map_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "navigation_msgs"
ROS_BPN = "map_msgs"

ROS_BUILD_DEPENDS = " \
    nav-msgs \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    nav-msgs \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/navigation_msgs-release/archive/release/iron/map_msgs/2.2.0-3.tar.gz
ROS_BRANCH ?= "branch=release/iron/map_msgs"
SRC_URI = "git://github.com/ros2-gbp/navigation_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "e892a6ba7a23a62bce05b0b98ac60faa3b4ec3b7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
