package LO2_statePattern

class Chillin (brain2:Student) extends State (brain2){
  override def study(): Unit = {
    println("I am such a good student")
  }
  override def getCloserToExam(): Unit = {
    println("Who am I kidding, no more exams")
  }
  override def expressFeelings(): Unit = {
    println("I am a such a massive leaf on the wind")
  }
}

