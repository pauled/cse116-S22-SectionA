package LO1_program_execution.scala

object FirstObject {
  def multiplyByTwo(input: Double) : Double = {
    input*2.0
  }

  def main(args: Array[String]): Unit = {
    var x: Double=7.0
    var result=multiplyByTwo(x)
    println(result)
  }

}
