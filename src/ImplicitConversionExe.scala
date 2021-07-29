import scala.language.implicitConversions
class ImplicitConversionExe {

  case class Person(name:String){
    def greet:String=s"Hey $name how are you"
  }

  implicit def meth(name:String)=Person(name)
  def method(): Unit ={
   println("Srinath".greet)
  }
}
