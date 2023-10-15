inherit python3native

ROS_BUILD_DEPENDS += " \
    rosidl-default-generators-native \
    rosidl-core-generators-native \
    rosidl-adapter-native \
    rosidl-parser-native \
    python3-numpy-native \
    python3-lark-parser-native \
    rpyutils-native \
    rosidl-runtime-c-native \
    rosidl-typesupport-fastrtps-c-native \
    rosidl-typesupport-fastrtps-cpp-native \
    rosidl-typesupport-introspection-cpp-native \
    std-msgs \
"

ROS_EXEC_DEPENDS += " \
    fastcdr \
    rcutils \
    rosidl-runtime-c \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
    rosidl-typesupport-fastrtps-c \
    rosidl-typesupport-fastrtps-cpp \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
    std-msgs \
"

RDEPENDS:${PN} += " ${ROS_EXEC_DEPENDS} "