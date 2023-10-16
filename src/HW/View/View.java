package HW.View;

import HW.Controller.Controller;
import HW.Controller.VendingAutoHD;
import HW.Controller.VendingAutoOfBOW;

import java.util.Scanner;

public class View {
    VendingAutoOfBOW vendingAutoOfBOW = new VendingAutoOfBOW();
    VendingAutoHD vendingAutoHD = new VendingAutoHD();
    Controller controller = new Controller(vendingAutoOfBOW);
    private int chose;



    public void menu(){
        Scanner scan = new Scanner(System.in);
        int continue1;
        boolean flag = true;
        while (flag) {
            System.out.println("Welcome to Vending programm! \n" +
                    "Make your chose: " + "\n" +
                    "1. create bottle of water. \n" +
                    "2. create hot drink. \n" +
                    "3. print info about hot drinks. \n" +
                    "4. print info about bottles of water.");
            chose = scan.nextInt();

            switch (chose) {
                case 1:
                    System.out.println("Enter the mark of water:");
                    String per = scan.next();
                    System.out.println("Enter the volume of water:");
                    int perl = scan.nextInt();
                    System.out.println("Enter the cost of water:");
                    int perl1 = scan.nextInt();
                    createBOW(per, perl, perl1);

                    System.out.println("The task is done! \n" +
                            "Continue? ...  (1 - Yes, 2 - No)");
                    continue1 = scan.nextInt();
                    if(continue1 == 2) flag = false;
                    break;
                case 2:
                    System.out.println("Enter the name of hot drink:");
                    per = scan.next();
                    System.out.println("Enter the temperature of hot drink:");
                    perl = scan.nextInt();
                    System.out.println("Enter the cost of hot dtink:");
                    perl1 = scan.nextInt();
                    createHotDrink(per, perl, perl1);

                    System.out.println("The task is done! \n" +
                            "Continue? ...  (1 - Yes, 2 - No)");
                    continue1 = scan.nextInt();
                    if(continue1 == 2) flag = false;
                    break;
                case 3:
                    printInfoHD();
                    System.out.println("The task is done! \n" +
                            "Continue? ...  (1 - Yes, 2 - No)");
                    continue1 = scan.nextInt();
                    if(continue1 == 2) flag = false;
                    break;
                case 4:
                    printInfoBOW();
                    System.out.println("The task is done! \n" +
                            "Continue? ...  (1 - Yes, 2 - No)");
                    continue1 = scan.nextInt();
                    if(continue1 == 2) flag = false;
                    break;
            }
        }
    }
    public void createBOW(String name, int volumeSize, int cost){
        controller.addBOW(name, volumeSize, cost);
    };
    public void createHotDrink(String name, int temperature, int cost){
        controller.addHotDrink(name, temperature, cost);
    };
    public void printInfoBOW(){
        controller.printInfo(vendingAutoOfBOW);
    }
    public void printInfoHD(){
        controller.printInfo(vendingAutoHD);
    }

}
