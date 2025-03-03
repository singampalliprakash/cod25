public class Sorting{
    public static void main(String[] args) {
        String[] fruits = {"Banana", "Apple", "Orange", "Grapes"};

        for (int i = 0; i < fruits.length - 1; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i].compareTo(fruits[j]) > 0) { 
                    String temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }

        System.out.println("Ascending Order:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        for (int i = 0; i < fruits.length - 1; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i].compareTo(fruits[j]) < 0) { 
                    String temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }

        System.out.println("Descending Order:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}
