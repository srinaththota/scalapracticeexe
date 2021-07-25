object LowerBoundExe {

  def method(): Unit ={
    val principal=new Principal
    val teacher = new Teacher
    val student = new Student

    val school =new School
   // school.display(principal)
    school.display(teacher)
    school.display(student)
  }
}

class Principal
class Teacher extends Principal
class Student extends Teacher

class School{
  def display[T <: Teacher](t:T): Unit ={
    println(t)
  }
}