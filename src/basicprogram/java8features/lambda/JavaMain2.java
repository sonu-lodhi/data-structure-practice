package basicprogram.java8features.lambda;

public class JavaMain2 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        JavaMain2 obj = new JavaMain2();
        obj.setName("Sonu Lodhi");
        System.out.println("Name"+obj.getName());
    }
}
