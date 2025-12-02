class Invokable {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Invokable {
        numberOfInvocations++
        println("Current numberOfInvocations value is $numberOfInvocations")
        return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()

fun main() {
    invokeTwice(Invokable())
}

