package sort_array_by_parity;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] % 2 == 0) {
                continue;
            } else {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[j] % 2 == 0) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                    }
                }
            }
        }
        return A;
    }
}
