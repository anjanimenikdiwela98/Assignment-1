object q2Vol extends App{
  def volOfCircle(r: Double) : Double = 
  {
    return (4.0/3.0)*math.Pi*r*r*r;
  }
  println(volOfCircle(5));
}
