public class Bird {
    //properties
    int size;
    int hight;
    int lenth;
    int eye;

    String name;

    //behaviour
    void Shout(Bird bird){
        System.out.println(bird.name+"is shouting");
    }
    void crying(Bird bird){
        System.out.println(bird.name+"is crying");
    }

    void flying(Bird bird) {
        System.out.println(bird.name +" is flying");

    }


}
