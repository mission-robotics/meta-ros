# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "ROS Foxglove Bridge"
AUTHOR = "John Hurliman <john@foxglove.dev>"
ROS_AUTHOR = "Foxglove <ros-tooling+foxglove_bridge@foxglove.dev>"
HOMEPAGE = "https://github.com/foxglove/ros-foxglove-bridge"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=92566b45c3390e5178465bcaade208b7"

ROS_CN = "foxglove_bridge"
ROS_BPN = "foxglove_bridge"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    asio \
    nlohmann-json \
    openssl \
    rclcpp \
    rclcpp-components \
    resource-retriever \
    ros-environment \
    rosgraph-msgs \
    websocketpp \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    rclcpp \
    rclcpp-components \
    resource-retriever \
    rosgraph-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    openssl \
    rclcpp \
    rclcpp-components \
    resource-retriever \
    rosgraph-msgs \
    zlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    std-msgs \
    std-srvs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/foxglove_bridge-release/archive/release/iron/foxglove_bridge/0.7.0-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/foxglove_bridge"
SRC_URI = "git://github.com/ros2-gbp/foxglove_bridge-release;${ROS_BRANCH};protocol=https"
SRCREV = "d395f8bdfedb095c397d3b507b742978b70d6f4e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
