# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Functions and types for rclcpp::Parameter"
AUTHOR = "Tyler Weaver <maybe@tylerjw.dev>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "generate_parameter_library"
ROS_BPN = "parameter_traits"

ROS_BUILD_DEPENDS = " \
    fmt \
    rclcpp \
    rsl \
    tcb-span \
    tl-expected \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    fmt \
    rclcpp \
    rsl \
    tcb-span \
    tl-expected \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fmt \
    rclcpp \
    rsl \
    tcb-span \
    tl-expected \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/generate_parameter_library-release/archive/release/iron/parameter_traits/0.3.6-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/parameter_traits"
SRC_URI = "git://github.com/ros2-gbp/generate_parameter_library-release;${ROS_BRANCH};protocol=https"
SRCREV = "ea758235a2f5372ff8584c2f4d9e4e1e198090f8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
