package LO2_OOP

object RunPlayer {
  def main(args: Array[String]): Unit = {
    val player1:Player = new Player(0.0,0.0,
      10)
    val player2:Player=new Player(7.0,-4.0,
      10)
    player1.attack(player2)
    player1.attack(player2)
    val varName:Player=player2
    println(varName)
    var h1:HealthPotion=
      new HealthPotion(0,0,10)
    h1.move(2,3)
    println(h1)
  }
}
