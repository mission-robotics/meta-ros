# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "ROS messages for the cartographer_ros package."
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
ROS_AUTHOR = "The Cartographer Authors <google-cartographer@googlegroups.com>"
HOMEPAGE = "https://github.com/cartographer-project/cartographer_ros"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"

ROS_CN = "cartographer_ros"
ROS_BPN = "cartographer_ros_msgs"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    rosidl-default-runtime \
    std-msgs \
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

# matches with: https://github.com/ros2-gbp/cartographer_ros-release/archive/release/iron/cartographer_ros_msgs/2.0.9001-2.tar.gz
ROS_BRANCH ?= "branch=release/iron/cartographer_ros_msgs"
SRC_URI = "git://github.com/ros2-gbp/cartographer_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "624a69843d0de99f180b8e728cd4e304e39c6264"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
