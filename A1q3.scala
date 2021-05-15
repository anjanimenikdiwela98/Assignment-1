object q3Cost extends App{
  def cost(x: Int) : Double = {
    var totCoverPri: Double = x*24.95;
    var discount : Double = (totCoverPri *40.0)/100.0;
    var shippCost : Double = if(x>50){50.0*3.0 + 0.75*(x - 50)} else x * 3.0;

    return totCoverPri - discount + shippCost;
  }
  println(cost(60));

}
