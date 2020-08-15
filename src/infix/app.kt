package infix

/*
* Simple add infix functions
* */
infix fun Int.plus(second: Int) = this + second

/*
* Function that takes two Immutable list, append them and return a new Immutable List
* */
infix fun <T> List<T>.append(second: List<T>) = this.toMutableList().apply { addAll(second) }.toList()


fun main() {
    val sum = 1 plus 2
    println(sum)

    val list1 = listOf("Orange", "Apple", "Banana")
    val list2 = listOf("Papaya", "Grapes", "Water melon")
    val newList = list1 append list2
    println(newList)
}