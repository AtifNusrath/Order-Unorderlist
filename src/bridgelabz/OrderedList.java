package bridgelabz;


import java.util.Scanner;

public class OrderedList {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        new Utility();
        int count;
        OrderedLinkedList<Integer> list = new OrderedLinkedList<>();
        System.out.println("Enter list of element: ");
        count = Utility.inputInt();
        System.out.println("Enter list element: ");
        while (count > 0) {
            list.add(Utility.inputInt());
            count--;
        }
        System.out.println("Ordered list elements: ");
        list.list();
        System.out.println("\nEnter the element to search");
       int search=Utility.inputInt();

       Utility.searchInListOrder(list, search);
    }
}
