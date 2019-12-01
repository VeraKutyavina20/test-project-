public class Sort {
    public static void insertionSort2(int[] m, int a, int b)
    {
        int i, j, t;
        for (i = a; i < b; i++)
        {
            t = m[i];
            for (j = i - 1; j >= a - 1 && m[j] > t; j--) {
                m[j + 1] = m[j];
                m[j + 1] = t;
            }
        }
    }
}
