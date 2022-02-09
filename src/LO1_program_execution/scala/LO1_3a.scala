package LO1_program_execution.scala

object LO1_3a {
  def reverseReturn(arrIn: Array[Int]):Array[Int]={
    var out:Array[Int]=new Array[Int](arrIn.length)
    for (i <- 0 until arrIn.length){
      out(out.length-1-i)=arrIn(i)
    }
    out
  }
  def reverse(arrIn: Array[Int]):Unit={
    for (i <- 0 until arrIn.length/2){
      var temp=arrIn(arrIn.length-1-i)
      arrIn(arrIn.length-1-i)=arrIn(i)

      arrIn(i)=temp
    }

  }

  def main(args: Array[String]): Unit = {
    var arr:Array[Int]=Array(1,2,3)
    var arr2=reverseReturn(arr)
    for (value <- arr2){
      println(value)
    }
    println("arr")
    for (value <- arr){
      println(value)
    }
    reverse(arr)
    println("arr")
    for (value <- arr){
      println(value)
    }
  }
}
