# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The ARUCO Library has been developed by the Ava group of the Univeristy of Cordoba(Spain).     It provides real-time marker based 3D pose estimation using AR markers."
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
ROS_AUTHOR = "Rafael Muñoz Salinas <rmsalinas@uco.es>"
HOMEPAGE = "http://www.uco.es/investiga/grupos/ava/node/26"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "aruco_ros"
ROS_BPN = "aruco"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    libeigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pal-gbp/aruco_ros-release/archive/release/melodic/aruco/2.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/aruco"
SRC_URI = "git://github.com/pal-gbp/aruco_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "dec9d34354a7a7e37064226dcd4433c5f3c3153b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}