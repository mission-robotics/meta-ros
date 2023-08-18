# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Demo nodes to demonstrate the usage of the grid map library."
AUTHOR = "Maximilian Wulf <mwulf@anybotics.com>"
ROS_AUTHOR = "Péter Fankhauser <pfankhauser@anybotics.com>"
HOMEPAGE = "http://github.com/anybotics/grid_map"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "grid_map"
ROS_BPN = "grid_map_demos"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    grid-map-cmake-helpers \
    grid-map-core \
    grid-map-cv \
    grid-map-filters \
    grid-map-loader \
    grid-map-msgs \
    grid-map-octomap \
    grid-map-ros \
    grid-map-rviz-plugin \
    grid-map-visualization \
    octomap-msgs \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    grid-map-core \
    grid-map-cv \
    grid-map-filters \
    grid-map-loader \
    grid-map-msgs \
    grid-map-octomap \
    grid-map-ros \
    grid-map-rviz-plugin \
    grid-map-visualization \
    octomap-msgs \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    grid-map-core \
    grid-map-cv \
    grid-map-filters \
    grid-map-loader \
    grid-map-msgs \
    grid-map-octomap \
    grid-map-ros \
    grid-map-rviz-plugin \
    grid-map-visualization \
    octomap-msgs \
    octomap-rviz-plugins \
    octomap-server \
    opencv \
    rclcpp \
    rclpy \
    rviz2 \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/grid_map-release/archive/release/iron/grid_map_demos/2.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/grid_map_demos"
SRC_URI = "git://github.com/ros2-gbp/grid_map-release;${ROS_BRANCH};protocol=https"
SRCREV = "5306baeab5c072ac0d356e4312f8edb193252f73"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
