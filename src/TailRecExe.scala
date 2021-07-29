class TailRecExe {

  def method(): Unit ={
    val list:List[Int]=List(1,2,4,3)
    val list2:List[Int]=List()
    val list3:List[Int]=List(0)
    sortedListExe(list2)
    sortedListExe(list3)
  }
  def sortedListExe(list:List[Int]):List[Int]={
    if(list.isEmpty || list.head < 1){
      println("List is empty")
    }
    list
  }
}
