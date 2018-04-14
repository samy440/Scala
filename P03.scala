

package s99Package

object P03 {
  
  def fetchNthElement[A](n: Int, ls: List[A]): A = {
    if (n < 0) throw new NoSuchElementException
    else if (n > 0) 
      ls match {
        case x :: Nil => throw new NoSuchElementException
        case x :: xs => fetchNthElement((n - 1), xs)
        case _ => throw new NoSuchElementException
      }
    else ls.head
  }
  
  def main(args: Array[String]) = {
    val my_list = List(1,2,3,4,5,6,7)
    println(fetchNthElement(6, my_list))
  }
}