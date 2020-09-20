DESCRIPTION = "libuvc"
HOMEPAGE = "https://github.com/libuvc/libuvc.git"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2f1963e0bb88c93463af750daf9ba0c2"

SRC_URI = "git://github.com/libuvc/libuvc.git \
           file://0001-add-jpeg-handling.patch \
          "
SRCREV = "05e7ba682d5761b05a9b212ef84775068fbc94e3"
PV = "v0.0.6+git${SRCPV}"

DEPENDS = "libusb jpeg"

S = "${WORKDIR}/git"

inherit cmake
