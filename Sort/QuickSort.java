public class QuickSort {
    static int[] n = new int[10];
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            n[i] = (int) (Math.random() * 20);
        }
        quickSort(n, 0, 9);
        for (int i = 0; i < 10; i++) {
            System.out.println(n[i] + " ");
        }
    }

    public static void quickSort(int[] n, int low, int high) {
        if (low >= high) return;
        int p = partition(n, low, high);
        quickSort(n, low, p - 1);
        quickSort(n, p + 1, high);
    }

    private static int partition(int[] n, int low, int high) {
        int pivot = n[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (n[j] < pivot) {
                int temp = n[j]; n[j] = n[i]; n[i] = temp;
                i++;
            }
        }
        int temp = n[high]; n[high] = n[i]; n[i] = temp;
        return i;
    }
}
