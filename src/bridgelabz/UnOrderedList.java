package bridgelabz;

public class UnOrderedList {

    public static void main(String[] args)
    {
        new Utility();
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter list of element: ");
        int count = Utility.inputInt();

        System.out.println("Enter list element: ");
        while (count > 0) {
            list.add(Utility.inputString());
            count--;
        }
        System.out.println("\nUnOrdered list elements: ");
        list.list();

        System.out.println("\nEnter the element to search");
        String search=Utility.inputString();
        Utility.searchInList(list, search);

    }
}
