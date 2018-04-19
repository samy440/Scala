

package s99Package

object P13 {
  def encodeDirect(ls: List[Symbol]): List[(Int, Symbol)] = {
    ls match {
      case Nil => throw new NoSuchElementException
      case x :: Nil => List((1, x))
      case x :: xs => 
        var list_so_far = encodeDirect(xs)
        var (last_int_seen, last_symbol_seen) = list_so_far.head
        if (x == last_symbol_seen)
          list_so_far.updated(0, (last_int_seen+1, last_symbol_seen))
        else
          (1, x)::list_so_far
    }
  }
  def main(args: Array[String]) = {
    print(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}