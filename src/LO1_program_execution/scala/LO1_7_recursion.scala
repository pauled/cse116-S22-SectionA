package LO1_program_execution.scala

object LO1_7_recursion {
  def computeGeometricSum(n: Int):Int={
    //if (n>0){
    println("n: "+n)
      var result:Int=computeGeometricSum(n-1)
      result+=n
      result
    /*} else {
      0
    }*/
  }

  def main(args: Array[String]): Unit = {
    val result:Int = computeGeometricSum(3)
    println(result)
  }

}
