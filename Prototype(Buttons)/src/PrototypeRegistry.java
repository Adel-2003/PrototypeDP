import java.util.HashMap;
import java.util.Map;
public class PrototypeRegistry {
    private Map<String,Prototype> items = new HashMap<>();

    public void addItem(String id, Prototype p){
        items.put(id,p);
    }
    public Prototype getById(String id){
        return items.get(id).clone();
    }
    public Prototype getByColor(String color){
        for(Prototype item : items.values()){
            if(item.getColor().equals(color)){
                return item.clone();
            }
        }
        return null;
    }
}
