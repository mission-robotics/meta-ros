# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Transforms messages of arbitrary type to a different frame using tf2::doTransform"
AUTHOR = "Lennart Reiher <lennart.reiher@rwth-aachen.de>"
ROS_AUTHOR = "Lennart Reiher <lennart.reiher@rwth-aachen.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "message_tf_frame_transformer"
ROS_BPN = "message_tf_frame_transformer"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    rclcpp \
    ros-environment \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    rclcpp \
    ros-environment \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    rclcpp \
    ros-environment \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ika-rwth-aachen/message_tf_frame_transformer-release/archive/release/iron/message_tf_frame_transformer/1.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/message_tf_frame_transformer"
SRC_URI = "git://github.com/ika-rwth-aachen/message_tf_frame_transformer-release;${ROS_BRANCH};protocol=https"
SRCREV = "86a3fdf20dc321da638cdfe79f630b2d518763d0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
