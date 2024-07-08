object StringFormatter{

    def toUpper(str: String): String={
        str.toUpperCase
    }

    def toLower(str: String): String={
        str.toLowerCase
    }

    def formatNames(name:String,formatFunction:String=>String):String={
        formatFunction(name)
    }

    def main(args: Array[String]): Unit={
        println(formatNames("Benny", toUpper))
        println(formatNames("Niroshan", name => name.substring(0,2).toUpperCase + name.substring(2)))
        println(formatNames("Saman", toLower))
        println(formatNames("Kumara", name => name.substring(0,name.length-1) + name.takeRight(1).toUpperCase)) 
    }
}