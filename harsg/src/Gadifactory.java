public class Gadifactory {
    // properties
    int noOfMachine;
    int noOfOffice;
    int noofowner;
    int noOfEmployee;

    String name;


    //behaviour
    void tyre (Gadifactory gadifactory){
        System.out.println(gadifactory.name+"is tyre");
    }
    void engine (Gadifactory gadifactory){
        System.out.println(gadifactory.name+"is engine");
    }
    void sheet(Gadifactory gadifactory){
        System.out.println(gadifactory.name+"is sheeting");
    }

}
