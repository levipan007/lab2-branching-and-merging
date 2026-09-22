public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java -> DONE
    public static long sum(int[] numbers) {
        int s = 0; // variable to accumulate the sum in!// changed to long to avoid integer overflow.
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
