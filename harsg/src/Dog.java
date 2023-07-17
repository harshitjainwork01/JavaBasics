public class Dog {
    //properties
    int size;
    int height;
    int length;
    String name;

    //behaviour

    void sleep(Dog dog){
        System.out.println(dog.name+" is sleeping");
    }
    void crying(Dog dog){
        System.out.println(dog.name+" is crying");
    }
    void shout(Dog dog){
        System.out.println(dog.name+" is shouting");

    }

}
