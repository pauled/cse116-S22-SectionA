package LO1_program_execution.scala

object ObjectWithState {
  //state of the object
  var x:Int=10
  var y:Int=7

  def doubleX():Unit={
    this.x*=2
  }

  def main(args: Array[String]): Unit = {
    ObjectWithState.doubleX()
    println(ObjectWithState.x)
  }
}
