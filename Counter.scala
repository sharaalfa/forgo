object Counter {
   def main(args: Array[String]) = {
      var n: Int = 0
      for (line <- scala.io.Source.fromFile(args(0)).getLines()) {
          n = n + 1
      }
      println(n + " " + args(0))
   }
}
