package stackqueue.app.banking;

import stackqueue.common.QueueInterface;
import stackqueue.queue.arrayqueue.ArrayQueue;

public class BankingExample {
    public static void main(String[] args) {
        QueueInterface<Customer> waitingQueue = new ArrayQueue<>();

        waitingQueue.enqueue(new Customer("Kim", "Deposit", 3));
        waitingQueue.enqueue(new Customer("Lee", "Withdrawal", 5));
        waitingQueue.enqueue(new Customer("Park", "Transfer", 4));
        waitingQueue.enqueue(new Customer("Choi", "Open Account", 7));
        waitingQueue.enqueue(new Customer("Jung", "Loan Consultation", 10));

        System.out.println("=== Added 5 Customers ===");
        while (!waitingQueue.isEmpty()) {
            processCustomer(waitingQueue.dequeue());
        }
    }

    private static void processCustomer(Customer customer) {
        System.out.println("Start: " + customer.getName() + " - " + customer.getTask());

        try {
            Thread.sleep(customer.getTime() * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Customer processing interrupted", e);
        }

        System.out.println("Done : " + customer.getName() + " - " + customer.getTask());
    }
}
