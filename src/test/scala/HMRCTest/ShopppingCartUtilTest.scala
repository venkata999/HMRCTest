package HMRCTest

/**
  * Created by venkatamutyala on 21/03/2018.
  */

import org.scalatest.{Matchers, WordSpecLike}

class ShopppingCartUtilTest extends WordSpecLike with Matchers {

  "Shopping Cart Util " should {

    val appleCost = ShopppingCartUtil.apple
    val orangeCost = ShopppingCartUtil.orange

    "accept the value of Apple" in {
      appleCost shouldBe 60
    }

    "reject the value of Apple" in {
      appleCost should not be 75
    }

    "accept the value of Orange" in {
      orangeCost shouldBe 25
    }

    "reject the value of Orange" in {
      orangeCost should not be 55
    }


  }
}

