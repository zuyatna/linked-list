fun createListWithValues(size: Int): Node<Int>? {
    if (size <= 0) return null

    val head = Node(1)
    var current: Node<Int> = head
    for (i in 2..size) {
        val newNode = Node(i)
        current.next = newNode
        current = newNode
    }
    return head
}

fun main() {
    val newList = createListWithValues(5)
    println(newList)
}