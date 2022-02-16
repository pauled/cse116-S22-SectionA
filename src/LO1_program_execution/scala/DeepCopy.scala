package LO1_program_execution.scala

object DeepCopy {
  def copyArray(arrIn:Array[Int]):Array[Int]={
    //var out:Array[Int]=new Array[Int](arrIn.length)
    var out:Array[Int]=Array.fill(3)(0)
    for (index <- arrIn.indices){
      out(index)=arrIn(index)
    }
    out
  }

  def main(args: Array[String]): Unit = {
    var arr1:Array[Int]=Array(2,4,8)
    var arr2:Array[Int]=arr1
    var arr3=copyArray(arr1)
    arr2(1)=13
    println("arr1: "+arr1.mkString(","))
    println("arr2: "+arr2.mkString(","))
    println("arr3: "+arr3.mkString(","))
  }

}
