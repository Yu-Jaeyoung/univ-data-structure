package stackqueue.app.banking;

public class Customer {
    private String name;
    private String task;
    private int time;

    public Customer(String name, String task, int time) {
        this.name = name;
        this.task = task;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getTask() {
        return task;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Customer [" +
                "name='" + name + '\'' +
                ", task='" + task + '\'' +
                ", time=" + time +
                ']';
    }
}
