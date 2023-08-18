# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Compression implementations for rosbag2 bags and messages."
AUTHOR = "Michael Orlov <michael.orlov@apex.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosbag2"
ROS_BPN = "rosbag2_compression"

ROS_BUILD_DEPENDS = " \
    rcpputils \
    rcutils \
    rosbag2-cpp \
    rosbag2-storage \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rcpputils \
    rcutils \
    rosbag2-cpp \
    rosbag2-storage \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rcpputils \
    rcutils \
    rosbag2-cpp \
    rosbag2-storage \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-lint-auto \
    ament-lint-common \
    rclcpp \
    rosbag2-test-common \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosbag2-release/archive/release/iron/rosbag2_compression/0.22.2-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/rosbag2_compression"
SRC_URI = "git://github.com/ros2-gbp/rosbag2-release;${ROS_BRANCH};protocol=https"
SRCREV = "e8ee90bb74a0b326e7897a14ff48385a53ece80f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
