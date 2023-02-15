public class Employee extends Person{
    private int id;

    public Employee(String name, char gender, int id) {
        super(name, gender);
        this.id = id;
    }


    @Override
    public void work() {
        if(id ==  1){
        System.out.println("Employee is working ");}
        else if (id == 0){
            System.out.println("Employee isn't working");
        }
    }
}
