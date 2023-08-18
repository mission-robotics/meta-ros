# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around tinyxml2, providing nothing but a dependency on tinyxml2, on some systems.     On others, it provides a fixed CMake module or even an ExternalProject build of tinyxml2."
AUTHOR = "Scott K Logan <scott@openrobotics.org>"
ROS_AUTHOR = "Audrow Nash <audrow@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "tinyxml2_vendor"
ROS_BPN = "tinyxml2_vendor"

ROS_BUILD_DEPENDS = " \
    libtinyxml2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libtinyxml2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libtinyxml2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/tinyxml2_vendor-release/archive/release/iron/tinyxml2_vendor/0.8.2-3.tar.gz
ROS_BRANCH ?= "branch=release/iron/tinyxml2_vendor"
SRC_URI = "git://github.com/ros2-gbp/tinyxml2_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "246daea1a201f7671754f7f13ce8112348033b49"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
