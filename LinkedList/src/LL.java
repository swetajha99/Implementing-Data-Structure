public class LL{
  private Node head;
  private Node tail;

  private int size;

  public LL(){
    this.size = 0;
  }
 
  public class Node{
    private int value;
    private Node next;

    public Node(int value){
      this.value = value;
    }
    public Node(int value, Node next){
      this.value = value;
      this.next = next;
    }
  }

  public void addFirst(int val){
    Node newNode = new Node(val);
    newNode.next = head;
    head = newNode;
    if(tail == null){
     tail = head;
    }
    size++;
}

public void display(){
  Node temp = head;
  while(temp!=null){
    System.out.print(temp.value+" -> ");
    temp = temp.next;
  }
  System.out.println();
}
 public void addLast(int val){
  Node newNode = new Node(val);

  tail.next = newNode;
  tail = newNode;

  if(size==0){
    head = tail = newNode;

  }
  size++;
 }

 public void insertAt(int val, int index){
  Node newNode = new Node(val);

  if(size<=index || index<0){
    System.out.println("Invalid argument");
  }
  if(index==0){
    addFirst(val);
  }
  else if(index==size){
    addLast(val);
  }
  Node temp = head;

  for(int i = 0;i<index-1;i++){
    temp = temp.next;
  }
  newNode.next = temp.next;
  temp.next = newNode;
  size++;
 }

 public void removeFirst(){
   if(size==0){
     System.out.println("Nothing");
   }
   else if(size==1){
     head = tail = null;
     size = 0;
   }

  head = head.next;
  size--;

 }

 public void removeat(int index){
  if(size==0){
    System.out.println("Nothing");
  }
  
  if(size<=index || index<0){
    System.out.println("Invalid argument");
  }
  Node temp = head;
  for(int i = 0;i<index-1;i++){
    temp = temp.next;
  }

  temp.next = temp.next.next;
  size--;
 }

 public void removeLast(){
   if(size==0){
     System.out.println("nothing");
   }

   Node temp = head;
   for(int i = 0;i<size-2;i++){
      temp = temp.next;
   }
   tail = temp.next;
   tail.next = null;
   size--;
 }

 public  void reverse(){
   Node prev = null;
   Node curr = head;
   while(curr!= null){
     Node temp = curr.next;
     curr.next = prev;
     prev = curr;
     curr = temp;
   }
   Node temp = head;
   head = tail;
   tail = temp;
 }
}