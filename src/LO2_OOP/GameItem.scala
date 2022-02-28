package LO2_OOP

abstract class GameItem ( xLoc:Double, yLoc:Double)
  extends GameObject (xLoc,yLoc){
  def use(player:Player):Unit

}
