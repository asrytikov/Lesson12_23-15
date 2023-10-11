package p2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Collection AbstractCollection

        //Queue AbstractQueue

        //Deque
        //List  AbstractList
        //Set

        //Map

        //ArrayList
        //LinkedList

        //ArrayDeque
        //PriorityQueue

        //HashSet
        //TreeSet

        //HashMap
        //TreeMap

        ArrayList<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Masha");
        list.add(1, "Igor");

        for (String item : list){
            System.out.println(item);
        }

        System.out.println("----------------");

        System.out.println(list.get(1));
        System.out.println(list.size());

        Object[] masList = list.toArray();
        for(Object item: masList){
            System.out.print(item + " ");
        }
        System.out.println();
        list.remove("Ivan");
        if (list.contains("Ivan")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        System.out.println(list.size());

        list.remove(0);
        System.out.println(list.size());


        ArrayList<String> list1 = new ArrayList<>(list);

        ArrayList<String> test = new ArrayList<>(100);
        test.ensureCapacity(150);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ivan");
        linkedList.addFirst("Alex");
        linkedList.addLast("Masha");
        linkedList.add(1, "Nick");

        for(String item : linkedList){
            System.out.println(item);
        }


    }
}
