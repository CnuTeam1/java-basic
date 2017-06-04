package kr.ac.cnu.grammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rokim on 2017. 5. 25..
 */
public class GenericExample {
    private List<Person> personList = new ArrayList<>();

    public void addPerson(int age, String name) {
        personList.add(new Person(age, name));
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public List<Person> findAllByOrderByAgeAsc() {
        return personList
                .stream()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .collect(Collectors.toList());
    }

    public List findAllByOrderByAgeDesc2() {
        personList.sort((o1, o2) -> o2.getAge() - o1.getAge());


        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });


        return personList;
    }


    public static List<Person> findAllByOrderByAge(List<Person> personList, boolean isAsc) {
        Person[] persons = personList.toArray(new Person[personList.size()]);

        for (int i = 0 ; i < persons.length ; i++) {
            Person base = persons[i];

            for (int j = i + 1 ; j < persons.length ; j++) {
                Person target = persons[j];

                if (isAsc) {
                    if (target.getAge() < base.getAge()) {
                        // swap
                        persons[i] = target;
                        persons[j] = base;

                        base = target;
                    }
                } else {
                    if (target.getAge() > base.getAge()) {
                        // swap
                        persons[i] = target;
                        persons[j] = base;

                        base = target;
                    }
                }
            }
        }

        return Arrays.asList(persons);
    }



}
