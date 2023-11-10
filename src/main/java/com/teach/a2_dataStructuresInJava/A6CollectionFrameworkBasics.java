package com.teach.a2_dataStructuresInJava;

import com.teach.a3_javaLanguage.L10MethodReference.s4methodReference.ex3.SimpleEmployee;
import com.teach.utilities.InternetUtilities;
import com.teach.utilities.SampleData;
import com.teach.utilities.entity.EmployeeSimple;

import java.util.*;
import java.util.stream.Collectors;

// https://nitinkc.github.io/java/CollectionClass/
/*
Collection(I)
|
|---List
|      |
|      |----ArrayList
|      |----LinkedList
|      |----Vector
|              |
|              |----Stack
|----Set
|      |
|      |----HashSet
|      |       |
|      |       |----LinkedHashSet
|      |
|      |----TreeSet
|----Queue
|      |
|      |----PriorityQueue(I)
|      |----BlockingQueue
|      |       |
|      |       |----LinkedBlockingQueue
|      |       |----LinkedBlockingDeque
|----Deque
|      |----ArrayDeque
|      |----LinkedList

Map
|
|----HashMap
|       |
|       |----LinkedHashMap
|
|----TreeMap
|----WeakHashMap
|----ConcurrentHashMap
|----ConcurrentSkipListMap


|----NavigableMap(I)
|      |
|      |----TreeMap
|      |----ConcurrentSkipListMap
|
|
|----NavigableSet(I)
       |
       |----TreeSet
       |----ConcurrentSkipListSet

 */
public class A6CollectionFrameworkBasics {
    public static void main(String[] args) {
        listInJava();
        //stack();
        //linkedListBasics();

        //setBasics();
        //setWithClass();

        //maxMinHeapsInJava();
        //heapsWithClasses();

        //Doubly ended Queue
        //doublyEndedQueue();

        //Maps - NOT A PART OF COLLECTION Framework
        //hashMaps();

        //Map Iteration : https://nitinkc.github.io/algorithms/maps/
        //mapIteration(hashmap);

        //Treemap enforces sort order via comparator
        //treeMap();

        List<String> wordList = InternetUtilities.bringWordListFromNet();
        //Find the longest Word
        System.out.println(wordList);

        Map<String, Integer> hashMap = new HashMap<>();//Only unique words
        int max = -1;
        for (String word : wordList){
            int length = word.length();
            if(max < length){
                max = length;
                hashMap.put(word,length);
            }
        }
        System.out.println(hashMap);
        Collection<Integer> values = hashMap.values();


        Map<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("One", 1);hashMap2.put("Three", 3);
        hashMap2.put("Four", 4);hashMap2.put("Two", 2);

        // Convert the HashMap entries to a list
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        // Sort the entryList based on values using a custom comparator
        Collections.sort(entryList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Create a LinkedHashMap to maintain the insertion order
        System.out.println(entryList.get(0).getKey());

        }

    private static void treeMap() {
        Map<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());//Dictionary in Python
        treeMap.put(100,"Sun");
        treeMap.put(101,"Mercury");
        treeMap.put(102,"Venus");
        treeMap.put(103,"Earth");
        treeMap.put(104, "Mars");
        treeMap.put(105, "Jupiter");
        treeMap.put(106, "Saturn");
        treeMap.put(107, "Uranus");
        treeMap.put(108, "Neptune");
        treeMap.put(109, "Pluto");
        //treeMap.put(null,"Milky Way");//DOES NOT ALLOW ANY NULL VALUES
        System.out.println(treeMap);

        Map<Integer, SimpleEmployee> map = new TreeMap<>();
    }

    private static void hashMaps() {
        Map<Integer, String> hashmap = new HashMap<>();//Dictionary in Python
        hashmap.put(100,"Sun");
        hashmap.put(101,"Mercury");
        hashmap.put(102,"Venus");
        hashmap.put(103,"Earth");
        hashmap.put(104, "Mars");
        hashmap.put(105, "Jupiter");
        hashmap.put(106, "Saturn");
        hashmap.put(107, "Uranus");
        hashmap.put(108, "Neptune");
        hashmap.put(109, "Pluto");
        hashmap.put(null,"Milky Way");
        hashmap.put(null,"Milky Way2");//allows AT MAX one NULL key
        System.out.println(hashmap);
    }

    private static void mapIteration(Map<Integer, String> map) {
        //Via keySet iterator
        Iterator<Integer> mapIterator = map.keySet().iterator();
        while (mapIterator.hasNext()){
            Integer key = mapIterator.next();
            String value = map.get(key);
            System.out.println("KEY :: " +  key + "     Value :: " + value);
        }

        System.out.println("-----------ENTRY SET-----------");
        //Via EntrySet
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();//Returns each entry of the map like 101=Mercury
        while (iterator.hasNext()){
            Map.Entry<Integer, String> mapEntry = iterator.next();
            System.out.println("KEY :: " +  mapEntry.getKey() + "     Value :: " + mapEntry.getValue());
        }
    }

    private static void doublyEndedQueue() {
        Deque<Integer> deque = new ArrayDeque<>();//Mostly used in Graphs
        deque.offer(10);
        deque.addAll(Arrays.asList(7,8,9,120,3,4,5,5,6,70));
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.poll());
        System.out.println(deque);

