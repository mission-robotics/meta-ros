# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Implementation of C++20's std::span"
AUTHOR = "Tyler Weaver <maybe@tylerjw.dev>"
HOMEPAGE = "https://github.com/tcbrindle/span"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Boost Software License"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=581c8547256df9e0e66200c5d3650e31"

ROS_CN = "cpp_polyfills"
ROS_BPN = "tcb_span"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/cpp_polyfills-release/archive/release/iron/tcb_span/1.0.2-4.tar.gz
ROS_BRANCH ?= "branch=release/iron/tcb_span"
SRC_URI = "git://github.com/ros2-gbp/cpp_polyfills-release;${ROS_BRANCH};protocol=https"
SRCREV = "16229d5cfa0efc43301ace357361e5d57cccce54"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
