

object P01 {
  def recursivelastInList[A](ls: List[A]): A = ls match {
    case x :: Nil => x  
    case x :: xs => recursivelastInList(xs) 
    case _ => throw new NoSuchElementException
  }
  
  
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
   } 
  
  def main(args: Array[String]) = {
    val my_list = List(1,2,3,5,46,8,9,6,4,3,0)
    println(recursivelastInList(my_list))
    println(lastRecursive(my_list))
    println(my_list.last)
  }
}

