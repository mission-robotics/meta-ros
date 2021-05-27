# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Extra nodes and plugins for <a href="http://wiki.ros.org/mavros">MAVROS</a>."
AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
ROS_AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/mavros_extras"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GPLv3 & LGPLv3 & BSD"
LICENSE = "GPL-3.0-only & LGPL-3.0-only & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

ROS_CN = "mavros"
ROS_BPN = "mavros_extras"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    mavros \
    mavros-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    tf2-eigen \
    urdf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    mavros \
    mavros-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    tf2-eigen \
    urdf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    mavros \
    mavros-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    tf2-eigen \
    urdf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/mavlink/mavros-release/archive/release/noetic/mavros_extras/1.8.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/mavros_extras"
SRC_URI = "git://github.com/mavlink/mavros-release;${ROS_BRANCH};protocol=https"
SRCREV = "a2835b710d86680ff4488a75c7f89149f185e77d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}