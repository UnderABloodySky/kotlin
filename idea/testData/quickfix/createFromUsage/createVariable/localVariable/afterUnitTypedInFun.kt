// "Create local variable 'foo'" "true"
// ACTION: Create parameter 'foo'

fun test() {
    val foo = Unit
    val u: Unit = foo
}