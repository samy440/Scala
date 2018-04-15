

package s99Package

object P05 {
  def recursiveListReverse[A](ls: List[A]): List[A] = {
    ls match {
      case x :: Nil => List(x)
      case x :: xs => recursiveListReverse(xs) ++ List(x)
      case Nil => ls
    }
  }
  
  def main(args: Array[String]) = {
    val my_list = List(1,2,3,4,5)
    print(recursiveListReverse(my_list))
  }
}