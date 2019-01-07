package com.anim.bod.animset.chapter

abstract class Person {

    var age = 16

    open fun work() {

    }

    abstract fun superWork()

     class MaNong : Person() {

        override fun superWork() {
            println("父类的抽象方法")
        }

        override fun work() {
            super.work()
        }



    }


}