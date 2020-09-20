# add -mno-bmi as it causes grub-efi to fail on znver1 arch
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
