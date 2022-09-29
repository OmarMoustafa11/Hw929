package CH12a;

import java.util.*;

public class Fruit {

    public static void main(String[] args) {
        setDemo();
    }

    public static void setDemo() {
        Set<String> fruit = new HashSet();
        fruit.add("Apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("lemon");
        fruit.add("orange");

//    System.out.println(fruit.size());
//    System.out.println(fruit);
//    fruit.remove("lemon");
//    System.out.println(fruit);

//    var i = fruit.iterator();
//    while(i.hasNext()) {
//        System.out.println(i.next());
//    }
//    for (String item: fruit){
//        System.out.println(item);
//    }
//    fruit.forEach(x -> System.out.println(x));
//    //same thing as>>
//    fruit.forEach(System.out::println);
    }
    //  System.out.println(fruit.stream().peek());

public static void mapDemo() {
    Map <String, Integer> fruitCalories = new HashMap();
    fruitCalories.put("Apple", 95);
    fruitCalories.put("lemon", 20);
    fruitCalories.put("banana", 105);
    fruitCalories.put("lemon", 45);
    fruitCalories.put("orange", 17);
//    System.out.println(fruitCalories.size());
//    System.out.println(fruitCalories);
//    System.out.println(fruitCalories.get("lemon"));
//    System.out.println(fruitCalories.entrySet());
//    fruitCalories.remove("orange");
//    System.out.println(fruitCalories);

    for(var entry: fruitCalories.entrySet()) {
        System.out.println(entry.getValue());}

    fruitCalories.forEach(
            (k,v) -> System.out.println("Fruit: " + k + ", Calories:" + v));


}}
        //instead of add method

//        List unchangeableList = List.of("apple","lemon","banana");
//        unchangeableList.add("orange");
//        unchangeableList.remove(1);
//
//    }

