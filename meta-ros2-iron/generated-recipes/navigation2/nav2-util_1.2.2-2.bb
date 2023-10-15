# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "TODO"
AUTHOR = "Michael Jeronimo <michael.jeronimo@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0 & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "navigation2"
ROS_BPN = "nav2_util"

ROS_BUILD_DEPENDS = " \
    action-msgs \
    bond \
    bondcpp \
    boost \
    geometry-msgs \
    launch \
    launch-testing-ament-cmake \
    lifecycle-msgs \
    nav-msgs \
    nav2-common \
    nav2-msgs \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    action-msgs \
    bond \
    bondcpp \
    geometry-msgs \
    launch \
    launch-testing-ament-cmake \
    lifecycle-msgs \
    nav-msgs \
    nav2-common \
    nav2-msgs \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-msgs \
    bond \
    bondcpp \
    boost \
    geometry-msgs \
    launch \
    launch-testing-ament-cmake \
    lifecycle-msgs \
    nav-msgs \
    nav2-common \
    nav2-msgs \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    action-msgs \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing-ament-cmake \
    launch-testing-ros \
    std-srvs \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/iron/nav2_util/1.2.2-2.tar.gz
ROS_BRANCH ?= "branch=release/iron/nav2_util"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "6b31087ef06599ea9e692b01ffc01a0b3249cdc9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}