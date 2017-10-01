package ch.juventus.se.problemstofix.person;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Linda Krüger
 * @since: 28.09.17
 */
public class PersonController {

    public List<Person> removeAllLindas (List<Person> people) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if(person.getFirstName().equals("Linda")) {
                iterator.remove();
            }
        }
        return people;
    }

    public List<Person> removeAllUnderage (List<Person> people) {

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -18);
        Date referenceDate = cal.getTime();

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().getBirthday().after(referenceDate)) {
                iterator.remove();
            }
        }

        return people;
    }

    public List<Person> removeAllWitLetterAInName(List<Person> people) {

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().getLastName().toLowerCase().contains("a")) {
                iterator.remove();
            }
        }

        return people;
    }
}
