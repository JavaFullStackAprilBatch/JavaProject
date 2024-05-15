package collectionframework.assignment;

import java.util.Comparator;

public class SortByCountry implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2) {
        return o1.getCountry().compareTo(o2.getCountry());
    }


    }



