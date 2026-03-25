package list.arraylist.todolist;

import java.time.LocalDate;

public class Todo {
    private final String title;
    private final LocalDate dueDate;

    public Todo(final String title, final LocalDate dueDate) {
        this.title = title;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Todo [" + "title=" + title + ", dueDate=" + dueDate + "]";
    }
}
