import linklist.DoublyLinkedList
import linklist.FIFOLinkedList
import linklist.LIFOLinkedList

fun main(args: Array<String>) {

    testdoublylist()

   // testlist()

}

fun testdoublylist() {

    val doublelist= DoublyLinkedList()

    doublelist.insertItem(5)
    doublelist.insertItem(6)
    doublelist.insertItem("Gurtek")
    doublelist.insertItem("Single")

    doublelist.deleteItem(6)


    doublelist.printList()



}


fun testlist(){

    val linkedList = FIFOLinkedList()

    val lifolist = LIFOLinkedList()

    linkedList.insertItem(5)
    linkedList.insertItem(6)
    linkedList.insertItem(7)
    linkedList.insertItem(8)
    linkedList.insertItem("Gurtek")
    linkedList.insertItem("You r one tough man")
    linkedList.insertItem("Wow you did it!")
    linkedList.insertItem("Nice to see you buddy!")

    linkedList.deleteItem(6)
    //linkedList.deleteItem(8)

    lifolist.insertItem(5)
    lifolist.insertItem(6)
    lifolist.insertItem(7)
    lifolist.insertItem(8)
    lifolist.insertItem("Gurtek")
    lifolist.insertItem("You r one tough man")
    lifolist.insertItem("Wow you did it!")
    lifolist.insertItem("Nice to see you buddy!")

    lifolist.deleteItem(8)


    linkedList.printList()
    lifolist.printList()


}