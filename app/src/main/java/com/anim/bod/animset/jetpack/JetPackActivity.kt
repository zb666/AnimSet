package com.anim.bod.animset.jetpack

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import com.anim.bod.animset.R
import com.anim.bod.animset.R.id.textView
import com.anim.bod.animset.R.id.tvAnimSet
import com.anim.bod.animset.chapter.Person
import com.anim.bod.animset.sington.MusicPlayer
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.thread

class JetPackActivity : AppCompatActivity() {


    var mViewModel: MViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jectpack)

        val javaClass = MusicPlayer.javaClass
        val superclass = javaClass.genericSuperclass
        superclass.apply {

        }

        val maNong = Person.MaNong()
        maNong.superWork()
//        findViewById<TextView>(R.id.tvAnimSet).setOnClickListener {
//            var a = A()
//            val c = a.c
//            val ex = a.ex
//            val test = a.test()
//            val test1 = a.test()
//        }


        findViewById<TextView>(R.id.tvAnimSet).setOnClickListener {
        }
    }


}