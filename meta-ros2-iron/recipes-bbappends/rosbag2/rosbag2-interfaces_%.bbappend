# Copyright (c) 2021 LG Electronics, Inc.

inherit setuptools3-base

ROS_BUILD_DEPENDS += " \
    rosidl-typesupport-introspection-c-native \
    rosidl-typesupport-introspection-cpp-native \
    rosidl-typesupport-fastrtps-c-native \
    rosidl-typesupport-fastrtps-cpp-native \
    service-msgs \
"
