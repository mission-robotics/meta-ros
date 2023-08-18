# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Driver for u-blox GPS devices."
AUTHOR = "Gareth Cross <gcross.code@icloud.com>"
ROS_AUTHOR = "Johannes Meyer"
HOMEPAGE = "http://ros.org/wiki/ublox"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ublox"
ROS_BPN = "ublox_gps"

ROS_BUILD_DEPENDS = " \
    asio \
    diagnostic-msgs \
    diagnostic-updater \
    geometry-msgs \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-msgs \
    tf2 \
    ublox-msgs \
    ublox-serialization \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    asio \
    diagnostic-msgs \
    diagnostic-updater \
    geometry-msgs \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-msgs \
    tf2 \
    ublox-msgs \
    ublox-serialization \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    asio \
    diagnostic-msgs \
    diagnostic-updater \
    geometry-msgs \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-msgs \
    tf2 \
    ublox-msgs \
    ublox-serialization \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ublox-release/archive/release/iron/ublox_gps/2.3.0-3.tar.gz
ROS_BRANCH ?= "branch=release/iron/ublox_gps"
SRC_URI = "git://github.com/ros2-gbp/ublox-release;${ROS_BRANCH};protocol=https"
SRCREV = "8a3c5aae80db79768258650532ed4027c59e6d49"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
