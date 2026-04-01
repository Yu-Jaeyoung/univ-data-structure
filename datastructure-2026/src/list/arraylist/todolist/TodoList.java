package list.arraylist.todolist;

import list.common.ListInterface;
import list.linkedlist.generic.LinkedList;

import java.time.LocalDate;

public class TodoList {
    public static void main(String[] args) {
        //  ArrayList<Todo> todoList = new ArrayList<>();
        //  LinkedList<Todo> todoList = new LinkedList<>();
        ListInterface<Todo> todoList = new LinkedList<>();
        todoList.add(0, new Todo("Studying DataStructure", LocalDate.of(2026, 3, 25)));
        todoList.add(0, new Todo("Write an Essay", LocalDate.of(2026, 3, 25)));
        todoList.append(new Todo("Lunch Time", LocalDate.of(2026, 3, 25)));
        todoList.printAll("\n");
    }
}
