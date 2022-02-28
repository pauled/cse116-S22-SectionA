package LO2_OOP

class GameObject (var xLoc:Double,var yLoc:Double){
  def move(dx: Double,yLoc:Double):Unit={
    this.xLoc=dx
    this.yLoc=yLoc
  }
  override def toString():String={
    var out:String="xLocation: "+this.xLoc
    out+=" yLocation: "+this.yLoc
    out
  }
}
