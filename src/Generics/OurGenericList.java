package Generics;

import java.util.Iterator;
import java.util.PrimitiveIterator;

public class OurGenericList <T>  implements Iterable<T>{
private T[] items;
private int size;
//        = (T[]) new Object[5];

    public OurGenericList() {
        size=0;
       items =(T[]) new Object[100];
    }

    public void add(T item)
    {
        items[size++]=item;
    }

    public T getItemAtIndex(int index)
    {
        return items[ index];
    }

    @Override //Iterator is the only abstract method(method with no body) the Iterable interface has so the implementing class here OurGenericList MUST provide implementation to it.
              //The other 2 methods i.e.,  forEach() & spliterator() that the Iterable interface contains are default so no need to override.
    public Iterator<T> iterator()//this method gives us the iterator feature via which we can iterate over a collection/list.
    {
        return new OurGenericListIterator(this);
    }

    private class OurGenericListIterator implements Iterator<T> //we made this class private so that client cannot access this +Inner for the same reason i.e., encapsulated the implementation.
    {
private OurGenericList<T> list;
private int index=0;
        public OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

   @Override
    public boolean hasNext() {
        System.out.println("hasNext() called..");
        return index<list.size;
    }

        @Override
        public T next() {
            System.out.println("next() called..");
            return list.items[index++];
        }


    }
}
