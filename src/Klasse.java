//initiate the class
public class Klasse {
    //initiate the main method
    public static void main(String[] args) {
        //print each entry of KlassenNamen in a new line
        for (KlassenNamen name : KlassenNamen.values()) {
            System.out.println("Hallo " + name);
        }
        System.out.println("Liebe Grüße von Benjamin :)");
    }
}