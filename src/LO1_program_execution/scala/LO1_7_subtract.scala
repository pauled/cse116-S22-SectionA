package LO1_program_execution.scala

object LO1_7_subtract {
  def subtract(x:Int,y:Int):Int={
    var z:Int=x
    for (i<-0 until Math.abs(y)){
      val x:Int=20
      if (y<0){
        val x:Int=1
        z+=x
      } else {
        val x:Int=1
        z-=x
      }
    }
    z
  }

  def main(args: Array[String]): Unit = {
    val x:Int=5
    val y:Int=3
    val z:Int=subtract(x,y)
    println(z)
  }
}
