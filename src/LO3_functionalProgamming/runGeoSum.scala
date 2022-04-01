package LO3_functionalProgamming

object runGeoSum {
  def computeGemometricSum(n: Int):Int ={
    if (n<1){
      0
    } else {
      //n+computeGemometricSum(n-1)
      var result:Int=computeGemometricSum(n-1)
      result+=n
      result
    }
  }
  def add(a:Int,b:Int):Int={
    if (b==0){
      a
    } else {
      add(a+1,b-1)
    }
  }
  def subtract(a:Int,b:Int):Int={
    if (b==0){
      a
    } else if (b<0){
      subtract(a+1,b+1)
    } else {
      subtract(a-1,b-1)
    }
  }
  def fib(n:Int):Int={
    if (n==1){
      0
    } else if(n==2){
      1
    } else {
      fib(n-1)+fib(n-2)
    }
  }
  def acronymTail(arr:Array[String],loc:Int,
                  out:String):String={
    if (loc==arr.length){
      out
    } else {
      acronymTail(arr,loc+1,out+arr(loc).slice(0,1))
    }
  }
  def acronym(strings: Array[String]):String={
    acronymTail(strings,0,"")
  }
  def recursiveReverseString(strIn: String):String={
    if (strIn.length==0){
      ""
    } else {
     // recursiveReverseString(
     //   strIn.slice(1,strIn.length))+strIn.slice(0,1)
      var out:String=recursiveReverseString(
        strIn.slice(1,strIn.length))
      out+=strIn.slice(0,1)
      out
    }
  }
  def recursiveReverseStringTail(strIn: String,
                                 acc:String):String={
    if (strIn.length==0){
      acc
    } else {
      recursiveReverseStringTail(
        strIn.slice(1,strIn.length),
        strIn.slice(0,1)+acc)
    }
  }
  def recursiveReverseStringTailHelper(strIn:String):
    String={
    recursiveReverseStringTail(strIn,"")
  }

  def main(args: Array[String]): Unit = {
    val result=computeGemometricSum(4)
    println(result)
    val words:Array[String]=Array("Frigged","Up",
      "Beyond","All","Recognition")
    val acc=acronym(words)
    println(acc)

    var strOut:String=recursiveReverseString("fun")
    println(strOut)
    val strOut2=recursiveReverseStringTailHelper(
      "fun")
    println(strOut2)
  }
}
