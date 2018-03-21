package HMRCTest

/**
  * Created by venkatamutyala on 21/03/2018.
  */

object ShoppingCart {

  val listOfItems = ShopppingCartUtil.listofitems

  def main ( args: Array[String]): Unit = {

    checkOutWithoutOffers()
    checkOutWithOffers()
  }

  /** Step 1: Shopping cart **/
  def checkOutWithoutOffers() = {

    /* Without offers */
    val listOfItemObjs = listOfItems.map{itm=> ShopItem.unapply(itm)}.flatten
    val total = listOfItemObjs.map{i=>i.cost}.sum
    println(s"** Total (Without Offer): ${decimalFormat(total)}")
    total
  }

  /** Step 2: Simple offers **/
  def checkOutWithOffers() ={

    /* Without offers */
    val listOfItemObjs = listOfItems.map{itm=> ShopItem.unapply(itm)}.flatten
    val totalWithoutOffer = listOfItemObjs.map{i=>i.cost}.sum

    /* Apply Buy1Get1Free and 3ForPriceOf2 offers */
    val buyOneGetOneFreeOfferValue = applyBuyOneGetOneFree(Apple.cost, getTotalItems("apple", listOfItemObjs))
    val threeForThePriceOfTwoValue = applyThreeForThePriceOfTwo(Orange.cost, getTotalItems("orange", listOfItemObjs))
    val total = totalWithoutOffer - buyOneGetOneFreeOfferValue - threeForThePriceOfTwoValue

    println(s"** There are ${getTotalItems("apple", listOfItemObjs)} apples and ${getTotalItems("orange", listOfItemObjs)} oranges in the Basket")

    println(s"** Total (With Apples Buy1Get1Free and Oranges 3ForPriceOf2 Offers): ${decimalFormat(total)}")
    total
  }

  def getTotalItems(itemType: String, listofitems: List[ShopItem]) =
    listofitems.filter(_.name.equals(itemType)).toList.size

  def applyBuyOneGetOneFree(unitPrice: Int, totalItems: Int): Int =
    (totalItems / 2) * unitPrice

  def applyThreeForThePriceOfTwo(unitPrice: Int, totalItems: Int): Int =
    (totalItems / 3) * unitPrice

  def decimalFormat(value: Int) = {

    val dblVal: Double = value / 100.0
    f"£$dblVal%2.2f"
  }

}
