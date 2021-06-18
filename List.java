
/**
 * Write a description of class List here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class List<T>
{
    /**
     * Implement Node as an inner class
     */
    public class Node {
        //private T
        public T item;
        //private node
        public Node link;

        // Constructor with no parameters for inner class
        /**
         * Node Constructor
         *
         */
        public Node() {
            //data is set to null
            item = null;
            //link is set ot null
            link = null;

        }

        // Parametrized constructor for inner class
        /**
         * Node Constructor
         *
         * @param newData A parameter
         * @param nextLink A parameter
         */
        public Node(T newItem, Node nextLink) {
            //data is set to newData
            this.item = newItem;
            //link is set to nextLink
            this.link = nextLink;
        }

        /**
         * Method setItem
         *
         * @param newItem A parameter
         */
        public void setItem(T newItem){
            //item is set to input newItem
            this.item = newItem;
        }

        /**
         * Method setLink
         *
         * @param newLink A parameter
         */
        public void setLink(Node newLink){
            //link is set to input newLink
            this.link = newLink;
        }

        /**
         * Method getItem
         *
         * @return The return value
         */
        public T getItem(){
            //return item 
            return item;
        }

        /**
         * Method getLink
         *
         * @return The return value
         */
        public Node getLink(){
            //return link
            return link;
        }

    }
    //the start of the linked list
    private Node head;

    /**
     * List Constructor
     *
     */
    public List(){
        //head is set to null
        this.head = null;
    }

    // public T getT(int index){
        // if(head == null){
            // throw new LinkedListException("List empty!");
        // }
        // //check if index is equal to 0
        // if(index == 0){
            // //element is set to head 
            // T element = this.head.item;
            // //head is set to head link
            // this.head = this.head.link;
            // //return element
            // return element;
        // }
        // //otherwise
        // else{
            // //current node is set to head
            // Node current = this.head;
            // //iterate through loop
            // for(int i = 0; i < index; i++){
                // //current is set to the current link
                // current = current.link;
            // }

            // return current.item.clone();
        // }
    // }
    
    /**
     * Method insert
     *
     * @param next A parameter
     * @param index A parameter
     */
    public void insert(T newData, int index){
        //position node
        Node position = new Node(newData, null);
        //check if head is null
        if(this.head == null){
            //head is set to position
            head = position;
            //return
            return;
        }

        //check if head is not equal to null and index is equal to 0
        if(head != null && index == 0){
            position.link = this.head;
            head = position;
            return;
        }
        //node current is set to head
        Node currentNode = head;
        // node previous is set to null
        Node previousNode = null;
        //i is set to 0
        int i = 0;

        //while is less than index
        while(i<index){
            //previos is set to current
            previousNode = currentNode;
            //current is set to current link
            currentNode = currentNode.link;
            if(currentNode == null){
                //break
                break;
            }
            //increment i
            i++;
        }
        //head link is set to postiion
        previousNode.link = position;
        //previous current is set to head
        previousNode.link.link = currentNode;
        //currentNode is null
        currentNode = null;
    }

    
    /**
     * Method remove
     * Find and delete the node at the position specified by index
     *
     * @param index A parameter
     * @return The return value
     */
    public T remove(int index){
        if(head == null){
            throw new LinkedListException("List empty!");
        }

        //check if index is equal to 0
        if(index == 0){
            //element is set to head 
            T element = this.head.item;
            //head is set to head link
            this.head = this.head.link;
            //return element
            return element;
        }
        //otherwise
        else{
            //current node is set to head
            Node current = this.head;
            //iterate through loop
            for(int i = 0; i < index - 1; i++){
                //current is set to the current link
                current = current.link;
            }
            //element is set to current link's item
            T element = current.link.item;
            //current link is set to the next current link's link
            current.link = current.link.link;
            //return element
            return element;
        }
    }

    /**
     * Method append
     * Adds newData to the end of the list.
     *
     * @param next A parameter
     */
    public void append(T newData){
        //last node created
        Node last = new Node(newData, null);
        Node current = head;
        //check if head is equal to null
        if(head == null){
            //head is set to last node
            head = last;
            return;
        }
        //while current link is not null
        while(current.link != null){
            //current is set to current link
            current = current.link;
        }
        //current link is set to last
        current.link = last;
    }
    
    /**
     * Method delete
     * no return value.
     *
     * @param index A parameter
     */
    public void delete(int index){
        //check if index is 0
        if(index == 0){
            //head is set to head.getLink
            this.head = head.getLink(); 
        }
        //postion is set to head 
        Node position = this.head;
        //index is set to index minus 1
        index = index -1;
        // i is set to 1
        int i = 1;
        while(position != null){
            //check if i is set to index
            if (i == index){
                //temporary node is set to position getLink
                Node temporaryNode = position.getLink();
                //temporary nod is set to temporary node getLInk
                temporaryNode = temporaryNode.getLink();
                //position setLink of temporary node
                position.setLink(temporaryNode);
                //break
                break;
            }
            //position is set to position.getLink
            position = position.getLink();
            //increment i
            i++;
        }
    }

    /**
     * Method delete
     * no return value.
     *
     * @param index A parameter
     */
    public Node getNode(int index){
        
        Node getNode = null;
        //check if index is 0
        if(index == 0){
            //head is set to head.getLink
            this.head = head.getLink(); 
        }
        //postion is set to head 
        Node position = this.head;
       
        // i is set to 0
        int i = 0;
        while(position != null){
            //check if i is set to index
            if (i == index)
            {                
                getNode = position;          
                break;
            }
            //position is set to position.getLink
            position = position.getLink();
            //increment i
            i++;
        }
        
        return getNode;
    }

    /**
     * Method size
     * A standard accessor
     *
     *appen @return The return value
     */
    public int size(){
        //count is set 0
        int count = 0; 
        //check if it is empty
        if(isEmpty()){
            //return count
            return count;
        }
        //create new node and set to head
        Node position = this.head;
        //while position is not null
        while(position != null){
            //increment count
            count++;
            //position is set to link
            position = position.link;
        }
        //return count
        return count;
    }

    /**
     * Method toString
     *
     * @return The return value
     */
    public String toString(){
        //check if head is null
        if(this.head == null){
            //return []
            return "";
        }
        //otherwise
        else{
            //result string
            String result = "     ";
            //current node is set to head link
            Node current = this.head;
            //while current is not null
            while(current != null){
                result += "/n      " + current.item;
                current = current.link;
            }
            result += "     ";
            return result;
        }
    }

    /**
     * Method isEmpty
     * Returns true if empty, false otherwise
     *
     * @return The return value
     */
    public boolean isEmpty(){
        //return this.head is equal to null
        return this.head == null;
    }

    /**
     * Method indexOf
     * A sequential search that returns the index if found or -1 if not found
     *
     * @param target A parameter
     * @return The return value
     */
    public int indexOf(T target){
        if(head == null){
            throw new LinkedListException("List empty!");
        }
        //index is set to 0
        int index = 0;
        //current node is set to head
        Node current = this.head;
        //while current is not null
        while(current != null){
            //check if current is not null
            if(current.item.equals(target)){
                //retrun the index
                return index;
            }
            //increment index
            index++;
            //current is set to current link
            current = current.link;
        }
        //return -1
        return -1;
    }

    /**
     * Method equals
     * this should check if one list is a deep copy of the other
     *
     * @param other A parameter
     * @return The return value
     */
    public boolean equals(List other){
        //create T
        List otherList = (List) other;
        //check if other is null
        if (other == null){
            //return false
            return false;
        } 
        //otherwise check if getClass is not equal to other getClass
        else if(getClass() != other.getClass()){
            return false;
        }
        //otherwise
        else{

            //check if size is not the same size at otherList
            if (size() != otherList.size()){
                //return false
                return false;
            }
            //return true
            //return true;
        }
        //temp1 set otherList to head
        Node temp1 = otherList.head;
        //temp2 is set to head
        Node temp2 = this.head;
        //while temp1 is not null
        while(temp1 != null){
            //check is temp1 is not 
            if(!temp1.item.equals(temp2.item)){
                //return false
                return false;
            }
            //temp1 is set to temp1 link
            temp1 = temp1.link;
            //temp2 is set to temp2 link
            temp2 = temp2.link;
        }
        //return true
        return true;
    }    

    public static void main(String[] args) {
        List empty = new List();
        List one = new List();
        List multiple = new List();

        one.append(5);
        empty.append(1);
        multiple.append(10);
        multiple.append(20);
        multiple.append(30);

        System.out.println("Empty:"+empty);     // ( note the implicit call to toString()! )
        System.out.println("One:"+one);
        System.out.println("Multiple:"+ multiple);  

        one.delete(0);
        multiple.delete(0);
        System.out.println("One (delete):"+one);
        System.out.println("Multiple (delete):"+ multiple);

        one.insert(600, 1);
        multiple.insert(400, 2);
        System.out.println("One (insert):"+one);
        System.out.println("Multiple(insert):"+ multiple);

        multiple.remove(0);
        System.out.println("Multiple(remove):"+ multiple);

        System.out.println("Multiple(indexOf):"+ multiple.indexOf(0));
        System.out.println("Multiple(indexOf):"+ multiple.indexOf(400));

        List temp1 = new List();
        temp1.append(2);
        temp1.append(1);
        temp1.append(1);
        temp1.append(1);

        List temp2 = new List();
        temp2.append(1);
        temp2.append(1);
        temp2.append(1);
        temp2.append(1);

        System.out.println("Temp(equals):"+ temp1.equals(temp2));
    }
}