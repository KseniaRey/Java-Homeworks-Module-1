package Task1_TaskManager;

import java.util.ArrayList;
import java.util.List;

public class TaskManager{
    final List<Task> taskList;

    public TaskManager(List<Task> taskList) {
        this.taskList = taskList;
    }

    /**
     * Метод для добавления задачи:
     * @param task Передаем экземпляр класса task
     */
    public void addTask(Task task){
        taskList.add(task);
    }

    /**
     * Метод для удаления задачи:
     * @param task - Передпем экземпляр класса
     */
    public void removeTask(Task task){
        taskList.remove(task);
    }

    /**
     * Метод для вывода всех задач. Проще получить сразу лист
     * @return лист задач
     */
    public List<Task> getAllTasks(){
        return taskList;
    }

    /**
     * Метод для получения только выполненых задач.
     * @return возвращаем созданный лист завершенных задач.
     */
    public List<Task> getCompletedTasks(){
        List<Task> completed = new ArrayList<>();
        for (Task task : taskList) {
            if (task.isCompleted()){
                completed.add(task);
            }
        }
        return completed;
    }

    /**
     * Метод для получения невыполненных задач
     * @return лист задач
     */
    public List<Task> getIncompleteTasks(){
        List<Task> inCompleted = new ArrayList<>();
        for (Task task : taskList) {
            if (!task.isCompleted()){
                inCompleted.add(task);
            }
        }
        return inCompleted;
    }





}
