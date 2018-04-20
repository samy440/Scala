

package s99Package

object P15 {
  
  def duplicateN(n:Int, ls: List[Any]) = {
    ls.flatMap(x => List.fill(n)(x))
  }
  
  def main(args: Array[String]) = {
    print(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }
}