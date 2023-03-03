public class Main {
    public static void main(String[] args) {
        Track kristjan = new Track(10, "kristjan", "kristjan");
        Track kristjan2 = new Track(14, "kristjan2", "kristjan2");

        String sonum = kristjan.deleteTrack();
        System.out.println(sonum);

        kristjan2.changeTime(12);
    }


}