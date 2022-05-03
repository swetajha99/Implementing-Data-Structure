public class Main {
    public static void main(String[] args){
        LL list = new LL();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(7);
        list.display();
        list.addLast(10);
        list.display();
        list.insertAt(8, 2);
        list.display();
        list.removeFirst();
        list.display();
        list.removeat(2);
        list.display();
        list.removeLast();
        list.display();
        list.removeLast();
        list.display();
        list.addLast(9);
        list.addLast(77);
        list.display();
        list.reverse();
        list.display();
    }
}
