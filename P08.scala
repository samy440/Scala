

package s99Package

object P08 {
  
  def compress[Any](ls: List[Any]): List[Any] = {
    ls match {
      case x :: y :: rest => 
        if (x == y) compress(x :: rest)
        else x :: compress(y :: rest)
      case x :: Nil => List(x)
      case _ => List()
    }
  }
  
  def main(args: Array[String]) = {
    print(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) )
  }
}