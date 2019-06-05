package Exercise2.Filter_Pattern;

/**
 * Created by LoriPena on 11/7/18.
 * Lorianne Pena
 */

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}