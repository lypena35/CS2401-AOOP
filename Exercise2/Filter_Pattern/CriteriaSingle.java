package Exercise2.Filter_Pattern;

/**
 * Created by LoriPena on 11/7/18.
 * Lorianne Pena
 */
import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
