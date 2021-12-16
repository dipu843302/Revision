package OOPS;

import java.io.Serializable;
class serializableObject implements Serializable {
    String name;
    public serializableObject(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
