

package s99Package

object P06 {
  def checkForPalindrome[A](ls: List[A]): Boolean = {
    var reversed_list = recursiveListReverse(ls)
    ls == reversed_list
  }
  
  def recursiveListReverse[A](ls: List[A]): List[A] = {
    ls match {
      case x :: Nil => List(x)
      case x :: xs => recursiveListReverse(xs) ++ List(x)
      case Nil => ls
    }
  }
  
  def main(args: Array[String]) = {
    var my_list = List(1,2,3,4,3,2,1,0)
    print(checkForPalindrome(my_list))
  }
}