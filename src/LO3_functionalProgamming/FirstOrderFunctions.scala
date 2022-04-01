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
                    comparator:(Int,Int)=>Boolean): Array[Int]={
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
  def selectionSortGeneral[T](inputData:Array[T],
                    comparator:(T,T)=>Boolean):
  Array[T]= {
    var out: Array[T] = inputData.clone()
    var min: Int = 0
    var temp: T = out(0)

    for (i <- out.indices) {
      min = i
      for (j <- i + 1 until out.length) {
        if (comparator(out(j), out(min))) {
          min = j
        }
      }
      temp = out(i)
      out(i) = out(min)
      out(min) = temp

    }
    out
  }
  /*
  def distance(v1: PhysicsVector,v2: PhysicsVector):Double={
    Math.sqrt(Math.pow(v1.x-v2.x)+
      Math.pow(v1.y-v2.y)+
      Math.pow(v1.z-v2.z))
  }
  def distanceComparator(referencePoint:PhysicsVector):
     (PhysicsVector,PhysicsVector) => Boolean= {
        distance(v1, referencePoint) < distance(v2, referenePoint)
      }
  }*/

  def main(args: Array[String]): Unit = {
    /*val myWork=new PhysicsVector(0,0,0)
    val sortForMyWork=distanceComparator(myWork)
    val distances=selectionSortGeneral(houseLocations,sortForMyWork)*/
    var numbers=List(5,-23,7,-8,4,10)
    val sorted=numbers.sortWith(_>_)
    //val sorted=numbers.sortWith(  )
    println(sorted)
    var numbers2:Array[Int]=Array(4,3,5)
    //var out=selectionSortGeneral(numbers2,compare)
    //var out=selectionSortGeneral(numbers2,(a:Int,b:Int)=>a<b)
    var compare2:(Int,Int)=> Boolean=(a:Int,b:Int)=>a<b
    var out=selectionSortGeneral(numbers2,compare2)
    println(out.mkString(" "))

    numbers.foreach(println)
    val words:List[String]=List("one","two","three","four")
    val greater=(a:String) => a.length>3
    val filteredWords:List[String]=words.filter(greater)
    val filteredWords2:List[String]=words.filter(_.length>3)
    filteredWords.foreach(println)

    val numbers3:List[Double]=List(1.0,2.0,3.0,4.0)
    val numbersSquared:List[Double]=numbers3.map((Math.pow(_,2.0)))
    numbersSquared.foreach(println)
    //yield
    val numbersSquared2:List[Double]=(for(number<-numbers3) yield {
      Math.pow(number,2.0)
    }).toList
    numbersSquared2.foreach(println)
    //reduce
    var sumSquares:(Double,Double)=>Double=
      (acc:Double,b:Double)=>acc+Math.pow(b,2.0)
    var sumofsquares:Double=numbers3.reduce(_+Math.pow(_,2.0))
    var sumofsquares2:Double=numbers3.reduce(sumSquares)
    println(sumofsquares)
    //fold
    var mathStuff:Double=numbers3.fold(1.0)(_*Math.pow(_,2.0))
    println(mathStuff)
    //sum
    println(numbers3.sum)
    //distinct
    val numbers4:List[Int]=List(1,1,2,3,3,3,4,4,5,6,7,8,8,8,8)
    val distinctVal=numbers4.distinct
    println(distinctVal)
    //slice
    println(numbers4.slice(2,7))
    //reverse

  }

}
