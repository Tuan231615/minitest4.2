package views;

import Controller.MaterialManager;
import model.Material;
import model.CrispyFlour;
import model.Meat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Client {
    public static List<Material> materials = new ArrayList<>();
    public static MaterialManager user = new MaterialManager(materials);
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. In ra");
            System.out.println("2. Tinh thit");
            System.out.println("3. Tinh bot");
            System.out.println("4. Them ");
            System.out.println("5. Sua ");
            System.out.println("6. Xoa");
            System.out.println("7. Them thit");
            System.out.println("8. Them bot");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("In ra");
                    user.display();
                    break;
                case 2:
                    System.out.println("Tinh thit");
                    System.out.println(user.totalPriceMeat());
                    break;
                case 3:
                    System.out.println("Tinh bot");
                    System.out.println(user.totalPriceCrispyFlour());
                    break;
                case 4:
                    System.out.println("Them");

                    break;
                case 5:
                    System.out.println("Sua");

                    break;
                case 6:
                    System.out.println("Xóa");

                    break;
                case 7:
                    System.out.println("Them thit");

                    break;
                case 8:
                    System.out.println("Them bot");

                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
