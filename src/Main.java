
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Management manage = new Management(scanner);
        int choice;


        do{
            System.out.println("-----TO DO LIST-----");
            System.out.println("1. View Task\n2. Add Task\n3. Delete Task\n4. Complete Task\n5.Exit\n\nEnter Your Choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    manage.viewTask();
                    break;

                case 2:
                    manage.addTask();
                    break;

                case 3:
                    manage.removeTask();
                    break;

                case 4:
                    manage.changeStatus();
                    break;

                case 5:
                    System.out.println("Exiting ......");
                    break;

                default:
                    System.out.println("Invalid Choice!\nTry Again.....");
                    break;

            }

        }while(choice != 5);

        scanner.close();
        }
    }
