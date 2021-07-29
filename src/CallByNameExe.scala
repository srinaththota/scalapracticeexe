object CallByNameExe {

  def callByValfunc(x:Int):Unit={
      println(x)
      println(x)
    }

  def callByName(x: => Int):Unit={
  println(x)
    println(x)
  }
  def something():Int={
    println("something")
    1
  }
  def method(): Unit ={
    callByValfunc(something())
    println("----------------")
    callByName(something())
  }


}
