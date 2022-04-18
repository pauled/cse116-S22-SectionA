package LO4_dataStructures

class Card (suit:String,number:Int){
  override def toString: String = {
    if (number<=10 && number>1){
      number.toString+" of "+this.suit
    } else if (number==1){
      "Ace of "+this.suit
    }   else if (number==11){
      "Jack of "+this.suit
    } else if (number==12){
      "Queen of "+this.suit
    } else {
      "King of "+this.suit
    }
  }
}
