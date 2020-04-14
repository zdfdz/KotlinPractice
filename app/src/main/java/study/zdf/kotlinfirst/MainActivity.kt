package study.zdf.kotlinfirst

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("gzy", "${sum1(1, 2)}")
        Log.i("gzy", "${sum2(1, 2)}")
        VarOrVal()
        rePlace("this is dog")
    }

    // 定义函数
    private fun sum1(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    private fun sum2(n1: Int, n2: Int) = n1 + n2

    // 变量系列
    private fun VarOrVal() {
        var i = 1 // 等价于 var i:Int = 1,定义 变量 i
        i += 1
        Log.i("gzy", "$i")
    }

    // 表达式   replace 会把所有 is 换成 was,这是不符合预期的
    private fun rePlace(s:String){
        val s1 = s.replace("is", "was")
        Log.i("gzy", s1)
    }

}
