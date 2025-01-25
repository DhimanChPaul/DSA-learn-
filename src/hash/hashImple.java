package hash;

import javax.swing.text.html.parser.Entity;

class mapUsingHash{
    private Entity[] entities;

    public mapUsingHash(){
        entities=new Entity[100];

    }

    public void put(String key, String val){
        int hash=Math.abs(key.hashCode()% entities.length);
        entities[hash]=new Entity(key, val);
    }
    public String get(String key){
        int hash=Math.abs(key.hashCode()% entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].val;
        }
        return null;
    }

    public void remove(String key){
        int hash=Math.abs(key.hashCode()% entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash]=null;
        }
    }

    private class Entity{
        String key;
        String val;

        public Entity(String key, String val){
        this.key=key;
        this.val=val;


        }
    }



}

public class hashImple {
    public static void main(String[] args) {

        mapUsingHash map=new mapUsingHash();

        map.put("mango","king of fruit");
        map.put("apple","red fruit");
        map.put("banana","yelow fruit");

        System.out.println(map.get("apple"));


    }
}
