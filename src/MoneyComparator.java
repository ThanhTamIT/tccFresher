import java.util.Comparator;

public class MoneyComparator implements Comparator<Bill> {

    @Override
    public int compare(Bill o1, Bill o2) {
        // Hai đối tượng null coi như bằng nhau.
        if (o1 == null && o2 == null) {
            return 0;
        }
        // Nếu o1 là null, coi như o2 lớn hơn
        if (o1 == null) {
            return -1;
        }
        // Nếu o2 là null, coi như o1 lớn hơn.
        if (o2 == null) {
            return 1;
        }
        long value = o1.getMoney() - o2.getMoney();
        if (value > 0) {
            return 1;
        }else if (value < 0) {
            return -1;
        }
        int value2 = o1.getName().compareTo(o2.getName());
        return value2;
    }
}
