fun main() {
    printLikes(1)
    printLikes(10)
    printLikes(32)
    printLikes(61)
    printLikes(11)
    printLikes(10111)
    printLikes(121)
}

fun peopleName(likes: Int): String {
    return if (likes % 10 == 1 && likes % 100 != 11 && likes != 11) "человеку" else "людям"
}

fun printLikes(likes: Int) {
    println("Понравилось  $likes ${peopleName(likes)}")
}