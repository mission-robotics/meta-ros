# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "libnabo is a fast K Nearest Neighbour library for low-dimensional spaces."
AUTHOR = "Stéphane Magnenat <stephane.magnenat@mavt.ethz.ch>"
ROS_AUTHOR = "Stéphane Magnenat <stephane.magnenat@mavt.ethz.ch>"
HOMEPAGE = "https://github.com/ethz-asl/libnabo"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=75730354549103aaba72b66caf53717b"

ROS_CN = "libnabo"
ROS_BPN = "libnabo"

ROS_BUILD_DEPENDS = " \
    boost \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    libeigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/libnabo-release/archive/release/iron/libnabo/1.0.7-4.tar.gz
ROS_BRANCH ?= "branch=release/iron/libnabo"
SRC_URI = "git://github.com/ros2-gbp/libnabo-release;${ROS_BRANCH};protocol=https"
SRCREV = "051e8a2674e589423431d49686fd6cf940181f51"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
