

package s99Package 

object P19 {
  
  def rotate(n: Int, ls: List[Any]): List[Any] = {
    (n, ls) match {
      case (_, Nil) => Nil
      case (0, _) => ls
      case (_, x :: xs) => 
        if (n > 0) rotate(n-1, xs) :+ x
        else rotate((-n), ls.reverse).reverse
    }
  }
  
  def main(args: Array[String]) = {
    println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    print(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}