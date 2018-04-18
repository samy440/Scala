

package s99Package

object P09 {
  
  def pack(ls: List[Any]): List[List[Any]] = {
    ls match {
      case Nil => List((Nil))
      case x :: Nil => List(List(x))
      case x :: xs => 
        var compacted_list_so_far = pack(xs)
        if (x == compacted_list_so_far.head.head)
          (x :: compacted_list_so_far.head)::compacted_list_so_far.tail// Need to fix this
        else
          List(x)::compacted_list_so_far
    }
  }
  
  def main(args: Array[String]) = {
    print(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}