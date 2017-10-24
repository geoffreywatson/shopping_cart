
/**
  * A simple shopping cart is initialized with a list of Fruit objects. Alternatively the cart could be initially empty
  * and then Fruit objects added to it individually (not implemented). On checkout the value of the objects is returned.
  * @param contents
  */
case class Cart(contents:List[Fruit]) {

  def checkout:BigDecimal = {
    contents.map(x=>x.price).sum
  }


}
