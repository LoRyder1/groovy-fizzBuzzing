
class FizzBuzz {

//    def fizzBuzz = { int num -> return num.toString() }

    def fizzBuzz = {
        String result = ''
        if (it % 3 == 0) { result += "Fizz" }
        if (it % 5 == 0) { result += "Buzz" }
        if (!result) { result = it.toString() }
        result
    }


//    def fizzBuzz(int num) {
//        String result = ''
//        if (isMultipleOfThree(num)) {
//            result += 'Fizz'
//        }
//        if (isMultipleOfFive(num)) {
//            result += 'Buzz'
//        }
//        if (!result) {
//            result = num.toString()
//        }
//        result
//    }

    private static boolean isMultipleOfFive(int num) {
        num % 5 == 0
    }

    private static boolean isMultipleOfThree(int num) {
        num % 3 == 0
    }
}

