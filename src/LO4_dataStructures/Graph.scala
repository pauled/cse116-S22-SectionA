package LO4_dataStructures

class Graph [A]{
  var nodes:Map[Int,A]=Map()
  var adjacencyList:Map[Int,List[Int]]=Map()
  def addNode(index:Int,a:A):Unit={
    nodes+=index->a
    adjacencyList+=index->List()
  }
  def addEdge(index1:Int,index2:Int):Unit={
    adjacencyList+=index1->(index2::adjacencyList(index1))
  }
}
object runGraph{
  def main(args: Array[String]): Unit = {
    val graph:Graph[String]=new Graph()
    graph.addNode(0,"DC" )
    graph.addNode(1,"OLA")
    graph.addNode(2,"MIL")
    graph.addNode(3,"SFA")

    graph.addEdge(0,1)
    graph.addEdge(0,2)
    graph.addEdge(0,3)
    graph.addEdge(1,2)
    graph.addEdge(1,3)
    graph.addEdge(2,0)
    graph.addEdge(2,1)
    graph.addEdge(2,3)
    graph.addEdge(3,1)
    graph.addEdge(3,2)
  }
}
