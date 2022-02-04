package LO1_program_execution.scala

object FirstObject {
  def multiplyByTwo(input: Double) : Double = {
    input*2.0
  }
  def computePercentTrue(str: String) : Double={
    var splits: Array[String]=str.split(";")
    var total:Double =0
    var trues:Double =0
    println(splits(1))

    for (value <- splits){
      val valueAsBoolean: Boolean=value.toBoolean
      if (valueAsBoolean){
        trues+=1
      }
      total+=1
    }
    trues/total
  }


  def main(args: Array[String]): Unit = {
    var testInput:String="true;false;true;true;true"
    var percentTrue=computePercentTrue(testInput)
    println(percentTrue)
    /*var x: Double=7.0
    var result=multiplyByTwo(x)
    println(result)

    println("5/4=>"+(5/4))
    var aInt: Int=13
    var aDouble: Double=5.8
    var aBoolean: Boolean=true
    var aString: String="6.3"

    var anotherDouble: Double=aString.toDouble
    var anotherString: String=aInt.toString
    aInt+=4
    println(aInt)
    for (i <- 1 to 4){
      println("i=="+i)
    }*/

  }

}
