

package s99Package

object P17 { // needed help with this one, mainly because I wasn't sure how to handle the tuples
  def split(n: Int, ls: List[Any]): (List[Any], List[Any]) = {
    (n, ls) match {
      case (_, Nil) => (Nil, Nil)
      case (0, x ::xs) => (Nil, x :: xs)
      case (n, x :: xs) => 
        val (pre, post) = split(n - 1, xs)
        (x :: pre, post)
    }
  }
  
  def splitWithBuiltIns(n: Int, ls: List[Any]): (List[Any], List[Any]) = {
    (ls.take(n), ls.drop(n))
  }

  def main(args: Array[String]) = {
    println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    print(splitWithBuiltIns(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}