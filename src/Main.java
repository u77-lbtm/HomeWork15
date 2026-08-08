import java.lang.Object;

public class Person {
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name;
    public int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    }
}



