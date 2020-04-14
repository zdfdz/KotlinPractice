package study.zdf.kotlinfirst.base

/**
 * @author ZhengDeFeng
 * @description:
 * @date :2019/7/21 13:01
 */
fun main() {
    print1start()
    println(" ***")
    println("******")
    println(" ***")
    println("  *")
    var z = true
    val add = printAdd(6, 7)
    println(add)

    println(isAge(19))

    println(printSub(5, 3, null))

    println(whenTest(2))

    var number100 = 1..100
    for (numbers in number100 step 2) {
        println(numbers)
    }

    var lists: List<String> = listOf("周一", "zhouer", "zhousan")
    for (lis in lists.withIndex()) {
        println(lis)

    }

    var maps = HashMap<String, String>()
    maps["1"] = "yi"
    maps["2"] = "er"
    maps["3"] = "san"
    println(maps["1"])

    //函数表达式写法
    var i = { n1: Int, n2: Int -> n1 + n2 }
    println(i(3, 4))

    var j:(Int,Int) -> Int = {x,y ->x+y}
    println(j(3,4))

//    val s = readLine()
//    println(s)
    var zdf:(Int,Int) ->Int = {x,y ->x+y}

    var z1 = Frend("挺好","高雅")
    println("${z1.chactor},${z1.vioce}")
    z1.cry()

}

fun isAge(age: Int): Boolean {
    return age > 18
}

fun print1start() {
    println("  *")
}

fun printAdd(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun printSub(num1: Int, num2: Int, txt: String?): String {
    return (num1 + num2).toString() + txt
}

fun whenTest(num: Int): Any {
    var rs = when (num) {
        1 -> "吃饭"
        2 -> "睡觉"
        3 -> "打豆豆"
        else -> println("error")
    }
    return rs
}

class Frend(var chactor:String,var vioce:String){
    fun cry(){
        println(" cry cry cry")
    }
}


