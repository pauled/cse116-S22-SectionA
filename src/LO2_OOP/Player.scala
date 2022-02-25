package LO2_OOP

class Player (var xLoc:Double,var yLoc:Double,
              var maxHitPoints:Int){
  var health:Int=this.maxHitPoints
  val damageDealt:Int=4

  def attack(otherPlayer: Player):Unit={
    otherPlayer.takeDamage(this.damageDealt)
  }
  def takeDamage(damage: Int):Unit={
    this.health-=damage
  }
  def move(dx: Double,yLoc:Double):Unit={
    this.xLoc=dx
    this.yLoc=yLoc
  }
  override def toString():String={
    var out:String="xLocation: "+this.xLoc
    out+=" yLocation: "+this.yLoc+" health: "
    out+=this.health+"/"+this.maxHitPoints
    out
  }
}
