class InnerClassExe {

  class InnerExe{
    var a=10
    def method(): Unit ={
      for (a <- 0 to 3){
        println (s"printing something is ${a}")
      }
    }
  }
}
