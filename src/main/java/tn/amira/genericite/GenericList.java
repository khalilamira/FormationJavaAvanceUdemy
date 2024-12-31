package tn.amira.genericite;

public class GenericList <T> {
    private T[] items = (T[]) new Object[5];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }
}
