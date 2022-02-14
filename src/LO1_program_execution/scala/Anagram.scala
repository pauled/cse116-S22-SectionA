package LO1_program_execution.scala

object Anagram {
  def isAnagram(word1:String,word2:String): Boolean={
    var cleanWord1:List[String]=List()
    var cleanWord2:List[String]=List()
    for (letter<-word1.toLowerCase){
      if (letter.isLetter){
        cleanWord1=cleanWord1:+letter.toString
      }
    }
    for (letter<-word2.toLowerCase){
      if (letter.isLetter){
        cleanWord2=cleanWord2:+letter.toString
      }
    }

    cleanWord1.sorted==cleanWord2.sorted
  }
}
