object ClassDemo {

  case class Student(var rollNo: Int = 1, var name: String = "mudra", var marks: Int = 80) {

    def show() =

      {
        println("hii")
      }

    def >(s2: Student): Boolean = marks > s2.marks
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(250); 

  var s1 = Student(4);System.out.println("""s1  : ClassDemo.Student = """ + $show(s1 ));$skip(36); ;

  var s2 = Student(name = "Rahul");System.out.println("""s2  : ClassDemo.Student = """ + $show(s2 ));$skip(34); 

  var s3 = Student(3, "jai", 85);System.out.println("""s3  : ClassDemo.Student = """ + $show(s3 ));$skip(36); 
  var s4 = Student(4, "shreya", 88);System.out.println("""s4  : ClassDemo.Student = """ + $show(s4 ));$skip(13); 

  s1.show();$skip(10); val res$0 = 
  s4 > s3;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(38); 

  var nums = List(4, 3, 5, 7, 9, 8);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(33); ;
  var reverseNums = nums.reverse;System.out.println("""reverseNums  : List[Int] = """ + $show(reverseNums ));$skip(39); 
  var dropAndTake = nums drop 2 take 2;System.out.println("""dropAndTake  : List[Int] = """ + $show(dropAndTake ));$skip(23); val res$1 = 
  nums.drop(2).take(2);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(29); 
  for (n <- nums) println(n);$skip(40); 
  nums.foreach { i: Int => println(i) };$skip(43); 

  reverseNums.foreach { i => println(i) };$skip(39); 
  dropAndTake.foreach(i => println(i));$skip(79); 
 var StudList = List(Student(4),Student(name = "Rahul"),Student(3, "jai", 45));System.out.println("""StudList  : List[ClassDemo.Student] = """ + $show(StudList ));$skip(26); 
val first = StudList head;System.out.println("""first  : ClassDemo.Student = """ + $show(first ));$skip(26); 

val rest = StudList.tail;System.out.println("""rest  : List[ClassDemo.Student] = """ + $show(rest ));$skip(20); val res$2 = 

StudList.tail.tail;System.out.println("""res2: List[ClassDemo.Student] = """ + $show(res$2));$skip(21); val res$3 = 

StudList.tail.head;System.out.println("""res3: ClassDemo.Student = """ + $show(res$3));$skip(36); val res$4 = 


StudList.filter(s => s.marks>=60);System.out.println("""res4: List[ClassDemo.Student] = """ + $show(res$4));$skip(56); 

val (part1,part2)=StudList.partition(s => s.marks>=60);System.out.println("""part1  : List[ClassDemo.Student] = """ + $show(part1 ));System.out.println("""part2  : List[ClassDemo.Student] = """ + $show(part2 ));$skip(8); val res$5 = 


part1;System.out.println("""res5: List[ClassDemo.Student] = """ + $show(res$5));$skip(6); val res$6 = 
part2;System.out.println("""res6: List[ClassDemo.Student] = """ + $show(res$6))}








}
