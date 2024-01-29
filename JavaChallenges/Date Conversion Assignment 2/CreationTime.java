import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CreationTime {

    private ArrayList<Date> creationTimes;

    public CreationTime() {
        this.creationTimes = new ArrayList<>();
    }

    public void addCurrentTime() {
        creationTimes.add(new Date(0));
    }

    public void getUnsortedCreationTimes() {
        this.creationTimes.forEach(time -> System.out.println(time));
    }

    public void getSortedCreationTimes() {
        Collections.sort(creationTimes, Comparator.naturalOrder());
        this.creationTimes.forEach(time -> System.out.println(time));
    }

}
