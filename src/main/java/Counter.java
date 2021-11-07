import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;
import java.util.Objects;

public class Counter {

    private int size;
    private JSONArray jsonArray;

    public Counter(JSONObject jsonObject){
        jsonArray = (JSONArray)jsonObject.get("questions");
        size = jsonArray.size();
    }

    public int countAmountOfWords(int start, int end){
        int count = 0;
        Iterator i = jsonArray.iterator();
        while (i.hasNext()){
            i.next();
            count++;
        }
        return count;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public JSONArray getJsonArray() {
        return jsonArray;
    }

    public void setJsonArray(JSONArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return size == counter.size && Objects.equals(jsonArray, counter.jsonArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, jsonArray);
    }

    @Override
    public String toString() {
        return "Counter{" +
                "size=" + size +
                ", jsonArray=" + jsonArray +
                '}';
    }
}