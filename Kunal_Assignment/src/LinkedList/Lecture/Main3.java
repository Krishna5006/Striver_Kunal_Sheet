package LinkedList.Lecture;

public class Main3 {
    public static void main(String[] args) {
        CL list=new CL();
        list.insert(4);
        list.insert(14);
        list.insert(24);
        list.insert(34);
        list.display();
        list.delete(24);
        list.display();
    }
}
