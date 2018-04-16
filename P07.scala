

package s99Package

object P07 {
  def main(args: Array[String]) = {
    var my_list_of_lists = List(List(1,2,3),List(3,4,5),List(6),List(7,8,9,10),List())
    print(my_list_of_lists.flatMap(x => x))
  }
}