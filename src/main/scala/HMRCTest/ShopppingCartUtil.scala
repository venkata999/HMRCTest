package HMRCTest

import java.util.Properties

/**
  * Created by venkatamutyala on 21/03/2018.
  */

object ShopppingCartUtil {
  /** get item values from property file **/
  val (apple:Int, orange:Int, listofitems:List[String]) = {
    try {
      val props = new Properties()
      props.load(getClass.getResourceAsStream("../shoppingcart.properties"))
      (
        new Integer(props.getProperty("apple")),
        new Integer(props.getProperty("orange")),
        props.getProperty("listofitems").split(",").toList
      )
    } catch {
      case e: Exception => e.printStackTrace()
    }
  }
}
