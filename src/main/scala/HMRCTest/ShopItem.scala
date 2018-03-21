package HMRCTest

/**
  * Created by venkatamutyala on 21/03/2018.
  */

trait ShopItem {
  def name: String
  def cost: Int
}

object ShopItem {

  def unapply(itm:String): Option[ShopItem] = {
    itm match {
      case Apple.name => Some(Apple)
      case Orange.name => Some(Orange)
      case _ => None
    }
  }
}

case object Apple extends ShopItem {
  override val name: String =  "apple"
  override val cost: Int =  ShopppingCartUtil.apple
}

case object Orange extends ShopItem {
  override val name: String =  "orange"
  override val cost: Int =  ShopppingCartUtil.orange
}