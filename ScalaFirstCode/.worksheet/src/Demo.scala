object Demo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(38); 
  println("Hello world");$skip(25); 
  
  var num1 : Int = 8;System.out.println("""num1  : Int = """ + $show(num1 ));$skip(53); ;
  val num2 : Int =2;System.out.println("""num2  : Int = """ + $show(num2 ));$skip(119); ; //constant value(final in java)
  var result= num1.+(num2);System.out.println("""result  : Int = """ + $show(result ));$skip(16);           //here num1 is the object ,+ is a method and num2 is the parameter of the function
  println(num1)}
}
