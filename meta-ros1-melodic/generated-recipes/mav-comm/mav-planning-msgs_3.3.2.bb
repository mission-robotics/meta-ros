# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Messages specific to MAV planning, especially polynomial planning."
AUTHOR = "Helen Oleynikova <helen.oleynikova@mavt.ethz.ch>"
ROS_AUTHOR = "Simon Lynen"
HOMEPAGE = "https://github.com/ethz-asl/mav_comm"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "ASL 2.0"
LICENSE = "ASL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

ROS_CN = "mav_comm"
ROS_BPN = "mav_planning_msgs"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    libeigen \
    mav-msgs \
    message-generation \
    message-runtime \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    libeigen \
    mav-msgs \
    message-generation \
    message-runtime \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    libeigen \
    mav-msgs \
    message-generation \
    message-runtime \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ethz-asl/mav_comm-release/archive/release/melodic/mav_planning_msgs/3.3.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mav_planning_msgs"
SRC_URI = "git://github.com/ethz-asl/mav_comm-release;${ROS_BRANCH};protocol=https"
SRCREV = "38cccd42948668ced074c0d88d541d7d5689aec0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
