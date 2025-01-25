package hash;

public class main {
//    public static void main(String[] args) {
//        String name="dhiman";
//        String name1="samir";
//        String name2="samir";
//        System.out.println(name2.hashCode());
//        System.out.println(name1.hashCode());
//
//
//
//
//        int  code=name.hashCode();
//        System.out.println(code);
//
//
//    }

    public static void main(String[] args) {
        useLL<String,String> map=new useLL<>();

        map.put("mango","king of fruit");
        map.put("apple","red fruit");
        map.put("banana","yelow fruit");

        System.out.println(map.get("apple"));
        System.out.println(map.get("mango"));
    }


}
