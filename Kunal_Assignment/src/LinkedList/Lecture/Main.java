package LinkedList.Lecture;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedListTemplate list =new SinglyLinkedListTemplate();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertAtIndex(22,2);
        list.insertAtLast(99);
        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteAtIndex(2));
        System.out.println(list.find(4));
    }
}
