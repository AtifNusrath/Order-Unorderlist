package bridgelabz;

public class LinkedList<T> {
   LinkedList.Node<T> head;
    LinkedList.Node<T> current;
    LinkedList.Node<T> tail;
    int size;


    public LinkedList() {
        head = null;
        tail = null;
        current = null;
        size = -1;
    }
    public void add(T item) {
        if (head == null) {
            Node<T> newnode = new Node<T>(item);
            head = newnode;
            tail = newnode;
        } else {
            Node<T> newnode = new Node<T>(item);
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            tail.next = newnode;
            tail = newnode;
        }
        size++;
    }

    public void remove(T data) {
        LinkedList.Node<T> tempCurrent = head;
        LinkedList.Node<T> tempPrev = null;
        while (!tempCurrent.data.equals(data)) {
            tempPrev = tempCurrent;
            tempCurrent = tempCurrent.next;
        }
        if (tempCurrent == head) {
            head = head.next;
        } else {
            tempPrev.next = tempCurrent.next;
        }
        if (tempCurrent == current) {
            current = tempPrev;
        }
        size--;
    }


    public void search(T item)
    {
        Node<T> temp=head;
        boolean status=false;
        while(temp.next!=null)
        {
            status=false;
            if(temp.data.equals(item))
            {
                status=true;
                break;
            }
            temp=temp.next;
        }
        if(temp.data.equals(item))
            status=true;
        if(status==true)
        {
            System.out.println("\nFound in list");
            remove(item);
        }
        else
        {
            System.out.println("\nNot found in list, So it is Added to the list");
            add(item);
        }
    }

    public boolean isEmpty() {
        return size == -1 ? true : false;
    }


    public int size() {
        return size + 1;
    }


    public int index(T data) {
        if (size == -1) {
            return -1;
        }
        LinkedList.Node<T> tempCurrent = head;
        int tempPosition = 0;

        while (!tempCurrent.data.equals(data)) {
            if (tempCurrent == current) {
                return -1;
            }
            tempCurrent = tempCurrent.next;
            tempPosition++;
        }
        return tempPosition;
    }


    public T pop(int location) {
        LinkedList.Node<T> tempCurrent = head;
        LinkedList.Node<T> tempPrev = null;
        int tempPosition = 0;
        size--;
        while (tempPosition != location) {
            tempPrev = tempCurrent;
            tempCurrent = tempCurrent.next;
            tempPosition++;
        }
        if (tempCurrent == head) {
            head = head.next;
            return tempCurrent.data;
        } else if (tempCurrent == current) {
            current = tempPrev;
            tempPrev.next = tempCurrent.next;
            return tempCurrent.data;
        } else {
            tempPrev.next = tempCurrent.next;
            return tempCurrent.data;
        }
    }


    public T pop() {
        return pop(size);
    }


    public T get(int location) {
        LinkedList.Node<T> tempCurrent = head;
        int tempPosition = 0;

        while (tempPosition != location) {
            tempCurrent = tempCurrent.next;
            tempPosition++;
        }

        return tempCurrent.data;

    }

    public void list() {
        LinkedList.Node<T> tempCurrent = head;
        while (tempCurrent != null) {
            System.out.print(tempCurrent.data + " ");
            tempCurrent = tempCurrent.next;
        }

    }


    static class Node<T> {
        T data;
        LinkedList.Node<T> next;

        Node(T data) {
            this.data = data;
            next = null;
        }
    }
}


