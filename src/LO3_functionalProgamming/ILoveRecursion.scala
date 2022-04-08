package LO3_functionalProgamming

object ILoveRecursion {
  //total values in an array[Int]
  def totalValue(ints: Array[Int]):Int={
    totalValueStep(ints,0)
  }
  def totalValueStep(ints:Array[Int],loc:Int):Int={
    if (loc==ints.length){
      0
    } else {
      totalValueStep(ints,loc+1)+ints(loc)
    }
  }
  def totalValueT(ints: Array[Int]):Int={
    totalValueStepT(ints,0,0)
  }
  def totalValueStepT(ints:Array[Int],
                      loc:Int,total:Int):Int={
    if (loc==ints.length){
      total
    } else {
      totalValueStepT(ints,loc+1,total+ints(loc))
    }
  }
  def averageValueStepT(ints:Array[Int],
                      loc:Int,total:Int):Double={
    if (loc==ints.length){
      total.toDouble/ints.length.toDouble
    } else {
      averageValueStepT(ints,loc+1,total+ints(loc))
    }
  }
  def getAverage(ints: Array[Int]):Double={
    totalValue(ints).toDouble/ints.length.toDouble
  }
  //average values in an array[Int]
  //search for a value in an array recursively[Int]
  def search(ints: Array[Int], value:Int):Boolean= {
    searchHelp(ints, value,0)
  }
  def searchHelp(ints:Array[Int],value:Int,
                 loc:Int):Boolean={
    if (loc==ints.length){
      false
    } else if (value==ints(loc)){
      true
    } else {
      searchHelp(ints,value,loc+1)
    }
  }

  def main(args: Array[String]): Unit = {
    var nums:Array[Int]=Array(1,2,3,4,5)
    val total=totalValue(nums)
    println(total)
    var average=getAverage(nums)
    println(search(nums,3))
  }
}
