package lessons;

public class Binarysort {
    public static void main(String[] args) {
        int[] array = {1, 25, 48, 49, 78, 80, 92, 95, 115, 345, 874, 990, 1000, 1528};
        int key = 95;
        int position = binarySearch(array, key);
        System.out.println(key + " position is " + position);
    }
    static int binarySearch(int[] array, int key) {
        int position = 0;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == key) {
                System.out.println("Key found!");
                return middle;
            }
            if (array[middle] < key) {
                System.out.println("Cut left half");
                left = middle + 1;
            }
            if (array[middle] > key) {
                System.out.println("Cut right half");
                right = middle - 1;
            }
        }
        return -1;
    }
}
