public abstract class Person {
    private String name;
    private char gender;

    public abstract void work();

    public Person(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }
}
