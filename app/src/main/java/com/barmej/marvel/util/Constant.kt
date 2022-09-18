package com.barmej.marvel.util

import java.math.BigInteger
import java.security.MessageDigest
import java.sql.Timestamp

object Constant {
    const val BASE_URL = "https://gateway.marvel.com/v1/public/"
    val ts = Timestamp(System.currentTimeMillis()).time.toString()

    var API_KEY = "a4ad134ca8d1ca92f6a73b224f0d802a"
    var PRIVATE_KEY = "b5d38a074321b76b08f480812aea2ffc"
    const val limit = "100"

    fun hash(): String {
      val  input: String = "$ts$PRIVATE_KEY$API_KEY"
        val md = MessageDigest.getInstance("MD5")
        return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')

    }

}
