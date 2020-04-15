package study.zdf.kotlinfirst

import android.util.Log

/**
 * @author ZhengDeFeng
 * @description:
 * @date :2020/4/15 11:12
 */
class class3 : class2 {
    private lateinit var i:String  // 延时初始化 , 暂且不知道干嘛用的.

    constructor(testString: String) : super(testString) {
    }

    init {
        Log.i("gzy","class3 的 初始化了,值为 ${testSum(100,200)}")

    }

    override fun testSum(n1: Int, n2: Int): Int {
        val x = n1+100
        val y = n2+200
        return super.testSum(x, y)
        i = "12345678"
        
    }

    companion object {
        // 常量的定义
        const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"
    }

}