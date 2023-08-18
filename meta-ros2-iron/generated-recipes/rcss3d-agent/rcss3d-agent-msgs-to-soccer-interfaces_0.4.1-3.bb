# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Library with methods that convert rcss3d_agent_msgs to soccer_interfaces"
AUTHOR = "ijnek <kenjibrameld@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rcss3d_agent"
ROS_BPN = "rcss3d_agent_msgs_to_soccer_interfaces"

ROS_BUILD_DEPENDS = " \
    rcss3d-agent-msgs \
    soccer-vision-3d-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rcss3d-agent-msgs \
    soccer-vision-3d-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rcss3d-agent-msgs \
    soccer-vision-3d-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rcss3d_agent-release/archive/release/iron/rcss3d_agent_msgs_to_soccer_interfaces/0.4.1-3.tar.gz
ROS_BRANCH ?= "branch=release/iron/rcss3d_agent_msgs_to_soccer_interfaces"
SRC_URI = "git://github.com/ros2-gbp/rcss3d_agent-release;${ROS_BRANCH};protocol=https"
SRCREV = "fcdeb89764a14dfe9d2f219e6a550a2a9596bbf1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
