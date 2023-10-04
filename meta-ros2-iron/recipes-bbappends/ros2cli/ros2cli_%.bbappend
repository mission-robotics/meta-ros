# Copyright (c) 2020 LG Electronics, Inc.

# Needed to run ros2 commands on the target.
RDEPENDS:${PN} += " \
    ${PYTHON_PN}-codecs \
    ${PYTHON_PN}-debugger \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-misc \
    ${PYTHON_PN}-netifaces \
    ${PYTHON_PN}-pydoc \
    ${PYTHON_PN}-pyparsing \
    ${PYTHON_PN}-pyyaml \
    ${PYTHON_PN}-xmlrpc \
    ${PYTHON_PN}-logging \
    rosidl-generator-py \
"
