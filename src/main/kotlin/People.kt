
fun main() {
    printLikes(1)
    printLikes(10)
    printLikes(32)
    printLikes(61)
}

fun peopleName(likes: Int): String {
    return if (likes == 1 || likes % 10 == 1) "человеку" else "людям"
}

fun printLikes(likes: Int) {
    println("Понравилось  $likes ${peopleName(likes)}")
}