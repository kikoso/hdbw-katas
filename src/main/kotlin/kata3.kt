fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> TODO()
        is Sum -> TODO()
        else -> throw IllegalArgumentException("Unknown expression")
    }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun main() {
    println(
        eval(
            Sum(
                Num(3), Num(4)
            )
        )
    )
}