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
    var h2:HealthPotion=
      new HealthPotion(1,2,10)
    var h3=h2
    println("h1==h2:"+(h1==h2))
    println("h2==h3:"+(h2==h3))

    h1.move(2,3)
    println(h1)
    var general:GameItem=new
        Transporter(1,2,3,4)
    var tansp:Transporter=new
        Transporter(5,6,7,8)
    var high:GameObject=new HealthPotion(1,2,10)
    player1.pickUpItem(general)
    player1.pickUpItem(tansp)
    player1.pickUpItem(h1)
  }
}
