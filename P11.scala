

package s99Package

object P11 {
  
  def encode_compactely(ls: List[Any]): List[Any] = {
    var packaged_list = s99Package.P09.pack(ls)
    // packaged_list.map(e => summarize(e))
    packaged_list.map(e => e match {
      case x :: Nil => e.head
      case x :: _ => (s99Package.P04.getListSize(e), e.head)
      case Nil => Nil
    })
    
  }
  def summarize(ls: List[Any]): (Int, Any) = {
    (s99Package.P04.getListSize(ls), (ls.head))
  }
  def main(args: Array[String]) = {
    print(encode_compactely(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}