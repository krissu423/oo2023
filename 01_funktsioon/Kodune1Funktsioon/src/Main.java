public class Main {
    public static void main(String[] args) {

        //prindib mingi arv kordi numbrit
        printNumber(10);

        //lahutab esimesest arvust teise, kui esimene arv on teisest suurem/võrdne
        int liitmisArv = 10;
        int lahutamisArv = 5;
        int tulemusArv = 0;

        System.out.println("----------------------");

        subtractNumber(liitmisArv, lahutamisArv);


    }

    private static void subtractNumber(int liitmisArv, int lahutamisArv) {
        int tulemusArv;
        if (liitmisArv >= lahutamisArv){
            tulemusArv = liitmisArv - lahutamisArv;
            System.out.println("Tulemus on: "+tulemusArv);
        }
    }

    private static void printNumber(int arv) {
        for (int i = 0; i < arv; i++) {
            System.out.println(i);
        }
    }
}