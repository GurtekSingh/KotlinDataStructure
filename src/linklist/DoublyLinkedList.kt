package linklist

class DoublyLinkedList : GLinkedList() {

  private  var headnode: Node? = null
  private  var lastnode: Node? = null

    override fun insertItem(item: Any) {
        val node = Node(item, headnode)

        lastnode?.nextNode = node

        if (headnode == null) headnode = node
        lastnode = node

    }

    override fun printList(msg: String) {

        var startNode: Node? = null

        var node = headnode
        while (startNode == null || !startNode.equals(node)) {
            println(node?.value)
            if (startNode == null) startNode = node
            node = node?.nextNode
        }
    }


    override fun headNode(): Node? {
        return headnode
    }


}