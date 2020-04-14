package study.zdf.kotlinfirst.base

/**
 * @author ZhengDeFeng
 * @description:
 * @date :2019/7/23 8:12
 */
class washMachine(var Mode:String,var size:Int){
    fun openDoor(){
        println("打开门")
    }
    fun closeDoor(){
        println("关门操作")
    }
    fun startWash(){
        println("防水")
        println("洗衣服")
        println("洗完了")
    }
}
