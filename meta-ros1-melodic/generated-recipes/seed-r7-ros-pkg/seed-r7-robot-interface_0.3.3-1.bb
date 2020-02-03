# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The seed_r7_robot_interface package"
AUTHOR = "hi.kondo <hi.kondo@thk.co.jp>"
ROS_AUTHOR = "Kazuhiro Sasabuchi"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "seed_r7_ros_pkg"
ROS_BPN = "seed_r7_robot_interface"

ROS_BUILD_DEPENDS = " \
    roscpp \
    seed-r7-ros-controller \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    seed-r7-ros-controller \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp \
    seed-r7-ros-controller \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/seed-solutions/seed_r7_ros_pkg-release/archive/release/melodic/seed_r7_robot_interface/0.3.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/seed_r7_robot_interface"
SRC_URI = "git://github.com/seed-solutions/seed_r7_ros_pkg-release;${ROS_BRANCH};protocol=https"
SRCREV = "843873e1e1b19e30e16b39bd5b3b7d7e648cd5dc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
