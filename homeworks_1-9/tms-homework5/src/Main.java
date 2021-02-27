public class Main {
    public static void main(String[] args) throws InterruptedException {
        Rocket rocket1 = new Rocket("Апполон_1", 2);
        Rocket rocket2 = new Rocket();
        Cosmodrome cosmodrome = new Cosmodrome(rocket1);
        System.out.println(cosmodrome.getRocket().getName());
        cosmodrome.setRocket(rocket2);
        System.out.println(cosmodrome.getRocket().getName());


        cosmodrome.start();

    }
}
