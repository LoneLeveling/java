package Collections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

class OurGenericList<T> implements Iterable
{
    private T[] items;
    private int size;
    public OurGenericList()
    {
        size=0;
        items= (T[]) new Object[100];
    }

    public void add(T item)
    {
        items[size++]=item;
    }
    public T getItemAtIndex(int index)
    {

        return items[index];
    }

    @Override
    public Iterator iterator()
    {
        return null;
    }

    @Override
    public void forEach(Consumer action)
    {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator()
    {
        return Iterable.super.spliterator();
    }
}

public class CollectionSet
{
    public static void main(String[] args) {
        OurGenericList<Integer> list= new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        for (Object i:list){
            System.out.println(i);
        }
    }
}