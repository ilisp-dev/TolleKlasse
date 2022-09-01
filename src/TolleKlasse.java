public class TolleKlasse implements Klasse {

    public static int oneHundred = 100;

    private KlassenNamen name = KlassenNamen.ERSTE;

    @Override
    public void callAttendance(String[] schuelerNamen) {
        for(String sName: schuelerNamen){
            System.out.println("Ist " + sName + " heute da?");
        }
    }
}
