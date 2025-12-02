fun Int.rational(): RationalNumber = TODO()

fun Pair<Int, Int>.rational(): RationalNumber = TODO()

data class RationalNumber(val numerator: Int, val denominator: Int)

data class Pair<out A, out B>(
    val first: A,
    val second: B
)