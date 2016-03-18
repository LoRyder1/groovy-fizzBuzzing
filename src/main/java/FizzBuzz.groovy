
class FizzBuzz {

//    def fizzBuzz = { int num -> return num.toString() }
    def fizzBuzz = {
        if (it % 3 == 0) { "Fizz" }
        else { it.toString() }
    }
}
