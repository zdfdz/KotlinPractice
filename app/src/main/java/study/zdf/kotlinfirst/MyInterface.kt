package study.zdf.kotlinfirst

import android.util.Log

/**
 * @author ZhengDeFeng
 * @description:
 * @date :2020/4/15 11:51
 */
interface MyInterface {
    val prop: Int // 抽象的

    // kotlin 接口中赋值方式,必须通过 get()  . val 相当于 java 在定义变量时加了final
    val propertyWithImplementation: String
        get() = "MyInterface 中的 propertyWithImplementation"

    fun foo() {
        Log.i("gzy", "MyInterface 的值为 $prop")
    }
}