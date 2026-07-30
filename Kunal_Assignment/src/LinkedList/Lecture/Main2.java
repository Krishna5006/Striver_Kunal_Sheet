package LinkedList.Lecture;

public class Main2 {
    public static void main(String[] args) {
        DLL list= new DLL();
        list.insertFirst(5);
        list.insertFirst(15);
        list.insertFirst(25);
        list.insertFirst(35);

//        list.display();
//        System.out.println();
        list.insertLast(99);
        list.display();

        System.out.println();
        list.insertAfter(15,65);
        list.display();

    }
}
