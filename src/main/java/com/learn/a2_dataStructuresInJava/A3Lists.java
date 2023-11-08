package com.learn.a2_dataStructuresInJava;

import com.learn.utilities.SampleData;
import com.learn.utilities.entity.Student;

import java.util.*;

public class A3Lists {
    public static void main(String[] args) {
        //Declaration
        List<String> strList = new ArrayList<>();//Old School
        List<String> stringList = List.of();//Static Factory - Empty List
        List<String> stringList2 = List.of("Chandrayaan-2","Chandrayaan-3");

        Integer[] c = {1,2,3,4,5};
        List<Integer> intList = List.of(c);
        System.out.println(intList);

        //
        List<Integer> integerListWithoutNull = Arrays.asList(5, 6, 71, 2, 3);
        integerListWithoutNull.sort(Comparator.naturalOrder());
        System.out.println(integerListWithoutNull);

        // WITH NULLS
        List<Integer> integerListWithNull = Arrays.asList(5, 6, 71, 2, 3, null);
        //integerList.sort(Comparator.naturalOrder());//Exception
        integerListWithNull.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(integerListWithNull);

        //Sorting Object
        List<Student> students = SampleData.getStudents();


        List<Integer> list = new ArrayList<>();
        list.add(2);//add at the end of the list
        //list.add(2,4);//Error as there is no element at index 1
        System.out.println(list);
        //list.remove(2);//Index does not exist

        //Iterator issue
        /*for (int i = 0; i < integerListWithNull.size(); i++) {
            if (i == 0)
                //integerListWithNull.remove(0);
            System.out.println(integerListWithNull.get(i));

        }*/

        System.out.println("========= ITERATOR ========");
        Iterator<Integer> itr = integerListWithNull.iterator();
        while (itr.hasNext()){
            itr.remove();
            Integer val = itr.next();
            System.out.println(val);

        }
    }
}
