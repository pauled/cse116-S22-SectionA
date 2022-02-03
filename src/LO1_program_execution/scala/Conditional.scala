package LO1_program_execution.scala

object Conditional {
  def computeSize(input: Double): String={
    val large: Double=60.0
    val medium: Double=30.0
    var out: String=""

    if(input>=large){
      out="large"
    } else if (input>=medium){
      out="medium"
    } else {
      out="small"
    }
    out
  }

  def main(args: Array[String]): Unit = {
    println(computeSize(70.0))
    println(computeSize(50.0))
    println(computeSize(10.0))
  }

}
