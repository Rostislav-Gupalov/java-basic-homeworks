package ru.otus.java.basic.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        minMaxArrayList(2,10);
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        sumFivePlus(list1);
        replaceListElements(list1, 5);
        increaseElements(list1,4);
        Employee employee1 = new Employee("Иван", 25);
        Employee employee2 = new Employee("Пётр", 26);
        Employee employee3 = new Employee("Андрей", 27);
        List<Employee> list2 = Arrays.asList(employee1, employee2, employee3);
        returnNamesList(list2);
        getEmployeesOlderThan(list2, 26);
        checkAverageAge(list2, 45);
        theYoungestEmployee(list2);
    }

    public static List<Integer> minMaxArrayList(int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        System.out.println(list);
        return list;
    }

    public static int sumFivePlus(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < (list.size()); i++) {
            if (list.get(i) > 5) sum = sum + list.get(i);
        }
        System.out.println(sum);
        return sum;
    }

    public static List<Integer> replaceListElements(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
        System.out.println(list);
        return list;
    }

    public static List<Integer> increaseElements(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
        System.out.println((list));
        return list;
    }

    public static List<String> returnNamesList(List<Employee> list) {
        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            nameList.add(list.get(i).getName());
        }
        System.out.println(nameList);
        return nameList;
    }

    public static List<Employee> getEmployeesOlderThan(List<Employee> list, int minAge) {
        List<Employee> minAgeList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() >= minAge) {
                minAgeList.add(list.get(i));
            }
        }
        return minAgeList;
    }

    public static boolean checkAverageAge(List<Employee> list, int minAverageAge) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i).getAge();
        }
        int employeeAverageAge = sum/list.size();
        System.out.println(employeeAverageAge >= minAverageAge);
        return employeeAverageAge >= minAverageAge;
    }

    public static Employee theYoungestEmployee(List<Employee> list) {
        Employee theYoungest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getAge() < theYoungest.getAge()) {
                theYoungest = list.get(i);
            }
        }
        System.out.println(theYoungest.getName());
        return theYoungest;
    }
}
