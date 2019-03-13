object BreakToContinue {
  def main(args: Array[String]): Unit = {
    var i = 0
    import scala.util.control.Breaks._
    while (i <= 9){
      breakable {
//        for (j <- 1 to 1) {
          if (i == 5) {
            break
          }
          print(i + " ")
//        }

      }
      i += 1
    }
  }
}
