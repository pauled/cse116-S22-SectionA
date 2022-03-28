package LO3_functionalProgamming

object runMergeSort {
  def mergeSort[T](inputData:List[T],comparator:(T,T)=>Boolean):
    List[T]={
    if (inputData.length<2){
      inputData
    } else {
      val mid:Int=inputData.length/2
      val (left,right)=inputData.splitAt(mid)
      val leftSorted=mergeSort(left,comparator)
      val rightSorted=mergeSort(right,comparator)
      merge(leftSorted,rightSorted,comparator)
    }
  }
  def merge[T](left:List[T],right:List[T],
               comparator:(T,T)=>Boolean):List[T]={
    var leftPointer=0
    var rightPinter=0
    var sortedList:List[T]=List()
    while(leftPointer<left.length && rightPinter<right.length){
      if (comparator(left.apply(leftPointer),
        right.apply(rightPinter))){
        sortedList=sortedList:+left.apply(leftPointer)
        leftPointer+=1
      } else {
        sortedList=sortedList:+right.apply(rightPinter)
        rightPinter+=1
      }
    }
    while (leftPointer<left.length){
      sortedList=sortedList:+left.apply(leftPointer)
      leftPointer+=1
    }
    while (rightPinter<right.length){
      sortedList=sortedList:+right.apply(rightPinter)
      rightPinter+=1
    }
    sortedList
  }

  def main(args: Array[String]): Unit = {
    val unsorted:List[Int]=List(3,4,8,7,9,1,2,7,5,3,8)
    val sorted=mergeSort(unsorted,(a:Int,b:Int)=>a>b)
    println(sorted)
  }
}
