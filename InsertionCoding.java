
public class InsertionCoding {


    //    This is a simple method to print the array.
    public static void showArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    // I create the method outside of the "Main".
    public static void insertionSort(int[] array) {

//         key is used here with the (-1) to refer to the previous number on the array.
        int key;

//         value is used to get the actual value of the number in the position of the array.
        int value;

//         I initialize the variable "i" in 1 just to get on the second number of the array and not the first one.
        for (int i = 1; i < array.length; i++) {

            key = i;
            value = array[i];

            while (key > 0 && value < array[key - 1]) {

                array[key] = array[key - 1];
                key--;
            }
            array[key] = value;
        }

    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 2, 4};
        showArray(array);
        insertionSort(array);
        System.out.println("not in order");
        showArray(array);
        System.out.println("in order");
    }
}
