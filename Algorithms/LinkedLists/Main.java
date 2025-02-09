package LinkedLists;

public class Main {
    public static void main(String[] args) {
//        CustomLinkedList li = new CustomLinkedList();
//        li.insertFirst(3);
//        li.insertFirst(4);
//        li.insertFirst(5);
//        li.insertFirst(6);
//        li.insertLast(18);
//        li.insert(200, 3);
//
//        li.display();
//
//        System.out.println(li.deleteFirst());
//
//        li.display();
//
//        System.out.println(li.deleteLast());
//
//        li.display();
//
//        System.out.println(li.delete(2));
//
//        li.display();
//
//        System.out.println(li.find(3));
//
//        li.display();

//        DLL doublyLL = new DLL();
//        doublyLL.insertFirst(34);
//        doublyLL.insertFirst(36);
//        doublyLL.insertFirst(38);
//        doublyLL.insertFirst(40);
//        doublyLL.display();
//        doublyLL.insertLast(56);
//        doublyLL.display();
//        doublyLL.insert(36, 35);
//        doublyLL.display();

        CLL li = new CLL();
        li.insert(45);
        li.insert(47);
        li.insert(56);
        li.insert(54);
        li.insert(57);
        li.display();
        li.delete(45);
        li.display();

    }
}
