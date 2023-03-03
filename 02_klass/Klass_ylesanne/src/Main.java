public class Main {
    public static void main(String[] args) {
        User kristjan = new User("krissu", "krissu", "krissusp@tlu.ee", "Kristjan", "Peedisson");

        User kristjan1 = new User("krissu", "krissu", "krissusp@tlu.ee", "Kristjan", "Peedisson");

        User kristjan2 = new User("krissu", "krissu", "krissusp@tlu.ee", "Kristjan", "Peedisson");

        String sonum = kristjan.deleteUser();
        System.out.println(sonum);

        kristjan2.changePassword("krissu2");

    }


}