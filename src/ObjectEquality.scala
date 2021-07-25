case class ObjectTest(val name:String,val age:Int)
object ObjectEquality {
def method():Unit={
  val obj1=ObjectTest("Srinath",30)
  val obj2=ObjectTest("Srinath",30)

  println(obj1.equals(obj2))
  println(obj1 == obj2)
}
}
