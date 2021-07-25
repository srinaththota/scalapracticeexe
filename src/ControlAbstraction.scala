
object ControlAbstraction extends Enumeration{

  type ControlAbstraction=Value
  val first=Value("First")
    def main(args:Array[String]): Unit ={
      println(ControlAbstraction.values)
      val rangeExe=Range(0,10,2)
      println(rangeExe)
      println(rangeExe(1))
      println(rangeExe.last)
      println("=======================================")
      println("If else Decision Making")
      val x=if(true){ 10 }
      println(x)
    println("========================================")
    // new ConditionExe().ForLoopMethod()
      new BreakableExe().breakableExample()
      println("========================================")
      val outerObj=new InnerClassExe();
      val o=new outerObj.InnerExe
      o.method()
      println("=======================================")
      val arr= Array("Srinath","Thota","Mumbai")
     val values= for(name <- arr;
                     if(lengthOfString(name)))
        yield name
      values.foreach(v=>println(v))
  val SOME_ONE_$_* = "ss"
      println("===================================")
      OverridingExe.method()
      println("===================================")
      CastingExe.method()
      println("================================")
      println("=======object equality===========")
      ObjectEquality.method()
    //  val ww=scala.io.StdIn.readLine();
    //  println(matchingCheck(ww.toInt))
      println("===============================")
      println("====Lower Bound================")
      LowerBoundExe.method()
      println("===============================")
      println("====Arithematic Exception================")
      ExceptionExe.method()

    }
  def lengthOfString(name:String):Boolean ={
    name.length > 6
  }
  def bigStringName(name:String):String ={
    name + "hello"
  }

  def matchingCheck(x:Int):String =x match{
    case 1=>"Hello from srinath1"
    case 2=>"Hello from srinath2"
    case 3=>"hello from default"
  }
}
