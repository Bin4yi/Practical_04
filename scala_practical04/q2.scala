object PatternMatchingExample {

    def determineMessage(input: Int): String = {
        input match {
        case n if n <= 0 => "Negative/Zero is input"
        case n if n % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"

        }

    }

    def main(args: Array[String]): Unit = {
        println("Please enter an integer:")
        val input = scala.io.StdIn.readInt()
        val message = determineMessage(input)
        println(message)
    }

}
