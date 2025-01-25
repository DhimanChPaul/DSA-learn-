package hash;


import java.util.ArrayList;
import java.util.LinkedList;

public class useLL<K, V >{
ArrayList<LinkedList<Entity>> list ;
private int size = 0;
private float lf=0.5f;

public useLL(){
    list=new ArrayList<>();
    for (int i = 0; i < 10  ; i++) {
        list.add(new LinkedList<>());
        
    }
}
public void put(K key, V val){
    int hash=Math.abs(key.hashCode()% list.size());

    LinkedList<Entity> entities= list.get(hash);

    for(Entity entity: entities){
        if (entity.key.equals(key)){
            entity.val=val;
            return;
        }
    }

    if ((float) (size)/list.size()>lf){
        reHash();
    }

    entities.add(new Entity(key, val));
    size++;

}

    private void reHash() {

        System.out.println("we are now re hashing");

        ArrayList<LinkedList<Entity>> old=list;
        list=new ArrayList<>();
        size=0;

        for (int i = 0; i < old.size()*2; i++) {

            list.add(new LinkedList<>());
            
        }
        for (LinkedList<Entity> entries:old){
            for (Entity entry: entries){
                put(entry.key, entry.val);
            }
        }
    }

    public V get(K key){
        int hash=Math.abs(key.hashCode()% list.size());
        LinkedList<Entity> entites=list.get(hash);
        for (Entity entity : entites){
            if (entity.key.equals(key)){
                return entity.val;
            }
        }
        return null;
    }

    public void remove(K key){
    int hash=Math.abs(key.hashCode()% list.size());

    LinkedList<Entity> entities=list.get(hash);
    Entity target= null;

    for (Entity entity:entities){
        if (entity.key.equals(key)){
            target=entity;
            break;

        }
    }
    entities.remove(target);
    size--;
    }
    @Override
    public String toString(){
    StringBuilder builder=new StringBuilder();
    builder.append("{");
        for (LinkedList<Entity> entries:list){
            for (Entity entry: entries){
                builder.append(entry.key);
                builder.append("=");
                builder.append(entry.val);
                builder.append(", ");
            }
        }
    builder.append("}");
    return builder.toString();
    }
    private class Entity{
//        public V value;
        K key;
        V val;

        private Entity(K key, V val){
            this.key=key;
            this.val=val;
        }
    }

}
