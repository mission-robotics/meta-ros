# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Camera driver for Allied Vision Technologies (AVT) cameras, based on their Vimba SDK."
AUTHOR = "AutonomouStuff Software Team <software@autonomoustuff.com>"
ROS_AUTHOR = "Allied Vision Technologies"
HOMEPAGE = "https://github.com/astuff/avt_vimba_camera"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "avt_vimba_camera"
ROS_BPN = "avt_vimba_camera"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    diagnostic-msgs \
    diagnostic-updater \
    image-transport \
    message-filters \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-info-manager \
    diagnostic-msgs \
    diagnostic-updater \
    image-transport \
    message-filters \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    diagnostic-msgs \
    diagnostic-updater \
    image-proc \
    image-transport \
    message-filters \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-msgs \
    stereo-image-proc \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/avt_vimba_camera-release/archive/release/iron/avt_vimba_camera/2001.1.0-5.tar.gz
ROS_BRANCH ?= "branch=release/iron/avt_vimba_camera"
SRC_URI = "git://github.com/ros2-gbp/avt_vimba_camera-release;${ROS_BRANCH};protocol=https"
SRCREV = "08f771ef9fc1ee047ad094d4e18525d52514d066"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
