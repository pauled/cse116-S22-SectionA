package LO2_OOP

abstract class GameItem (var  xLoc1:Double, yLoc1:Double)
  extends GameObject (xLoc1,yLoc1){
  def use(player:Player):Unit

}