        System.out.println("ARRAY DEQUEUE");
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();//Mostly used in Graphs
        arrayDeque.offer(10);
        arrayDeque.addAll(Arrays.asList(7,8,9,120,3,4,5,5,6,70));

        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollLast());

        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.pop());

        System.out.println(arrayDeque);

        Deque<Integer> doublyEndedLinkedList = new LinkedList<>();
        doublyEndedLinkedList.addAll(Arrays.asList(7,8,9,120,3,4,5,5,6,70));
    }

    private static void setWithClass() {
        List<EmployeeSimple> employeeSimpleList = SampleData.getSimpleEmployees();
        employeeSimpleList = employeeSimpleList.stream().filter(Objects::nonNull).collect(Collectors.toList());

        System.out.println(employeeSimpleList);
        Set<EmployeeSimple> employeeSimpleSet = new HashSet<>();
        employeeSimpleSet.addAll(employeeSimpleList);
        System.out.println(employeeSimpleSet);

        Set<EmployeeSimple> employeeSimpleTreeSet = new TreeSet<>(Comparator
                .comparing(EmployeeSimple::getSalary)
                .thenComparing(EmployeeSimple::getExperience)
                .thenComparing(EmployeeSimple::getAge)
        );
        for (EmployeeSimple e : employeeSimpleList){
            System.out.println(e.getName());
            employeeSimpleTreeSet.add(e);
        }
        //TODO : Check runtime error
        System.out.println(employeeSimpleTreeSet);
    }

    private static void heapsWithClasses() {
        List<EmployeeSimple> employeeSimpleList = SampleData.getSimpleEmployees();

        PriorityQueue<EmployeeSimple> employeeSimplePriorityQueue = new PriorityQueue<>(Comparator
                .comparing(EmployeeSimple::getSalary,Comparator.reverseOrder())
                .thenComparing(EmployeeSimple::getAge)
                .thenComparing(EmployeeSimple::getExperience)
        );
        employeeSimplePriorityQueue.offer(employeeSimpleList.get(0));
        employeeSimplePriorityQueue.offer(employeeSimpleList.get(1));
        employeeSimplePriorityQueue.offer(employeeSimpleList.get(2));
        employeeSimplePriorityQueue.offer(employeeSimpleList.get(3));
        employeeSimplePriorityQueue.offer(employeeSimpleList.get(4));

        System.out.println(employeeSimplePriorityQueue);
        System.out.println("----------------RESULTS------------------");
        System.out.println(employeeSimplePriorityQueue.poll());
        System.out.println(employeeSimplePriorityQueue.poll());
    }

    private static void maxMinHeapsInJava() {
        //Min Heap
        Queue<Integer> heap = new PriorityQueue<>();//Heap implementation in Java, naturakl order, min heap
        heap.addAll(Arrays.asList(7,7,8,9,120,3,4,5,5,6,7));
        System.out.println(heap);
        heap.poll();
        System.out.println(heap.poll());
        System.out.println(heap);

        heap.offer(333);
        System.out.println(heap);


        //Max Heap
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());//Heap implementation in Java, naturakl order, min heap
        maxHeap.addAll(Arrays.asList(7,7,8,9,120,3,4,5,5,6,7));
        System.out.println(maxHeap);
        //maxHeap.poll();
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap);

        maxHeap.offer(333);
        System.out.println(maxHeap);
    }

    private static void setBasics() {
        Set<Integer> set = new TreeSet<>();//
        set.addAll(Arrays.asList(7,7,8,9,120,3,4,5,5,6,7));
        System.out.println(set);

        Set<Integer> hashset = new HashSet<>();//
        hashset.addAll(Arrays.asList(7,7,8,9,120,3,4,5,5,6,7));
        System.out.println(hashset);

        HashSet<Integer> hashset2 = new HashSet<>();//
        hashset2.addAll(Arrays.asList(7,7,8,9,120,3,4,5,5,6,7));
        System.out.println(hashset2);

        Set<Integer> linkedHashset = new LinkedHashSet<>();//Preserved the insertion order
        linkedHashset.addAll(Arrays.asList(7,7,8,9,120,3,4,5,5,6,7));
        System.out.println(linkedHashset);
    }

    private static void linkedListBasics() {
        //Linked List
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.addLast(99);
        linkedList.add(2,2);//Index should exist
        System.out.println(linkedList);

        List<Integer> linkedList2 = new LinkedList<>();
        ((LinkedList<Integer>) linkedList2).addFirst(1);
        linkedList2.add(6);
        linkedList2.add(7);
        linkedList2.add(8);
        ((LinkedList<Integer>) linkedList2).addLast(99);
        linkedList2.add(5,2);//Index should exist
        System.out.println(linkedList2);
    }

    private static void stack() {
        List<Integer> stack = new Stack<>();//Polymorphic in nature, all the methods of Listy is available to stack object
        stack.add(3);
        stack.add(67);
        System.out.println(stack);

        Vector<Integer> stack2 = new Stack<>();
        stack2.add(3);
        stack2.add(67);
        System.out.println(stack2);

        Stack<Integer> stack3 = new Stack<>();//More Restrictive, use in competitive programming
        stack3.add(3);
        stack3.add(67);
        System.out.println(stack3);
    }

    private static void listInJava() {
        List<String> stringList = List.of("one", "two", "three", "four");//Unmodifiable list, via static factory
        //stringList.add("five");//Exception condition
        System.out.println(stringList.size());

        List<String> strList = new ArrayList<>();
        List<String> strLinkedList = new LinkedList<>();


        List<String> strVector = new Vector<>();//Not used
    }
}
