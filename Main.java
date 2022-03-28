import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(intList, Comparator.naturalOrder());
        Iterator<Integer> iter = intList.iterator();
        while (iter.hasNext()) {
            int i = iter.next();
            if (i > 0) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }






}
