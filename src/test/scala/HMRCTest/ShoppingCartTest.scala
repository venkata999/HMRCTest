package HMRCTest

/**
  * Created by venkatamutyala on 21/03/2018.
  */

import org.scalatest.{Matchers, WordSpecLike}

class ShoppingCartTest extends WordSpecLike with Matchers {

  "The total shop item values from Shoppping Cart" should {

    "accept the Total Items value without Offer in pence" in {
      ShoppingCart.checkOutWithoutOffers() shouldBe 280
    }

    "reject the Total Items value without Offer in pence" in {
      ShoppingCart.checkOutWithoutOffers() should not be 180
    }

    "accept the Total Items value with Offer in pence " in {
      ShoppingCart.checkOutWithOffers() shouldBe 195
    }

    "reject the Total Items value with Offer in pence " in {
      ShoppingCart.checkOutWithOffers() should not be 180
    }

    "generate the correct Total Items value without Offer " in {
      ShoppingCart.decimalFormat(ShoppingCart.checkOutWithoutOffers()) shouldBe "£2.80"
    }

    "generate the correct Total Items value with Offer " in {
      ShoppingCart.decimalFormat(ShoppingCart.checkOutWithOffers()) shouldBe "£1.95"
    }

  }

}

