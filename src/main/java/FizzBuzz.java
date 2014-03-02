/**
 * Created by zan on 02/03/2014.
 *
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.
 */
public class FizzBuzz {

    String evalNumber(int number) {

        String output = "";

        if(number % 3 == 0){

            output += "Fizz";
        }
        if(number % 5 == 0){

            output += "Buzz";
        }

        if(output.length()>0) return output;
        else return String.valueOf(number);
    }

    public static void main(String[] args){

        FizzBuzz fizzBuzz = new FizzBuzz();

        for(int i=1; i<=100; i++)
        {
            System.out.println(fizzBuzz.evalNumber(i));
        }
    }
}
