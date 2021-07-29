class ScalaCollections {

  def method(): Unit ={
    val aSequence=Seq(1,2,3,4,5)
    println(aSequence.map(_ + 1))
  }

  def listExamples(): Unit ={
    val aList=Seq(1,2,3,4,5)
    val firstEle=aList.head
    val remainging=aList.tail
    println(firstEle)
    println(remainging)
    val a= Seq(6)
    val biggerList=0 +: aList :+ 6
    println(biggerList)
  }
  def arrayExamples(): Unit ={
    val arr=Array(1,2,3,4,5)
    //arr.foreach(i=>println(i))
    val seqArr:Seq[Int]=arr.toIndexedSeq
    seqArr.foreach(_=>println _)
  }

  def smallBenchMark(): Unit ={
    val maxruns=1000
    val maxCapacity=100000
    def getWriteTime(collections:Seq[Int]):Double={
      val ramdom=new scala.util.Random()
      val times= for {
        i <- 1 to 10
      } yield {
        val index = ramdom.nextInt(maxCapacity)
        val element = ramdom.nextInt()
        element
      }
      println("printing here  "+times)
      1.0
    }
    val l:Seq[Int]=(1 to 100).toList
    println(getWriteTime(l))
  }
}
