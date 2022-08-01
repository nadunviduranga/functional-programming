package Tutorial04

object Question02 extends App{

  import  scala.io.StdIn.readInt

  println("Enter the integer value : ");
  var integerValue = readInt();

  def checkZero(intValue : Int)  = intValue match{
    case a if a == 0 => println("Zero");
    case a if a < 0 => printf("Negative");
    case a if a > 0 => isOddEven(a);
  }

  def isOddEven(value: Int)= value match{

    case x if x%2 == 0 => println("Even");
    case x if x%2 != 0 => println("Odd");
  }

  checkZero(integerValue);
}
