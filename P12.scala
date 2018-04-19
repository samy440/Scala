package s99Package

object P12 {
  
  def decode(ls: List[(Int, Any)]): List[Any] = {
    ls match {
      case x :: Nil => 
        var (num, sign) = x
        List.fill(num)(sign)
      case x :: xs => 
        var (num, sign) = x
        List.fill(num)(sign)++decode(xs)
      case _ => List(Nil)
    }
  }
  
  def main(args: Array[String]) = {
    print(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  }
}