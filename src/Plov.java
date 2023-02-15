public class Plov extends Food {
    @Override
    public void cook() {
        System.out.println("Plov will be ready in 1,5 hours");

    }

    public Plov(String name, String cuisine, String smell, String taste, int calories) {
        super(name, cuisine, smell, taste, calories);
    }

}
