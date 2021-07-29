object HigherOrderExe {

  def hOrder(x:Int=>Int,y:Int): Int ={
  x(y)
  }
  def format(x:Int):Int={
    x+1
  }
  def method(): Int ={
    println(hOrder(format,20))
    hOrder(format,20)
  }
}
