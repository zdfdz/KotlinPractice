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

        isVaild("33", "2")

        Log.i("gzy", "${isEntry(1)}")

        var list = listOf("1", "2", "3")
        forOrwhile(list,2)
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

    // 扩展函数   replace 会把所有 is 换成 was,这是不符合预期的
    private fun rePlace(s: String) {
        val s1 = s.replace("is", "was")
        Log.i("gzy", s1)
    }

    // 条件表达式
    private fun maxOf(n1: Int, n2: Int) = if (n1 > n2) n1 else n2

    private fun maxOfTwo(n1: Int, n2: Int): Int {
        return if (n1 > n2) n1 else n2
    }

    private fun maxOfThree(n1: Int, n2: Int): Int {
        if (n1 > n2) return n1
        else
            return n2
    }

    // 空值
    // 当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。
    private fun isVaild(arg1: String, arg2: String?) {
        var x = Integer.parseInt(arg1)
        arg2?.let {
            val y = Integer.parseInt(it)
            Log.i("gzy", "${x * y}")
        }
    }

    // kotlin 的 is 相当于 java 的 instance
    // any 类型相当于 object
    private fun isEntry(s: Any): Boolean {
        return s is String
    }

    // 循环系列 for and while 循环
    // 在 Kotlin 中，List 的默认实现是 ArrayList，可以将其视为可调整大小的数组。
    private fun forOrwhile(list: List<String>, target:Int?){
        for (l in list.indices){
            Log.i("gzy", "$l ----${list[l]} ")
        }

        var i =0
        while (i < list.size){
            Log.i("gzy", "$i ----${list[i]} ")
            i++
        }

        target?.let {
            when(it){
                1 -> Log.i("gzy","target = $it")
                2 -> Log.i("gzy","target = $it")
                3 -> Log.i("gzy","target = $it")
                else -> Log.i("gzt","没有符合要求的条件")
            }
        }

    }
}
