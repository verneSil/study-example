import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class TmpTest {
    public static void main(String[] args) {
//        Calendar instance = Calendar.getInstance();
//        instance.set(Calendar.YEAR, Calendar.MONTH, Calendar.DATE, 0, 0, 0);
//        System.out.println(instance.getTime());
//        instance.set(Calendar.YEAR, Calendar.MONTH, Calendar.DATE - 1, 0, 0, 0);

        Map map = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 0,
                0, 0);
        long start = calendar.getTimeInMillis();
        System.out.println(start);
        calendar.add(Calendar.YEAR, -1);
        long end = calendar.getTimeInMillis();
        System.out.println(calendar.getTimeInMillis());
    }
}
