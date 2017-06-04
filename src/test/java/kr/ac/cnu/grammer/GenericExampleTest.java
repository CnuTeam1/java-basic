package kr.ac.cnu.grammer;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rokim on 2017. 5. 25..
 */
public class GenericExampleTest {
    private GenericExample genericExample;

    @Before
    public void setUp() throws Exception {
        genericExample = new GenericExample();
        genericExample.addPerson(1, "Mina");
        genericExample.addPerson(35, "Robin");
        genericExample.addPerson(31, "Ian");
    }

    @Test
    public void 오름차순_테스트() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Mina"));
        personList.add(new Person(10, "Robin"));
        personList.add(new Person(5, "Ian"));

        personList = GenericExample.findAllByOrderByAge(personList, true);

        System.out.println(personList);

        Person base = null;
        for (Person person : personList) {
            if (base == null) {
                base = person;
                continue;
            }

            assertTrue(person.getAge() > base.getAge());
            base = person;
        }
    }


}