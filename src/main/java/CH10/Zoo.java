package CH10;

public class Zoo {

    public static void main(String[] args) {

        //create object to display methods in class
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);


        Animal sasha = new Dog();
        sasha.makeSound();
       //changing instantiation from dog to cat
        sasha = new Cat();
        sasha.makeSound();
        //casting
        ((Cat) sasha).scratch();
        //adding feed class
        feed(sasha);
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("heres your dog food!!");
        }
        if(animal instanceof Cat){
            System.out.println("heres your cat food");

        }

    }
}
