import java.util.ArrayList;
import java.util.List;
public class Main {
    static void printSubsets(int[] a, int index, List<Integer> current) {
        if (index == a.length) {
            StringBuilder line = new StringBuilder("{");
            for (int j = 0; j < current.size(); j++) {
                if (j > 0) line.append(", ");
                line.append(current.get(j));
            }
            line.append("}");
            System.out.println(line);
            return;
        }
        printSubsets(a, index + 1, current);
        current.add(a[index]);
        printSubsets(a, index + 1, current);
        current.remove(current.size() - 1);
    }
    public static void main(String[] args) {
        printSubsets(new int[]{1, 2, 3}, 0, new ArrayList<>());
    }
}
