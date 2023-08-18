# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Package for all inverse kinematics solvers in MoveIt"
AUTHOR = "Henning Kayser <henningkayser@picknik.ai>"
ROS_AUTHOR = "Dave Coleman <dave@picknik.ai>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "moveit"
ROS_BPN = "moveit_kinematics"

ROS_BUILD_DEPENDS = " \
    class-loader \
    generate-parameter-library \
    libeigen \
    moveit-common \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    orocos-kdl-vendor \
    pluginlib \
    rsl \
    tf2 \
    tf2-kdl \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    class-loader \
    generate-parameter-library \
    libeigen \
    moveit-common \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    orocos-kdl-vendor \
    pluginlib \
    rsl \
    tf2 \
    tf2-kdl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    class-loader \
    generate-parameter-library \
    libeigen \
    moveit-common \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning \
    orocos-kdl-vendor \
    pluginlib \
    python3-lxml \
    rsl \
    tf2 \
    tf2-kdl \
    urdfdom \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    launch-param-builder \
    moveit-configs-utils \
    moveit-resources-fanuc-description \
    moveit-resources-fanuc-moveit-config \
    moveit-resources-panda-description \
    moveit-resources-panda-moveit-config \
    ros-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/moveit2-release/archive/release/iron/moveit_kinematics/2.7.4-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/moveit_kinematics"
SRC_URI = "git://github.com/ros2-gbp/moveit2-release;${ROS_BRANCH};protocol=https"
SRCREV = "919112fa84023f141555e6d22b48d18aeb35731b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
