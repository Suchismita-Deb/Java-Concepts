package com.teach.zzzzRevisions;

import java.util.*;

public class A10Revisions1 {
    public static void main(String[] args) {
        //Primitives cannot store null, while Wrapper class can.

        //Wrapper assigned to  Primitive
        int min = Integer.MIN_VALUE;//auto unboxing, ALWAYS USE THIS
        int min2 = -1;//If, The input CANNOT be less than 0

        //valueOf vs parse
        int x = Integer.parseInt("123");//Parse int returns primitive type
        Integer y = Integer.valueOf("123");//Value of returns Wrapper
        // handling nulls
        //int z = Integer.parseInt(null);//NumberFormatException because primitives CANNOT store NULLS
        //Integer z = Integer.valueOf("nitin");//NumberFormatException
        //Integer z = Integer.valueOf(null);//cannot handle nulls

        
        // TYPE CASTING : Widening --> Automatic, Narrowing --> Explicit
        int a = 40000;
        double b = a; //wideing, automatic

        short c = (short) b;//Narrowing, manual, loss of information
        System.out.println(c);//-25536, rotales after the MAX value reaches.

        //See notes
        
        //Character Utilities
        boolean letterOrDigit = Character.isLetterOrDigit("Ni&in".charAt(2));//false
        boolean isSpaceChar = Character.isSpaceChar("Ni in".charAt(2));//true
        Character.isLetter('a');//true
        Character.isDigit('2');
        //HINT : IF !Character.isLetterOrDigit('!')  => special char or non alphanumeric

        //Sting utilities
        String str = "Nitin Charuasia";
        //str.length();
        //str.charAt(index);//retunrs one char
        //str.substring(a,b);//returns from index a to index b, not including b;
        //str.substring(a);//returns from index a till the end
        // str.indexOf('c');//returns the fist occurance of char c in the string str;
        int indexOfString = str.indexOf("tin");//Returns 2
        // str.split(",")
        // str.replace and str.replaceAll

        //Integer Utilities
        //TODO : continue later

        //Math Utilities
        Math.max(123.256, 123.0);//similarly min
        Math.ceil(1235.235);//1236, floor -> 1235
        double sqrt = Math.sqrt(25);//5.0
        Math.abs(-1);//1
        double pow = Math.pow(2, 3);//8.0

        //collections Framework
        //List -> Linked List -> Stacks -> Queues (sigly and doubly) -> Set -> Map
        //Collection operates on generics

        List<Integer> list = new ArrayList<>();
        insertIntoCollection(list,10);

        LinkedList<Integer> linkedList = new LinkedList<>();
        insertIntoCollection(linkedList,25);
        linkedList.addFirst(1333);
        linkedList.addLast(1258);
        iterateCollection(linkedList);

        //Stack
        Stack<Integer> stack = new Stack<>();
        insertIntoCollection(stack,10);//Add method is availabs for stack, via Collection interface
        stack.push(20);
        Integer poppedItem = stack.pop();
        stack.size();
        iterateCollection(stack);

        //Queue
        Queue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());//Heap implementation, by default min heap
        queue.offer("Zimmerman");
        insertIntoCollection(queue,"Nitin");//add is possible via collection interface
        String poll = queue.poll();
        iterateCollection(queue);

        //Deque
        Deque<Integer> deque = new ArrayDeque<>();//similarly linkedlist
        deque.offer(112);
        deque.offerFirst(12);
        deque.offerLast(34);
        insertIntoCollection(deque,455);
        iterateCollection(deque);

        //Set : Todo : Hashset and TreeSet

        //Map -> put, get, contains, keySet, entrySet
        Map<String, Integer> hashMap = new HashMap<>();
        String words =  "Harry James Potter, Neville Longbottom ,Albus Dumbledore, Severus Snape, Sirius Black, Rubeus Hagrid, Hermione Granger, Ron Weasley";
        String[] splitString = words.split(",");
        List<String> harryPotterCharacters = Arrays.asList(splitString);

        //Inserting into a hashmap
        for (String name : harryPotterCharacters){
            String replacedName = name.replace(" ", "");//replace spaces with empty
            hashMap.put(replacedName, replacedName.length());
        }

        // Iterating the Map using keySet
        Set<String> keySet = hashMap.keySet();
        Iterator<String> mapItr = keySet.iterator();
        while (mapItr.hasNext()){
            String key = mapItr.next();
            Integer value = hashMap.get(key);
            System.out.println(key + " :: " + value);
        }

        for(String key : hashMap.keySet()){
            System.out.println(key + " || " + hashMap.get(key));
        }
        //TODO : Iterator with Entry Set

        //Iterating the map using entrySet
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() +" ::: "+ entry.getValue());
        }

        //Sorting returns VOID, meaning it changes the original DS
        //Arrays.sort();//Sorts fixed size array[]
        //Collections.sort();//Sorts dynamic array ro arrayList

        //TODO :
        // Collections.EMPTY_LIST;
        // Collections.emptyMap();
        // Collections.EMPTY_SET;
        //
        // Collections.max();
    }

    private static <E> void insertIntoCollection(Collection<E> collection, E i) {
        collection.add(i);
    }

    private static <E> void iterateCollection(Collection<E> collection) {
        Iterator<E> itr = collection.iterator();
        while (itr.hasNext()){
            E item = itr.next();
            System.out.println(item);
        }
    }


}
