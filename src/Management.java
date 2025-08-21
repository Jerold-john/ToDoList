
import java.util.ArrayList;
import java.util.Scanner;

public class Management
{
    final Scanner scanner;

    public Management (Scanner scanner){
        this.scanner = scanner;
    }
    final ArrayList<Task> tasks = new ArrayList<>();

    public void viewTask(){
        if(tasks.isEmpty()){
            System.out.println("There is no Task");

        }
        for(Task task : tasks){
            System.out.println(task);
        }


    }
    public void addTask(){
        char ch;
        do {
            System.out.println("Enter Task Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Progress of the Task:(0-100)");
            int progress;
            do{
            progress = scanner.nextInt();
            if(progress < 0 || progress > 100) {
                System.out.println("Enter Progress between 0 to 100");
            }
            else{
                break;
                }
            }while(true);
            Task task = new Task(name,progress);
            tasks.add(task);
            System.out.println("Do you want to add Another Task:(Y/N)");
            ch = Character.toLowerCase(scanner.next().charAt(0));
            scanner.nextLine();
        }while(ch == 'y');
    }
    public void removeTask(){
        if(tasks.isEmpty()){
            System.out.println("There is no Task to Remove.");

        }
        System.out.println("Enter Task Name: ");
        String name = scanner.nextLine();
        tasks.removeIf(t -> t.getName().equals(name));
    }
    public void changeStatus(){
        if(tasks.isEmpty()){
            System.out.println("There is no Task to Update.");

        }
        System.out.println("Which Task do you want to Change?");
        String name = scanner.nextLine();
        int progress;
        for(Task task : tasks){
            if(task.getName().equals(name)){
                do{
                    System.out.println("Enter Task Progress: ");
                    progress = scanner.nextInt();
                    if (progress < 0 || progress > 100) {
                        System.out.println("Enter Progress between 0 to 100");
                    }
                    else{
                        break;
                    }
                }while(true);
                task.setProgress(progress);
            }
        }
    }
}
