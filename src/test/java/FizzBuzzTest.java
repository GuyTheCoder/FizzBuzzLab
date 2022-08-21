import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    // function called game()
    // that function will take an input (int)
    //
    // return "fizz" if multiple of 3
    // return "buzz" if multiple of 5
    // return "fizzbuzz" if multiple of both
    // return input as a string otherwise

    @Test
    public void game__3_returns_fizz(){
        assertThat(FizzBuzz.game(3)).isEqualTo("fizz");

    }

    @Test
    public void game__9_returns_fizz(){
        assertThat(FizzBuzz.game(9)).isEqualTo("fizz");
    }

    @Test
    public void game__5_returns_buzz(){
        assertThat(FizzBuzz.game(5)).isEqualTo("buzz");
    }

    @Test
    public void game__10_return_buzz(){
        assertThat(FizzBuzz.game(10)).isEqualTo("buzz");
    }

    @Test
    public void game__15_returns_fizzbuzz(){
        assertThat(FizzBuzz.game(15)).isEqualTo("fizz buzz");
    }

    @Test
    public void game__30_returns_fizzbuzz(){
        assertThat(FizzBuzz.game(30)).isEqualTo("fizz buzz");
    }

    @Test
    public void game__4_returns_4(){
        assertThat(FizzBuzz.game(4)).isEqualTo("4");
    }



}
