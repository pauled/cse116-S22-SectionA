package LO1Tests.scala

import LO1_program_execution.scala._
import org.scalatest.FunSuite

class TestIsAnagram extends FunSuite{
  test("Test is Anagram"){
    //combination upper and lower case (true and false)
    //spaces and non-letters
    //whether it actually is or is not an anagram
    //are the same letters repeated
    //check empty string
    val testCases:Map[List[String],Boolean]=Map(
      List("Hello","hello")->true,
      List("hello","HeLLo")->true,
      List("hello","O hell")->true,
      List("hello","98##heoll")->true,
      List("he ll o","HELLO")->true,
      List("*9llohe","hello")->true,
      List("Hello","helo")->false,
      List("hell","Ollh")->false,
      List("9opp","ppo")->true,
      List("o pp","oppp")->false,
      List("this","bob")->false,
      List("opp","oop")->false,
      List("OOp","oop")->true,
      List("","")->true,
      List("p9f","")->false,
      List("","op")->false
    )

    for((inputs,expected)<-testCases){
      assert(Anagram.isAnagram(inputs(0),inputs(1))==expected,"inputs "+
        inputs(0)+" "+inputs(1)+" expected: "+expected)
    }
  }
}
