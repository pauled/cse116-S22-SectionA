package LO2_OOP

class Player ( xLoc:Double, yLoc:Double,
              var maxHitPoints:Int)
    extends GameObject (xLoc,yLoc){
  var health:Int=this.maxHitPoints
  val damageDealt:Int=4

  def attack(otherPlayer: Player):Unit={
    otherPlayer.takeDamage(this.damageDealt)
  }
  def takeDamage(damage: Int):Unit={
    this.health-=damage
  }

  override def toString():String={
    var out:String=super.toString()+" health: "
    out+=this.health+"/"+this.maxHitPoints
    out
  }
}
