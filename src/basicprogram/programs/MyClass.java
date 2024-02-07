package basicprogram.programs;

public class MyClass {
    private String key;

    public MyClass(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyClass myClass = (MyClass)obj;

        return  key.equals(myClass.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}
