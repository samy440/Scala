

package s99Package

object P10 {
  
  def encode(ls: List[Any]): List[(Int, Any)] = {
    var packaged_list = s99Package.P09.pack(ls)
    // packaged_list.map(e => summarize(e))
    packaged_list.map(e => (s99Package.P04.getListSize(e), e.head))
  }
  def summarize(ls: List[Any]): (Int, Any) = {
    (s99Package.P04.getListSize(ls), (ls.head))
  }
  def main(args: Array[String]) = {
    print(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}