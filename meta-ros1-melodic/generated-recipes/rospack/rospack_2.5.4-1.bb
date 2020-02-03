# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ROS Package Tool"
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Brian Gerkey"
HOMEPAGE = "http://wiki.ros.org/rospack"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rospack"
ROS_BPN = "rospack"

ROS_BUILD_DEPENDS = " \
    boost \
    cmake-modules \
    gtest \
    libtinyxml2 \
    pkgconfig \
    python \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    libtinyxml2 \
    pkgconfig \
    python \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    libtinyxml2 \
    pkgconfig \
    python \
    python-catkin-pkg \
    python-rosdep \
    ros-environment \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-coverage} \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rospack-release/archive/release/melodic/rospack/2.5.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rospack"
SRC_URI = "git://github.com/ros-gbp/rospack-release;${ROS_BRANCH};protocol=https"
SRCREV = "be1bdc8fa6d79c68625c064b2882f0759764d02b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
