package com.anim.bod.animset.jetpack

import android.util.Log

class A {

    lateinit var c: String

    val ex:String by lazy {
        "inited"
    }

    val e:Int by lazy {
         111
    }

    var b = 0

    fun test():String{
        return ex
    }

}