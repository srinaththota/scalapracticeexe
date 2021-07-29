object ScalaEitherExe {

  def method(name:String): Either[String,String] ={

    if(name.equals("Sri")){
      Left("half name")
    }else {
      Right("Full name")
    }
  }
}
