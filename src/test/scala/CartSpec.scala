import org.scalatest._

class CartSpec extends FlatSpec with Matchers{

  "A Cart" should "return the total value of it's contents on checkout" in {
    Cart(List(Orange,Orange,Apple)).checkout should be (1.10)
  }

}
