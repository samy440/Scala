

object P02 {
  def penultimate[A](ls: List[A]): A = {
    ls match {
      case x :: y :: Nil => x
      case x :: y :: xs => penultimate(y::xs)
      case _ => throw new NoSuchElementException
    }
  }
  def main(args: Array[String]) = {
    var my_list = List()
    println(penultimate(my_list))
  }
}