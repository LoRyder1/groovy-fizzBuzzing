import org.junit.Before
import org.junit.Test

class FizzBuzzTest {

    private FizzBuzz num

    @Before
    void setUp() {
        num = new FizzBuzz()
    }

    @Test
    void passANumberToFizzBuzzAndReturnNumber() {
        assert num.fizzBuzz(1) == "1"
    }
}
