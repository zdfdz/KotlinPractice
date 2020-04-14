package study.zdf.kotlinfirst.weituoAndDaili

import study.zdf.kotlinfirst.weituoAndDaili.BigHeadSon as BigHeadSon1

/**
 * @author ZhengDeFeng
 * @description:
 * @date :2019/7/23 21:51
 */
class SmallHeadFather :wishBow by study.zdf.kotlinfirst.weituoAndDaili.BigHeadSon(){
    override fun zhuanqian() {
        println("我赚了十块钱 嘿嘿嘿")
        study.zdf.kotlinfirst.weituoAndDaili.BigHeadSon().zhuanqian()
        println("我看着大头儿子把洗完")
    }

}