package infix

/*
* Simple add infix functions
* */
infix fun Int.plus(other: Int) = this + other

/*
* Function that takes two Immutable list, append them and return a new Immutable List
* */
infix fun <T> List<T>.append(other: List<T>) = this.toMutableList().apply { addAll(other) }.toList()


fun main() {
    val sum = 1 plus 2
    println(sum)

    val list1 = listOf("Orange", "Apple", "Banana")
    val list2 = listOf("Papaya", "Grapes", "Water melon")
    val newList = list1 append list2
    println(newList)
}