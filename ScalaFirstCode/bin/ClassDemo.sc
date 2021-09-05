object ClassDemo {

  case class Student(var rollNo: Int = 1, var name: String = "mudra", var marks: Int = 80) {

    def show() =

      {
        println("hii")
      }

    def >(s2: Student): Boolean = marks > s2.marks
  }

  var s1 = Student(4);                            //> s1  : ClassDemo.Student = Student(4,mudra,80)

  var s2 = Student(name = "Rahul")                //> s2  : ClassDemo.Student = Student(1,Rahul,80)

  var s3 = Student(3, "jai", 85)                  //> s3  : ClassDemo.Student = Student(3,jai,85)
  var s4 = Student(4, "shreya", 88)               //> s4  : ClassDemo.Student = Student(4,shreya,88)

  s1.show()                                       //> hii
  s4 > s3                                         //> res0: Boolean = true

  var nums = List(4, 3, 5, 7, 9, 8);              //> nums  : List[Int] = List(4, 3, 5, 7, 9, 8)
  var reverseNums = nums.reverse                  //> reverseNums  : List[Int] = List(8, 9, 7, 5, 3, 4)
  var dropAndTake = nums drop 2 take 2            //> dropAndTake  : List[Int] = List(5, 7)
  nums.drop(2).take(2)                            //> res1: List[Int] = List(5, 7)
  for (n <- nums) println(n)                      //> 4
                                                  //| 3
                                                  //| 5
                                                  //| 7
                                                  //| 9
                                                  //| 8
  nums.foreach { i: Int => println(i) }           //> 4
                                                  //| 3
                                                  //| 5
                                                  //| 7
                                                  //| 9
                                                  //| 8

  reverseNums.foreach { i => println(i) }         //> 8
                                                  //| 9
                                                  //| 7
                                                  //| 5
                                                  //| 3
                                                  //| 4
  dropAndTake.foreach(i => println(i))            //> 5
                                                  //| 7
 var StudList = List(Student(4),Student(name = "Rahul"),Student(3, "jai", 45))
                                                  //> StudList  : List[ClassDemo.Student] = List(Student(4,mudra,80), Student(1,Ra
                                                  //| hul,80), Student(3,jai,45))
val first = StudList head                         //> first  : ClassDemo.Student = Student(4,mudra,80)

val rest = StudList.tail                          //> rest  : List[ClassDemo.Student] = List(Student(1,Rahul,80), Student(3,jai,45
                                                  //| ))

StudList.tail.tail                                //> res2: List[ClassDemo.Student] = List(Student(3,jai,45))

StudList.tail.head                                //> res3: ClassDemo.Student = Student(1,Rahul,80)


StudList.filter(s => s.marks>=60)                 //> res4: List[ClassDemo.Student] = List(Student(4,mudra,80), Student(1,Rahul,80
                                                  //| ))

val (part1,part2)=StudList.partition(s => s.marks>=60)
                                                  //> part1  : List[ClassDemo.Student] = List(Student(4,mudra,80), Student(1,Rahul
                                                  //| ,80))
                                                  //| part2  : List[ClassDemo.Student] = List(Student(3,jai,45))


part1                                             //> res5: List[ClassDemo.Student] = List(Student(4,mudra,80), Student(1,Rahul,80
                                                  //| ))
part2                                             //> res6: List[ClassDemo.Student] = List(Student(3,jai,45))








}