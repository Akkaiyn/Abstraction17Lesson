public class Pizza extends Food{
    @Override
    public void cook() {
        System.out.println("Pizza will be ready in 5 minetes");

    }

    public Pizza(String name, String cuisine, String smell, String taste, int calories) {
        super(name, cuisine, smell, taste, calories);
    }
}
