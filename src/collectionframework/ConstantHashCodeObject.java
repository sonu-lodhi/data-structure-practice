package collectionframework;

import java.util.Objects;

public class ConstantHashCodeObject {
    private String data;

    public ConstantHashCodeObject(String data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return  false;
        }
        ConstantHashCodeObject other = (ConstantHashCodeObject) obj;
        //return data != null ? data.equals(other.data):other.data == null;
        return Objects.equals(data, other.data);
    }
}
