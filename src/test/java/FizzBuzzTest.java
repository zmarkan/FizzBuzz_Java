import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zan on 02/03/2014.
 */
public class FizzBuzzTest {

    @Test
    public void given_the_number_is_divisible_by_3_then_evalNumber_should_return_Fizz(){

        int number = 9;

        FizzBuzz fizzBuzz = new FizzBuzz();
        String output = fizzBuzz.evalNumber(number);

        Assert.assertTrue(output.equalsIgnoreCase("Fizz"));
    }

    @Test
    public void given_then_number_is_divisible_by_5_then_evalNumber_should_return_Buzz(){

        int number = 20;

        FizzBuzz fizzBuzz = new FizzBuzz();
        String output = fizzBuzz.evalNumber(number);

        Assert.assertTrue(output.equalsIgnoreCase("Buzz"));

    }

    @Test
    public void given_then_number_is_divisible_by_3_and_5_then_evalNumber_should_return_FizzBuzz(){

        int number = 15;

        FizzBuzz fizzBuzz = new FizzBuzz();
        String output = fizzBuzz.evalNumber(number);

        Assert.assertTrue(output.equalsIgnoreCase("FizzBuzz"));

    }

    @Test
    public void given_the_number_is_not_divisible_by_3_or_5_then_evalNumber_should_return_the_number(){

        int number = 7;

        FizzBuzz fizzBuzz = new FizzBuzz();
        String output = fizzBuzz.evalNumber(number);

        Assert.assertTrue(output.equalsIgnoreCase("7"));

    }





}
