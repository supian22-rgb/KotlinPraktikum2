fun main(args: Array<String>) {
    var maybeNumber: Int? = 15
    maybeNumber = null
    println(maybeNumber ?:0 * 2)

    var s1 = "Hello"
    var s2: String? = "World"
    println(s1.length)
    println(s2?.length)
}