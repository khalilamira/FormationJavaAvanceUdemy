package tn.amira.collection;

import tn.amira.genericite.GenericList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainPerso {

    public static void main(String[] args){

        //iterator
        GenericList<Integer> list = new GenericList<>();
        list.add(1);
        list.add(2);
        for (Integer item : list){
            System.out.println(item);
        }

        //Collection
        Collection<Integer> myCollection = new ArrayList<>();
        myCollection.add(1);
        myCollection.add(2);
        myCollection.add(3);
        Collections.addAll(myCollection,1,2,3);
        for (Integer item : myCollection){
            System.out.println(item);
        }

        Object[] myArray = myCollection.toArray();
        System.out.println(myArray[0]);

        Collection<Integer> other = new ArrayList<>();
        other.addAll(myCollection);

        List<String> khj = new ArrayList<>();
        khj.add("A");
        khj.add("B");
        khj.add("C");
        System.out.println(myCollection);


    }
}
