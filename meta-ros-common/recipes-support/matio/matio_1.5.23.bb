SUMMARY = "MATLAB MAT File I/O Library"
SECTION = "libs"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=0af3a5e9b16370a321d36aa6acf4db59"

SRC_URI = "git://github.com/tbeu/matio.git;protocol=https;branch=master \
          "
SRCREV = "e9e063e08ef2a27fcc22b1e526258fea5a5de329"

S = "${WORKDIR}/git"

DEPENDS = "parted"

inherit autotools pkgconfig