package lesson22;

public class GenericClass<T1> {

    //with Generic class is possible to call different data types
        //sk. Lesson22Main.java

    private T1 birthDate;

    public T1 getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(T1 birthDate) {
        this.birthDate = birthDate;
    }
}
