package LO2_statePattern

class Student {
  var mentalState:State=new Calm(this)

  def study():Unit={
    this.mentalState.study()
  }
  def getCloserToExam():Unit={
    this.mentalState.getCloserToExam()
  }
  def expressFeelings():Unit={
    this.mentalState.expressFeelings()
  }
  def passClass():Unit={
    this.mentalState=new Chillin(this)
  }
  def startNewClass():Unit={
    this.mentalState=new Calm(this)
  }
}
