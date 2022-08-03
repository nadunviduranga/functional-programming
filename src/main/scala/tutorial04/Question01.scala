package Tutorial04

object Question01 extends App {

  import scala.io.StdIn.readInt

  // dive the amount of deposite value
  println("Enter the deposite value : ");
  var depositeValue = readInt();

  // calculate interst amount
  def calculateInterest(depositeValue:Int): Double = depositeValue match {
    case x if (x != 0  && x <= 20000) => x*0.02;
    case x if x <= 200000 => x*0.04;
    case x if x <= 2000000 => x*0.035;
    case x if x > 2000000 => x* 0.065;

  }

  // calculate total amount after year
  //def calculateTotal(depositeValue : Int): Double = depositeValue + calculateInterest(depositeValue);

  printf("Toatal earn interest value : Rs.%.2f",calculateInterest(depositeValue));
  //printf("Total value after one year : Rs.%.2f",calculateTotal(depositeValue));
}
