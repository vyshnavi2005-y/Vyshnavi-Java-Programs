public class ArrayInsertion {
    public static int[] insertElement(int[] original, int element, int position) {
        if (position < 0 || position > original.length) {
            throw new IllegalArgumentException("Invalid position");
        }
        int[] newArray = new int[original.length + 1];
        for (int i = 0; i < position; i++) {
            newArray[i] = original[i];
        }
        newArray[position] = element;
        for (int i = position; i < original.length; i++) {
            newArray[i + 1] = original[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] arr = {22, 5, 6, 15, 2};
        int elementToInsert = 3;;
        int position = 2;
        int[] newArr = insertElement(arr, elementToInsert, position);
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
