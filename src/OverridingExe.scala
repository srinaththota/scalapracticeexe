class SuperC{
  val description:String="something"
  val number:Int=20;
}
class Base extends SuperC {
  override val description:String ="some new thing"
  override val number:Int=33;
}
object OverridingExe {
def method():Unit={
  val s1=new Base();

  println(s1.description+""+s1.number)
}

}
