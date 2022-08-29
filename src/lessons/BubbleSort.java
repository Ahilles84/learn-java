package lessons;

public class BubbleSort {
    public static void main (String[] args) {
    int[] arraySmall = {20, 91, 64, 75, 19, 26, 48, 55, 89};
    bubbleSort(arraySmall);
    }
    static void bubbleSort(int[] array){
        int comparisonDone = 0;
        int swapsDone = 0;
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < array.length -1; i++){
                printArray(array);
                if (array[i] > array[i+1]){
                    System.out.println("Swap " + array[i] + " and " + array[i+1]);
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapsDone++;
                    sorted = false;
                }
                else {
                    System.out.println("No need to change elements " + i + " and " + (i+1));
                }
                comparisonDone++;
            }
        }
        System.out.println("Arrey size = " + array.length);
        System.out.println("Comparisons done = " +comparisonDone);
        System.out.println("Swaps done = " + swapsDone);
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j);
            System.out.print(" ");
        }
    }
}
