
class FizzBuzz {

//    def fizzBuzz = { int num -> return num.toString() }
    def fizzBuzz = {
        String result = ''
        if (it % 3 == 0) { result = "Fizz" }
        if (it % 5 == 0) { result = "Buzz" }
        if (!result) { result = it.toString() }
        result
    }
}
