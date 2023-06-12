package Task1_TaskManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Writing a method", "Palindrome check", false);
        Task task2 = new Task("Debugging", "Solve the problems in the code", true);
        Task task3 = new Task("Homework", "Learn Java", true);

        List<Task> taskList = new ArrayList<>();
        TaskManager taskManager = new TaskManager(taskList);

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        List<Task> allTasks = taskManager.getAllTasks();
        for (Task task : allTasks) {
            System.out.println("Заголовок: " + task.getTitle());
            System.out.println("Описание: " + task.getDescription());
            System.out.println("Статус выполнения: " + (task.isCompleted() ? "Выполнена" : "Невыполнена"));
            System.out.println();

            List<Task> newList = new ArrayList<>();
            newList.add(task2);
            newList.add(task3); 


            Task[] newArray = new Task[2];
            newList.toArray(newArray);


            for (Task taskArr : newArray) {
                System.out.println("Заголовок: " + taskArr.getTitle());
                System.out.println("Описание: " + taskArr.getDescription());
                System.out.println("Статус выполнения: " + (taskArr.isCompleted() ? "Выполнена" : "Невыполнена"));
                System.out.println();
            }

        }

    }

}