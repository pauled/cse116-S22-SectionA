package LO3_functionalProgamming

object Anagram {
  def anagram(input: String):List[String]={
    println("\n"+input)
    if (input.length==1){
      List(input)
    } else {
      val output:List[List[String]]=
        (for (i <- 0 until input.length) yield {
          val newString:String=input.substring(0,i)+
            input.substring(i+1,input.length)
          println("newString: "+newString)
          anagram(newString).map(_+input.charAt(i))
        }).toList
      println(output)
      println(output.flatten.distinct)
      output.flatten.distinct

    }
  }

  def main(args: Array[String]): Unit = {
    var ana=anagram("ab")
    println(ana)
  }
}
