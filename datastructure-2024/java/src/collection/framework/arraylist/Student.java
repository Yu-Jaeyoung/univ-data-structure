package collection.framework.arraylist;

public class Student {
    final private String name;
    final private String phoneNumber;

    public Student(final String name, final String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student [" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ']';
    }

    @Override
    public boolean equals(final Object o) {

        if (o instanceof Student) {
            Student s = (Student) o;
            return this.name.equals(s.name) && this.phoneNumber.equals(s.phoneNumber);
        }

        return false;
    }
}
