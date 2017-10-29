open abstract class GLinkedList {

   private var headNode: Node? = null
        get() = headNode()

    abstract fun insertItem (item: Any)
    abstract fun headNode() : Node?

    fun deleteItem(item: Any) {

        var node: Node? = headNode ?: return

        //if value present at fist no need to look
        //furture

        if (isvaluePresent(node!!, item)) {
            headNode = node.nextNode
            return
        }

        while (node?.nextNode != null) {
            if (isvaluePresent(node.nextNode!!,item)){
                node.nextNode=node.nextNode!!.nextNode
                break
            }
            node = node.nextNode
        }
    }

    fun isvaluePresent(node: Node, item: Any): Boolean {
        return node.value.equals(item)
    }


    open fun printList(msg: String="") {

        var node = headNode

        while (node != null) {
            println("$msg  ${node.value}")
            node = node.nextNode
        }


    }
}


/**
 * @see LIFOLinkedList this linked list
 * follows LIFO (last in first out principle)
 * */
open class LIFOLinkedList : GLinkedList(){

    var headNode: Node? = null

    override fun headNode(): Node? {
      return  headNode
    }


    override fun insertItem(item: Any): Unit {
        headNode = Node(item, headNode)
    }

     fun printList ()  {
        super.printList("LIFO ==>")
    }

}

open class FIFOLinkedList : GLinkedList(){

    var headNode :Node? =null

    override fun headNode(): Node? {
        return headNode
    }

    var lastNode: Node? = null

    override fun insertItem(item: Any) {
        val node = Node(item,null)

        if(lastNode !=null) {
            lastNode?.nextNode=node
        }
        else {
            headNode=node
        }

        lastNode=node

    }
     fun printList ()  {
        super.printList("FIFO ==>")
    }

}


data class Node(var value: Any, var nextNode: Node?)
