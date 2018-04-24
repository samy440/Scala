

package s99Package

object P18 {
  def slice(i: Int, k: Int, ls: List[Any]): List[Any] = {
    if (i < 0) throw new NoSuchElementException
    else if (k < 0) throw new NoSuchElementException
    else if (k < i) throw new NoSuchElementException
    else (i, k, ls) match {
      case (_, _, Nil) => Nil
      case (0, 1, x :: xs) => List(x)
      case (0, k, x :: xs) => x::slice(0, k-1, xs)
      case (_, _, x :: xs) => slice(i-1, k-1, xs)          
    }
  }
  
  def main(args: Array[String]) = {
    println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}