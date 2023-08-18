# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Metapackage of geometry tutorials ROS."
AUTHOR = "Alejandro Hernández Cordero <alejandro@openrobotics.org>"
ROS_AUTHOR = "Shyngyskhan Abilkassov <abilkasov@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/geometry_tutorials"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License, Version 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=e8978a5103d23266fc6f8ec03dc9eb16"

ROS_CN = "geometry_tutorials"
ROS_BPN = "geometry_tutorials"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/geometry_tutorials-release/archive/release/iron/geometry_tutorials/0.3.6-4.tar.gz
ROS_BRANCH ?= "branch=release/iron/geometry_tutorials"
SRC_URI = "git://github.com/ros2-gbp/geometry_tutorials-release;${ROS_BRANCH};protocol=https"
SRCREV = "51d1f94411cd87cad45c53bfedf57dea56d7b0b6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
