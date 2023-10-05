# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Command line tools for introspecting ROS systems"
AUTHOR = "Southwest Research Institute <swri-robotics@swri.org>"
ROS_AUTHOR = "David Anthony <david.anthony@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD 3 Clause"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=e93ac74ce618e98d7286226018d612a5"

ROS_CN = "marti_common"
ROS_BPN = "swri_cli_tools"

ROS_BUILD_DEPENDS = " \
    marti-introspection-msgs \
    python3-natsort \
    rcl-interfaces \
    rclpy \
    ros2cli \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    marti-introspection-msgs \
    python3-natsort \
    rcl-interfaces \
    rclpy \
    ros2cli \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    marti-introspection-msgs \
    python3-natsort \
    rcl-interfaces \
    rclpy \
    ros2cli \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    ament-xmllint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/marti_common-release/archive/release/iron/swri_cli_tools/3.6.1-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/swri_cli_tools"
SRC_URI = "git://github.com/ros2-gbp/marti_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "f816bf381cad67e450d870985eac3b8f16362103"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
