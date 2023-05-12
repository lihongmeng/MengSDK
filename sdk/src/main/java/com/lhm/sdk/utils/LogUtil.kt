package com.lhm.sdk.utils

import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger

object LogUtil {

    var debug = false

    fun init(){
        Logger.addLogAdapter(AndroidLogAdapter())
    }

    fun info(content: String?) {
        content?.let {
            if (debug) {
                Logger.i(content)
            }
        }
    }

    fun debug(content: String?) {
        content?.let {
            if (debug) {
                Logger.d(content)
            }
        }
    }

    fun warn(content: String?) {
        content?.let {
            if (debug) {
                Logger.w(content)
            }
        }
    }

    fun error(content: String?) {
        content?.let {
            if (debug) {
                Logger.e(content)
            }
        }
    }

}