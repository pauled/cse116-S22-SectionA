package LO1_program_execution.scala

object LO1_5_testing {
  def main(args: Array[String]): Unit = {
    var temp:Double=0.0
    temp+=.1
    temp+=.1
    temp+=.1
    println("temp="+temp)
    assert(Math.abs(temp-.3)<.000001,"doubles are equal")
    var map1:Map[Int,Int]=Map(
      1->2,
      2->4,
      3->8
    )
    var map2:Map[Int,Int]=Map(
      2->4,
      1->2,
      3->8
    )
    println("Are maps equal"+(map1==map2))
    var list1:List[Int]=List(1,2,3)
    var list2:List[Int]=List(3,2,1)
    println("Are lists equal: "+(list1.sorted==list2.sorted))
    println(list2)
  }
}
