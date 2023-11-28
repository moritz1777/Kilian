public class Stack<ContentType>{
    private class StackNode{
        private ContentType content; 
        private StackNode next; 
        public StackNode(ContentType pContent){
            next = null; 
            content = pContent; 
        }
        public StackNode getNext() {
            return this.next; 
        }
        public void set()

    }
    private StackNode head;
}