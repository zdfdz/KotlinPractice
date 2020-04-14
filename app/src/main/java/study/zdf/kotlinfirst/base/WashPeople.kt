package study.zdf.kotlinfirst.base

import study.zdf.kotlinfirst.base.washMachine as washMachine1

/**
 * @author ZhengDeFeng
 * @description:
 * @date :2019/7/23 8:15
 */

fun main(){
    val washMachine = study.zdf.kotlinfirst.base.washMachine("auto", 7)
    washMachine.openDoor()
    washMachine.startWash()
    washMachine.closeDoor()
}