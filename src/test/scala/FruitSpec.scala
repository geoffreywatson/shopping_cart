import org.scalatest._

class FruitSpec extends FlatSpec with Matchers {

  "An Apple" should "have a price of 60p" in {
    Apple.price should be (.60)
  }

  "An Orange" should "have a price of 25p" in {
    Orange.price should be (.25)
  }


}
