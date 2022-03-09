package LO2_OOP

class Player ( xLoc1:Double, yLoc1:Double,
              var maxHitPoints:Int)
    extends GameObject (xLoc1,yLoc1){
  var health:Int=this.maxHitPoints
  val damageDealt:Int=4
  var inventory:Array[GameItem]=new Array[GameItem](5)
  var invSize:Int=0

  def pickUpItem(gameItem: GameItem):Unit={
    if (this.invSize<this.inventory.length) {
      this.inventory(this.invSize) = gameItem
      this.invSize += 1
    }
  }
  def useItem(itemLoc:Int):Unit={
    this.inventory(itemLoc).use(this)
  }
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
