class Stack {

    private var array: Array<Any>? = null
    private var index: Int = -1
    private var max: Int = 0

    constructor(size: Int) {
        max = size
        array = Array<Any>(size, {})

    }

    fun push(item: Any): Boolean {
        if (index < max) {
            index++
            array?.set(index, item)
            return true
        } else {
            return false
        }
    }

    fun pop(): Any? {
        if (index >= 0) {
            var item = array?.get(index)
            index--
            return item;

        } else throw ArrayIndexOutOfBoundsException("no item in array left")

    }
}

fun main(args: Array<String>) {

    val stack = Stack(30)

    stack.push(5)
    stack.push(6)
    stack.push(4)

    println(stack.pop())
    print(stack.pop())
    println(stack.pop())

}