import java.util.Scanner;
public class FindMin {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        int i = 0;
        array = new int[size];
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;

        }
        System.out.println("Property list:");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }

        int min = array[0];
        int index = 0;
        for (int j = 0 ; j <array.length;j++){
            if (array[j] < min){
                min = array[j];
                index = j;
            }
        }
        System.out.println("The smallest value is " + min + " at position "+ index);
    }
}
