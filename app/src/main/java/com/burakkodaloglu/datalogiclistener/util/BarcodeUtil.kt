package com.burakkodaloglu.datalogiclistener.util

object BarcodeUtil {
    fun GetBarcode(barcode: String) {
        var barcode = barcode
        barcode = barcode.replace("\n", "")
        if (barcode.startsWith("00")) barcode = barcode.substring(2)
    }
}