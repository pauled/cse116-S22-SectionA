package LO2_OOP

class HealthPotion (x:Double,y:Double,
                    var increase:Int)
    extends GameItem (x,y){
  override def use(player: Player): Unit = {
    player.health+=increase
  }
  def increaseStrength(factor:Int):Unit={
    increase*=factor
  }
}
