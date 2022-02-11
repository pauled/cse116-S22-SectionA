package LO1Tests.scala

import org.scalatest.FunSuite
import LO1_program_execution.scala._

class TestConditional extends FunSuite{
  test("Tests for computersize"){
    val largeDouble:List[Double]=List(70.0,60.0,60.01,90.0,1000.0)
    val mediumDouble:List[Double]=List(59.9,30.0,30.1,40.0,50.0)
    val smallDouble:List[Double]=List(29.99,20.0,10.0,0.0,-1000)
    val allTests:Map[Double,String]=Map(
      70.0->"large",
      60.0->"large",
      59.9->"medium")

    for ((key,value)<-allTests){
      assert(Conditional.computeSize(key)==value,"Given: "+key+
        " expected: "+value+"got: "+Conditional.computeSize(key))
    }
    for (largeValues <- largeDouble) {
      assert(Conditional.computeSize(largeValues) == "large", largeValues)
    }
    for (mediumValue <- mediumDouble) {
      assert(Conditional.computeSize(mediumValue) == "medium", mediumValue)
    }
    for (smallValue <- smallDouble) {
      assert(Conditional.computeSize(smallValue) == "small", smallValue)
    }
  }

}
