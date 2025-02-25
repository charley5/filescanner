import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = scanner.nextLine();

        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){

            while(fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}