# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "flexbe_widget implements some smaller scripts for the behavior engine."
AUTHOR = "Philipp Schillinger <philsplus@gmail.com>"
ROS_AUTHOR = "Philipp Schillinger"
HOMEPAGE = "http://ros.org/wiki/flexbe_core"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "flexbe_behavior_engine"
ROS_BPN = "flexbe_widget"

ROS_BUILD_DEPENDS = " \
    flexbe-core \
    flexbe-mirror \
    flexbe-msgs \
    flexbe-onboard \
    launch-ros \
    rclpy \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
"

ROS_EXPORT_DEPENDS = " \
    flexbe-core \
    flexbe-mirror \
    flexbe-msgs \
    flexbe-onboard \
    launch-ros \
    rclpy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    flexbe-core \
    flexbe-mirror \
    flexbe-msgs \
    flexbe-onboard \
    launch-ros \
    rclpy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/flexbe_behavior_engine-release/archive/release/iron/flexbe_widget/2.3.3-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/flexbe_widget"
SRC_URI = "git://github.com/ros2-gbp/flexbe_behavior_engine-release;${ROS_BRANCH};protocol=https"
SRCREV = "a6b7fe1e67f0d9a42b15b1da468d3c3366be8899"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
