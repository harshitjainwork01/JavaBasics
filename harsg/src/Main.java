// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        //objects are created  from a class using new keyword.
        Bird crow = new Bird();
        // It has properties of that class as well as behaviours.
        //  Objects have their own state.
        crow.eye =2;
        crow.hight= 3;
        crow.size=4;
        crow.lenth=5;
        crow.name = "Crow";

        crow.flying(crow);


        Bird sparrow = new Bird();
        sparrow.name = "Sparrow";
        sparrow.flying(sparrow);

    }
}
