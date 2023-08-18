# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "A vendor package for JSON schema validator for JSON for Modern C++"
AUTHOR = "Grey <grey@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0 & MIT License"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=90960aa57caec7a7bf3c3aa0ed98b90a"

ROS_CN = "nlohmann_json_schema_validator_vendor"
ROS_BPN = "nlohmann_json_schema_validator_vendor"

ROS_BUILD_DEPENDS = " \
    nlohmann-json \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    git-native \
"

ROS_EXPORT_DEPENDS = " \
    nlohmann-json \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    nlohmann-json \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/nlohmann_json_schema_validator_vendor-release/archive/release/iron/nlohmann_json_schema_validator_vendor/0.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/nlohmann_json_schema_validator_vendor"
SRC_URI = "git://github.com/ros2-gbp/nlohmann_json_schema_validator_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "2af6d3898400de63ced997a6cb4065a6d34f6720"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
