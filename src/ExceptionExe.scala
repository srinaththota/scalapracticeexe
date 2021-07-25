object ExceptionExe {

  def method(): Unit ={
    try{
      val i=5/0
    }
    catch {
      case i:ArithmeticException => println("arithmatic exception")
    }
  }
}
