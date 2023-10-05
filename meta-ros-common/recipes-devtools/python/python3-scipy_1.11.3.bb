DESCRIPTION = "Open-source software for mathematics, science, and engineering. It includes modules for statistics, optimization, integration, linear algebra, Fourier transforms, signal and image processing, ODE solvers, and more."
HOMEPAGE = "https://scipy.org"
SECTION = "devel/python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3387f60dd97ca5d8ea2a907e50aec3a0"

SRC_URI += " \
"

SRC_URI[md5sum] = "9f618e66c4b12b702793cdfd2b7b3847"
SRC_URI[sha256sum] = "bba4d955f54edd61899776bad459bf7326e14b9fa1c552181f0479cc60a568cd"

PYPI_PACKAGE = "scipy"
inherit pypi


RDEPENDS:${PN} += "python3-numpy \
"

BBCLASSEXTEND = "native"
