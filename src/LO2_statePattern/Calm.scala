package LO2_statePattern

class Calm (brain2:Student) extends State (brain2){
  override def study(): Unit = {
    println("I am already calm")
  }
  override def getCloserToExam(): Unit = {
    brain2.mentalState=new Panic(brain2)
  }
  override def expressFeelings(): Unit = {
    println("I am a leaf on the wind")
  }
}
