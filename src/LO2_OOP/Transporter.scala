package LO2_OOP

class Transporter (xLoc:Double,yLoc:Double,
                   dx:Double,dy:Double)
    extends GameItem (xLoc,yLoc){
  override def use(player: Player): Unit = {
    player.yLoc+=dy
    player.xLoc+=dx
  }
}
