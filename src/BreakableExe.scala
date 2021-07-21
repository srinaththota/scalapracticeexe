import scala.util.control._
class BreakableExe {

  def breakableExample():Unit ={
    val check = new Breaks
    check.breakable {
      for (i <- 1 to 5) {
        if (i == 3) {
          check.break()
        }
        println(i)
      }
    }
  }
}
