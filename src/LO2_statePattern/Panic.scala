package LO2_statePattern

class Panic (brain2:Student) extends State (brain2){
  override def study(): Unit = {
    //println("I am already calm")
    brain2.mentalState=new Calm(brain2)
  }
  override def getCloserToExam(): Unit = {
    //brain2.mentalState=new Panic(brain2)
    println("I'm already panicing!")
  }
  override def expressFeelings(): Unit = {
    println("I am stressing out!")
  }
}
