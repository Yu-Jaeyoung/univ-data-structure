package practice.inheritance;

public class Extended extends Basic {
    private String address;
    private String phoneNumber;
    private int studentId;

    public Extended(String name, int age, String address, String phoneNumber, int studentId) {
        super(name, age);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getStudentId() {
        return studentId;
    }
}
