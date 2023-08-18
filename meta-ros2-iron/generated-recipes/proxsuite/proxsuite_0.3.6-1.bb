# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "The Advanced Proximal Optimization Toolbox"
AUTHOR = "Justin Carpentier <justin.carpentier@inria.fr>"
ROS_AUTHOR = "Antoine Bambade <antoine.bambade@inria.fr>"
HOMEPAGE = "https://simple-robotics.github.io/proxsuite"
SECTION = "devel"
LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=6d936230566da2b5b6f908ac66e333a8"

ROS_CN = "proxsuite"
ROS_BPN = "proxsuite"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python3-scipy} \
    doxygen \
    git \
    libeigen \
    python3-numpy \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python3-scipy} \
    libeigen \
    python3-numpy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python3-scipy} \
    libeigen \
    python3-numpy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-matio} \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/proxsuite-release/archive/release/iron/proxsuite/0.3.6-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/proxsuite"
SRC_URI = "git://github.com/ros2-gbp/proxsuite-release;${ROS_BRANCH};protocol=https"
SRCREV = "462433ee6332feef056da4b1bc3e86bbb2e68f91"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
