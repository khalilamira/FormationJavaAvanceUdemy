package tn.amira.genericite;

import java.util.Iterator;

public class GenericList <T> implements Iterable<T>{

    public T[] items = (T[]) new Object[5];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T>{

        private GenericList<T> List;
        private int iteratorIndex;

        public ListIterator(GenericList<T> list) {
            List = list;
        }

        @Override
        public boolean hasNext() {
            return iteratorIndex<List.count;
        }

        @Override
        public T next() {
            return List.get(iteratorIndex++);
        }
    }
}
