
/**
  * A simple shopping cart is initialized with a list of Fruit objects. Alternatively the cart could be initially empty
  * and then Fruit objects added to it individually (not implemented). On checkout the value of the objects is returned.
  * @param contents
  */
case class Cart(contents:List[Fruit]) {

  def checkout:BigDecimal = {
    contents.map(x=>x.price).sum
  }


  // 2 for the price of 1 for apples and 3 for the price of two for oranges
  def checkoutSpecialOffer:BigDecimal ={
    def sort(fruit:List[Any],oc:Int,ac:Int):(Int,Int)= fruit match {
      case Nil => (oc,ac)
      case hd :: tl => hd match {
        case Orange => sort(fruit.tail,oc + 1, ac)
        case Apple => sort(fruit.tail,oc, ac + 1)
      }
    }
    val fruitCount = sort(contents,0,0)
    val oranges = fruitCount._1
    val apples = fruitCount._2
    var totalValue:BigDecimal = 0
    totalValue = (apples/2 + apples%2 * Apple.price) + (oranges/3 * Orange.price * 2 + oranges%3 * Orange.price)
    totalValue
}
