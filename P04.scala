

package s99Package

object P04 {
  def getListSize[A](ls: List[A]): Int = {
    ls match {
      case x :: Nil => 1
      case x :: xs => 1 + getListSize(xs)
      case Nil => 0
    }
  }
  
  def main(args: Array[String]) = {
    val my_list = List(1,2,3,4,5)
    print(getListSize(my_list))
  }
}