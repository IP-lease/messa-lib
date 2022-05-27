package com.iplease.lib.messa.v2.data.type

class IpString (val value: String) {
    companion object{ const val REGEX = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\$" }
    init {
        if(!value.matches(Regex(REGEX))) wrongFormat()
        value.split(".")
            .map { it.toInt() }
            .apply { if(size != 4) wrongFormat() }
            .onEach { x -> if(x > 255 || x < 0) wrongFormat() }
    }

    private fun wrongFormat(): Unit = throw IllegalArgumentException("올바른 IP주소가 아닙니다!")
    override fun toString() = value
}