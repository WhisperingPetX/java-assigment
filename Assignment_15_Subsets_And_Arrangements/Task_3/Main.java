public class Main {
    static char[] letters = {'x', 'y'};
    static boolean[] used = new boolean[2];
    static char[] result = new char[2];
    static void arrange(int position) {
        if (position == result.length) {
            System.out.println(new String(result));
            return;
        }
        for (int i = 0; i < letters.length; i++) {
            if (!used[i]) {
                used[i] = true; result[position] = letters[i];
                arrange(position + 1);
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) { arrange(0); }
}
