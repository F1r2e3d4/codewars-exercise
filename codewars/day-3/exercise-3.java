// finding the next perfect square

public class NumberFun {
    public static long findNextSquare(long sq) {
        double no = Math.sqrt(sq);
        if (no % 1 != 0) {
            return -1;
        }
        long newno = (long) no + 1;
        return newno * newno;
    }
}
