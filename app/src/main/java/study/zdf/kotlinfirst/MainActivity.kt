package study.zdf.kotlinfirst

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap


class MainActivity : AppCompatActivity(), MyInterface {
    // 接口里面的变量(相当于 java 中为赋值的常量) 在实现类中可以 用 get 去赋值。
    override val prop: Int
        get() = 456789

    private val da: DataBean by lazy { DataBean("", 0) }

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
        forOrwhile(list, 2)

        seachString("1233456")
        newClass()
        foo()
        propertyWithImplementation
        Log.i("gzy", "$propertyWithImplementation")

        // data 类型测试
        val mList = mutableListOf<DataBean>()
        for (i in 0..10) {
            val bean = DataBean("curr $i", i)
            mList.add(bean)
        }
        Log.i("gzy", "mList 的长度为 ${mList.size} mList 的第三个元素年龄为 ${mList[2].age} 姓名为 ${mList[2].name}")

        // map 的使用方式  常用的集合类型 map set list  用法几乎与 java 相同
        val mMap = mutableMapOf<String, String>()
        mMap["1"] = "11111"
        mMap["2"] = "22222"
        mMap["3"] = "33333"
        Log.i("gzy", "mMap 测试结果 长度 = ${mMap.size}  第二个元素的value 为 = ${mMap["2"]}")

        // 初始化 List 和 LinkedList
        listOfAndLinkListOf()

        // 输出 filter 情况
        filter()
        // 分组的情况
        partition()
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
    private fun forOrwhile(list: List<String>, target: Int?) {
        for (l in list.indices) {
            Log.i("gzy", "$l ----${list[l]} ")
        }

        var i = 0
        while (i < list.size) {
            Log.i("gzy", "$i ----${list[i]} ")
            i++
        }

        target?.let {
            when (it) {
                1 -> Log.i("gzy", "target = $it")
                2 -> Log.i("gzy", "target = $it")
                3 -> Log.i("gzy", "target = $it")
                else -> Log.i("gzt", "没有符合要求的条件")
            }
        }
    }

    // 遍历字符串
    private fun seachString(tS: String) {
        for (s in tS.indices) {
            Log.i("gzy", "current s = $s  target = ${tS[s]}")
        }
    }

    // 构造类的构造方法
    private fun newClass() {
        val clss2 = class2("kotlin 类的构造函数")

        val class3 = class3("通过 class 3 初始化class 2")
    }

    override fun foo() {
        super.foo()
        val linkedHashMap = LinkedHashMap<String, String>()
        val hashMap = HashMap<String, String>()
        val mutableMap = mutableMapOf<String, String>()
    }

    // LinkList 和 ArrayList 的构造
    private fun listOfAndLinkListOf() {
        // 构造一个 ArrayList  listOf 不可变  mutableListOf
        val arrList = mutableListOf<String>("1", "2", "3")
        arrList.add("4")
        Log.i("gzy", "arrList length = ${arrList.size}  target = $arrList")

        // 构造一个LinkedList
        val linkList = LinkedList<String>(listOf("One", "Two", "Three"))
        linkList.add("four")
        Log.i("gzy", "arrList length = ${linkList.size}  target = $linkList")
        // 结论初始化方式有点迷。。感觉两种方式都行。

        // 两种循环方式  输出 1~5
        for (i in 1..5) {
            Log.i("gzy", "in range $i")
        }
        // 输出 1~4
        for (i in 1 until 5) {
            Log.i("gzy", "until range $i")
        }
        // 跳步输出 1,3,5,7,9
        for (i in 1..10 step 2) {
            Log.i("gzy", "in range step $i")
        }
        // 倒序输出
        for (i in 10 downTo 1 step 2) {
            Log.i("gzy", "in range down $i")
        }
    }

    // 集合 filter 系列
    private fun filter() {
        val numbers = listOf("one", "two", "three", "four")
        // 原来是什么，现在就是什么 如: 以前是ListOf , longerThan3 也是ListOf
        val longerThan3 = numbers.filter { it.length > 3 }
        Log.i("gzy", "numbers 过滤 $longerThan3")

        val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
        // 这里相当于限制条件 找 key 最后以 1 结尾的 且 value 值大于 10 的
        val filteredMap = numbersMap.filter { it.key.endsWith("1") && it.value > 10 }
        Log.i("gzy", "numbersMap 过滤 $filteredMap")
    }

    private fun partition(){
        val numbers = listOf("one", "two", "three", "four")
        // 符合条件的给添加给 match , 不符合条件的添加给 rest
        val (match, rest) = numbers.partition { it.length > 3 }
        Log.i("gzy", "numbers partition 1  $match")
        Log.i("gzy", "numbers partition 2 $rest")
    }

}
