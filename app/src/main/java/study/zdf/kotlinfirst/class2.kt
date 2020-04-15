package study.zdf.kotlinfirst

import android.util.Log

/**
 * @author ZhengDeFeng
 * @description:
 * @date :2020/4/15 9:45
 */

// 允许继承要添加 open 关键字.
open class class2 constructor(testString :String) {
    init {
        val i =100
        Log.i("gzy","class2 的 testString = $testString")
        Log.i("gzy","class2 的 伴生对象 = $test")

        Log.i("gzy","class2 中的值 ${testSum(50,50)}")
    }

    // 伴生对象,调用时序 大于 init
    companion object{
        var  test = "我是 kotlin 中 class2 的伴生对象"
    }

   open fun testSum(n1 :Int,n2:Int) = if (n1>n2) n1+10 else n2-10


}