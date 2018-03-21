package HMRCTest

/**
  * Created by venkatamutyala on 21/03/2018.
  */

import org.scalatest.{Matchers, WordSpecLike}

class ShopItemTest extends WordSpecLike with Matchers {

  "Using ShopItem " should {

    "one can create Apple object for string apple" in {
      ShopItem.unapply("apple") shouldBe Some(Apple)
    }

    "one can create Orange object for string orange" in {
      ShopItem.unapply("orange") shouldBe Some(Orange)
    }

  }
}

