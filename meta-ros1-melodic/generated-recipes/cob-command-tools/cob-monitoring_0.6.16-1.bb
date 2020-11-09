# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "cob_monitoring"
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Florian Weisshardt <fmw@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/cob_monitoring"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_command_tools"
ROS_BPN = "cob_monitoring"

ROS_BUILD_DEPENDS = " \
    diagnostic-updater \
    roscpp \
    topic-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-updater \
    roscpp \
    topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-paramiko \
    ${PYTHON_PN}-psutil \
    ${PYTHON_PN}-requests \
    ${ROS_UNRESOLVED_DEP-ifstat} \
    ${ROS_UNRESOLVED_DEP-ntpdate} \
    ${ROS_UNRESOLVED_DEP-python-mechanize} \
    actionlib \
    cob-light \
    cob-msgs \
    cob-script-server \
    diagnostic-msgs \
    diagnostic-updater \
    ipmitool \
    roscpp \
    rospy \
    rostopic \
    sensor-msgs \
    std-msgs \
    sysstat \
    topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_monitoring/0.6.16-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_monitoring"
SRC_URI = "git://github.com/ipa320/cob_command_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "b9a9ccd9dd3d6d4b7a8473cf997f597c85a92152"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
