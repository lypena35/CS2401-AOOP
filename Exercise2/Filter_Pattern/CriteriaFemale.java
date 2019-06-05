package Exercise2.Filter_Pattern;

/**
 * Created by LoriPena on 11/7/18.
 * Lorianne Pena
 */
import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}