public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        Programmer programmer = new Programmer("Farida", "Java Backend", "Apple");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("------------------------------------------------");
        Dancer dancer = new Dancer("Bekzat", "Salsa", "YouTube dancer");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println("------------------------------------------------");
        Singer singer = new Singer("Azamat", "Countertenor", "BTS");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar("Classical guitar");
        System.out.println("------------------------------------------------");
    }
}
