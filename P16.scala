

package s99Package

object P16 {
  def dropNth(n: Int, ls: List[Any]) = {
    def executeDrop(curr_val: Int, cur_list: List[Any]): List[Any] = {
      (curr_val, cur_list) match {
        case (_, Nil) => Nil
        case (1, x :: xs) => executeDrop(n, xs)
        case (_, x :: xs) => x :: executeDrop((curr_val-1), xs)
      }
    }
    executeDrop(n,ls)
  }
  
  def main(args: Array[String]) = {
    print(dropNth(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}