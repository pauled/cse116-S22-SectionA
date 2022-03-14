package LO3_functionalProgamming

object FirstOrderFunctions {
  def compare(a:Int,b:Int):Boolean={
    if (a<b){
      true
    } else {
      false
    }
  }
  def selectionSort(inputData:Array[Int],
                    comparator:(Int,Int)=>Boolean):
    Array[Int]={
    var out:Array[Int]=inputData.clone()
    var min:Int=0
    var temp:Int=0

    for (i<-out.indices){
      min=i
      for (j<-i+1 until out.length) {
        if (comparator(out(j), out(min))) {
          min = j
        }
      }
        temp=out(i)
        out(i)=out(min)
        out(min)=temp

    }
    out
  }

  def main(args: Array[String]): Unit = {
    var numbers=List(5,-23,7,-8,4,10)
    //val sorted=numbers.sortWith(_>_)
    val sorted=numbers.sortWith((a:Int,b:Int)=>a>b)
    println(sorted)
    var numbers2:Array[Int]=Array(4,3,5)
    var out=selectionSort(numbers2,compare)
    println(out.mkString(" "))
  }

}
