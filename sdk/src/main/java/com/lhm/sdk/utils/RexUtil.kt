package com.lhm.sdk.utils

import java.util.regex.Pattern

object RexUtil {

    const val EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*\$"
    fun checkStringIsEmail(content: String): Boolean {
        return Pattern.matches(EMAIL, content);
    }

}