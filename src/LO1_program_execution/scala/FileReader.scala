package LO1_program_execution.scala

import scala.io.{BufferedSource,Source}

object FileReader {
  def convertFileToString(filename: String) : String={
    var contents: String=""
    val file: BufferedSource=Source.fromFile(filename)
    for (line <- file.getLines()){
      contents+=line+"\n"
    }
    contents
  }

  def main(args: Array[String]): Unit = {
    var content=convertFileToString("Data/temp.txt")
  }
}
