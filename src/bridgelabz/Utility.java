package bridgelabz;

import java.util.Scanner;

public class Utility {
    static Scanner scanner=new Scanner(System.in);

    public static String inputString()
    {

        try {
            return scanner.next();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input, try again.");
            return inputString();
        }
    }
    public static int inputInt()
    {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input, try again.");
            return inputInt();
        }

    }

    public static <N> LinkedList<N> searchInList(LinkedList<N> list, String search)
    {
        list.search((N) search);
        list.list();
        return list;
    }

    public static OrderedLinkedList searchInListOrder(OrderedLinkedList list, int search)
    {
        boolean status=list.search(search);

        if(status)
        {
            list.remove(search);
        }
        else
        {
            list.add(search);
        }
        list.list();
        return list;
    }
}
