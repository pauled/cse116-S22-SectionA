package LO1_program_execution.scala

object ArrayListMap {

  def main(args: Array[String]): Unit = {
    var arr: Array[Int]=Array(2,3,4)
    var x:Int=arr(1)
    arr(2)=20
    println(x)
    for (element <- arr){
      println(element)
    }
    for (index <- 0 to arr.length-1){
      arr(index)+=2
    }
    for (index <- arr.indices){
      println(arr(index))
    }

    var list:List[Int]=List(2,3,4)
    var y:Int=list.head
    y=list.apply(1)
    println(y)
    list=list:+50
    list=70::list
    for (element <- list){
      println(element)
    }

    var myMap: Map[Int,Int]=Map(2->4,3->9,4->16)
    myMap=myMap+(5->25)

    for ((key,value) <- myMap){
      println("key: "+key+" value:"+value)
    }
    println(myMap(3))
    println(myMap.getOrElse(100,-1))
  }
}
