// Array.java
import java.util.ArrayList;
import java.util.Iterator;

public class Array {
    private ArrayList<String> stringArray;

    public Array() {
        stringArray = new ArrayList<>();
    }

    public void addString(String str) {
        stringArray.add(str);
    }

    public String getString(int index) {
        if (index >= 0 && index < stringArray.size()) {
            return stringArray.get(index);
        }
        return null;
    }

    public void setString(int index, String str) {
        if (index >= 0 && index < stringArray.size()) {
            stringArray.set(index, str);
        }
    }

    public Iterator<String> getIterator() {
        return stringArray.iterator();
    }
}
