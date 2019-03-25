package ClientProgram.GUI;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jxb1175 on 19/03/19.
 */
public class DataStore {
    private static DataStore data;
    private static HashMap<String, Object> objects = new HashMap<>();

    public static DataStore  getData() {
        return data == null ? data = new DataStore() : data;
    }

    public Map<String, Object> getObjects() {
        return objects;
    }

    public Object getObject(String key) {
        return objects.get(key);
    }

    public void addObjects(String key, Object value) {
        objects.put(key, value);
    }
}
