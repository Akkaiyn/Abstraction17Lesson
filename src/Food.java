public abstract class  Food {
    private String name;
    private String cuisine;
    private String smell;
    private String taste;
    private  int calories;

    public abstract void cook ();

    public void eat(){
        System.out.println("Eating");
    }
    public final  void bool(){
        System.out.println("Boohiling");
    }
    public static void  waiting(){
        System.out.println("Waiting time...");
    }

    public Food(String name, String cuisine, String smell, String taste, int calories) {
        this.name = name;
        this.cuisine = cuisine;
        this.smell = smell;
        this.taste = taste;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", smell='" + smell + '\'' +
                ", taste='" + taste + '\'' +
                ", calories=" + calories +
                '}';
    }
}
