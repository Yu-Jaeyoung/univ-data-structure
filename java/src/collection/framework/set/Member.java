package collection.framework.set;

public class Member {
    private String name;
    private int age;

    public Member(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    // name과 age 값이 같으면 동일한 hashCode가 리턴됨
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }

}
