package LO2_OOP

class HealthPotion (x:Double,y:Double,
                    var increase:Int)
    extends GameItem (x,y){
  override def use(player: Player): Unit = {
    player.health+=increase
  }
  def increaseStrength(factor:Int):Unit={
    this.increase*=factor
  }

  override def toString(): String = {
    this.xLoc1
    var out:String="Health potion: "
    out+=super.toString()+" size: "
    out+=this.increase
    out
  }
}
