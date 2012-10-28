import guessNumber.GuessNumber;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GuessNumberTest {

    @Test
    public void should_return_4a0b_given_all_digits_is_correct(){
        GuessNumber guessNumber = new GuessNumber("1234");
        String result = guessNumber.validate("1234");
        assertEquals("4a0b", result);
    }

    @Test
    public void should_return_3a0b_given_partial_digits_are_correct(){
        GuessNumber guessNumber = new GuessNumber("1234");
        String result = guessNumber.validate("1235");
        assertEquals("3a0b", result);
    }

    @Test
    public  void  should_return_2a0b_given_two_numbers_are_correct()
    {
        GuessNumber guessNumber=new GuessNumber("1234");
        String result=guessNumber.validate("1256");
        assertEquals("2a0b",result);
    }

    @Test
    public  void  should_return_2a1b_given_two_numbers_are_correct_and_one_number_place_is_wrong()
    {
        GuessNumber guessNumber=new GuessNumber("1234");
        String result=guessNumber.validate("1246");
        assertEquals("2a1b",result);
    }
    @Test
    public  void  should_return_0a0b_given_no_correct()
    {
        GuessNumber guessNumber=new GuessNumber("1234");
        String result=guessNumber.validate("5678");
        assertEquals("0a0b",result);
    }


}

