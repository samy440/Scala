

package s99Package

object P14 {
  
  def duplicate(ls: List[Any]): List[Any] = {
    ls match {
      case Nil => Nil
      case x :: Nil => List(x, x)
      case x :: xs => x :: x :: duplicate(xs)
    }
  }
  
  def main(args: Array[String]) = {
    println(duplicate(List('a, 'b, 'c, 'c, 'd)))
    print(List('a, 'b, 'c, 'c, 'd).flatMap(x => List(x,x)))
  }
}