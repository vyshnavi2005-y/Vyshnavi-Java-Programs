import java.util.ArrayList;
public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        assert arr[2] == 30 : "Assertion failed: element at index 2 is not 30";
        boolean found = false;
        for (int num : arr) {
            if (num == 40) {
                found = true;
                break;
            }
        }
        assert found : "Assertion failed: 40 not found in array";
        int insertIndex = 2;
        int insertValue = 25;
        int[] arrInserted = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arrInserted.length; i++) {
            if (i == insertIndex) {
                arrInserted[i] = insertValue;
            } else {
                arrInserted[i] = arr[j++];
            }
        }
        System.out.print("Array after insertion: ");
        printArray(arrInserted);
        int deleteIndex = 1;
        int[] arrDeleted = new int[arrInserted.length - 1];
        for (int i = 0, j = 0; i < arrInserted.length; i++) {
            if (i != deleteIndex) {
                arrDeleted[j++] = arrInserted[i];
            }
        }
        System.out.print("Array after deletion: ");
        printArray(arrDeleted);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        assert list.get(2) == 30 : "Assertion failed: element at index 2 is not 30";
        assert list.contains(40) : "Assertion failed: 40 not found in list";
        list.add(2, 25);
        System.out.println("ArrayList after insertion: " + list);
        list.remove(1);
        System.out.println("ArrayList after deletion by index: " + list);
        list.remove(Integer.valueOf(30));
        System.out.println("ArrayList after deletion by value: " + list);
    }
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
