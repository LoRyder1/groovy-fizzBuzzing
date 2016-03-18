import org.junit.Before
import org.junit.Test

class FizzBuzzTest {

    private FizzBuzz num = new FizzBuzz()

    private fizzBuzzes = (1..15).collect { num.fizzBuzz(it) }

    private expectedFizzBuzzes = [
            '1', '2', 'Fizz', '4', 'Buzz', 'Fizz', '7', '8', 'Fizz',
            'Buzz', '11', 'Fizz', '13', '14', 'FizzBuzz']

//    @Before
//    void setUp() {
//        num = new FizzBuzz()
//    }

    @Test
    void passANumberToFizzBuzzAndReturnNumber() {
        assert num.fizzBuzz(1) == "1"
    }

    @Test
    void passAMultipleOfThreeAndReturnFizz() {
        assert num.fizzBuzz(3) == "Fizz"
    }

    @Test
    void passAMultipleOfFiveAndReturnBuzz() {
        assert num.fizzBuzz(5) == "Buzz"
    }

    @Test
    void passAMultipleOfFiveAndThreeAndReturnFizzBuzz() {
        assert num.fizzBuzz(15) == "FizzBuzz"
    }

    @Test
    void passACollectionOfNumbersAndReturnFizzBuzzesCorrectly() {
        assert fizzBuzzes == expectedFizzBuzzes
    }
}
