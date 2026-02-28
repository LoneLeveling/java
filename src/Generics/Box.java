package Generics;

public class Box <T>{
    T Item;

    public void setItem(T Item)
    {
this.Item=Item;
    }

    public T getItem()
    {
        return this.Item;
    }
}
