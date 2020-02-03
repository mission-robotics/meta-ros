# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "rqt GUI for rosmon, the node launcher and monitor for ROS. 		rosmon is a replacement for the roslaunch tool, focused on performance, 		remote monitoring, and usability."
AUTHOR = "Max Schwarz <max.schwarz@uni-bonn.de>"
ROS_AUTHOR = "Max Schwarz <max.schwarz@uni-bonn.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

ROS_CN = "rosmon"
ROS_BPN = "rqt_rosmon"

ROS_BUILD_DEPENDS = " \
    pluginlib \
    qtbase \
    roscpp \
    rosmon-msgs \
    rqt-gui \
    rqt-gui-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    pluginlib \
    roscpp \
    rosmon-msgs \
    rqt-gui \
    rqt-gui-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pluginlib \
    roscpp \
    rosmon-msgs \
    rqt-gui \
    rqt-gui-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/xqms/rosmon-release/archive/release/melodic/rqt_rosmon/2.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rqt_rosmon"
SRC_URI = "git://github.com/xqms/rosmon-release;${ROS_BRANCH};protocol=https"
SRCREV = "8eb7a8b980b83dcd8c8b607688a0ce96d53e356a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
