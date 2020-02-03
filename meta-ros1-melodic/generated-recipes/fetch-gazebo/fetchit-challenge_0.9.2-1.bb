# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The fetchit_challenge package"
AUTHOR = "RDaneelOlivaw <duckfrost@theconstructsim.com>"
ROS_AUTHOR = "Miguel Angel Rodriguez"
HOMEPAGE = "https://opensource.fetchrobotics.com/competition"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fetch_gazebo"
ROS_BPN = "fetchit_challenge"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    controller-manager \
    effort-controllers \
    fetch-gazebo \
    gazebo-ros \
    gazebo-ros-control \
    robot-state-publisher \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetchit_challenge/0.9.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/fetchit_challenge"
SRC_URI = "git://github.com/fetchrobotics-gbp/fetch_gazebo-release;${ROS_BRANCH};protocol=https"
SRCREV = "6f18de0a614b8a334251ebc2f380b297ac4e7abc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
