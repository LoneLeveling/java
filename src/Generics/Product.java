package Generics;

public class Product<T, U, V> {
    T item;
    U quantity;
    V price;

    public Product(T item, U quantity, V price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Product Details: "+this.item+" No of units bought: "+ this.quantity+" for $"+this.price;
    }

    public T getItem()
    {
        return this.item;
    }
    public U getQuantity()
    {
        return this.quantity;
    }
    public V getPrice()
    {
        return this.price;
    }
}
