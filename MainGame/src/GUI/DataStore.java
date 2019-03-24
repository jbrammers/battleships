package GUI;

import Client.Client;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jxb1175 on 19/03/19.
 */
public class DataStore {
    private static DataStore data;
    private static HashMap<String, Object> objects = new HashMap<>();

    /**
     * @return returns the datastore or creates one and returns it if not present
     */
    public static DataStore  getData() {
        return data == null ? data = new DataStore() : data;
    }

    public Map<String, Object> getObjects() {
        return objects;
    }

    /**
     * @param key the key relating to the object to be returned
     * @return the object being requested
     */
    public Object getObject(String key) {
        return objects.get(key);
    }

    /**
     * @param key String used as a reference to the object
     * @param value The object to be stored
     */
    public void addObjects(String key, Object value) {
        objects.put(key, value);
    }
}
