fun main() {
    agoToText(52)
}

fun agoToText(second: Int) {
    val whenWasIt = " "
    when (whenWasIt) {
        println("был(а) только что").toString() -> 0 <= second && second <= 60
        minutesAgo(second).toString() -> 60 <= second && second <= 60 * 60
        hoursAgo(second).toString() -> 60 * 60 + 1 <= second && second <= 24 * 60 * 60
        println("был(а) вчера").toString() -> 24 * 60 * 60 + 1 <= second && second <= 24 * 60 * 60 * 2
        println("был(а) позавчера").toString() -> 24 * 60 * 60 * 2 + 1 <= second && second <= 24 * 60 * 60 * 3
        else -> println("был(а) давно")
    }
}

fun minutesAgo(seconds: Int): Int {
    val minutesAgo = seconds / 60
    when (minutesAgo) {
        1, 21, 31, 41, 51 -> println("был(а) $minutesAgo минуту назад")
        2, 22, 32, 42, 52, 3, 23, 33, 43, 53, 4, 24, 34, 44, 54 -> println("был(а) $minutesAgo минуты назад")
        else -> println("был(а) $minutesAgo минут назад")

    }
    return minutesAgo

}

fun hoursAgo(seconds: Int): Int {
    val hoursAgo = (seconds / 60) / 60
    when (hoursAgo) {
        1, 21 -> println("был(а) $hoursAgo час назад")
        2, 3, 4, 22, 23, 24 -> println("был(а) $hoursAgo часа назад")
        else -> println("был(а) $hoursAgo часов назад")
    }
    return hoursAgo
}