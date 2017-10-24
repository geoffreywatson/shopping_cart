import org.scalatest._

class SpecialSpec extends FlatSpec with Matchers{

  "4 Apples and 3 Oranges" should "have a value of £1.70" in {
    Cart(List(Apple,Apple,Apple,Apple,Orange,Orange,Orange)).checkoutSpecialOffer should be (1.70)
  }
  
}
