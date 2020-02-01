package main;

import main.model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Storage
{
    private static int currentId = 1;
    private static HashMap<Integer, Task> tasks = new HashMap<Integer, Task>();

    public static List<Task> getAllTasks()
    {
        ArrayList<Task> booksList = new ArrayList<Task>();
        booksList.addAll(tasks.values());
        return booksList;
    }

    public static int addBook(Task task)
    {
        int id = currentId++;
        task.setId(id);
        tasks.put(id, task);
        return id;
    }

    public static Task getBook(int bookId)
    {
        if(tasks.containsKey(bookId)) {
            return tasks.get(bookId);
        }
        return null;
    }
}