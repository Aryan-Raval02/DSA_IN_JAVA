public class SLL<E> 
{
    private Node<E> head;
    private int size;
    
    private static class Node<E>
    {
        E data;
        Node<E> next;

        public Node(E data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void add(E data)
    {
        Node<E> newNode = new Node<>(data);

        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node<E> temp = head;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newNode;
        }
        size++;
    }

    public void add(int index, E data)
    {
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        Node<E> newNode = new Node<>(data);

        if(index == 0)
        {
            newNode.next = head;
            head = newNode;
        }
        else
        {
            Node<E> temp = head;
            for(int i=0; i<index-1; i++)
            {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public E remove(int index)
    {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node<E> temp = head;
        E removedData;

        if(index == 0)
        {
            removedData = head.data;
            head = head.next;
        }
        else
        {
            for(int i=0; i<index-1; i++)
                temp = temp.next;

            removedData = temp.next.data;
            temp.next = temp.next.next;
        }

        size--;
        return removedData;
    }

    public E get(int index)
    {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node<E> temp = head;

        for(int i=0; i<index; i++)
            temp = temp.next;

        return temp.data;
    }

    public void set(int index, E data)
    {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node<E> temp = head;

        for(int i=0; i<index; i++)
        {
            temp = temp.next;
        }

        temp.data = data;
    }

    public int size() { return size; }

    public void printList()
    {
        Node<E> temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) 
    {
        SLL<Integer> ll = new SLL<>();
        
        ll.add(10);
        ll.add(20);
        ll.add(1, 15);
        System.out.println(ll.get(1));

        ll.printList();
        ll.set(1, 17);

        ll.remove(2);

        ll.printList();
    }
}
