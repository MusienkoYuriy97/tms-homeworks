import java.util.concurrent.TimeUnit;

public class Cosmodrome {
    private Rocket rocket;

    public Cosmodrome() {
    }

    public Cosmodrome(Rocket rocket) {
        this.rocket = rocket;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public void start() throws InterruptedException {
        if (rocket.checkStart()){
            System.out.println("Ракета - " + rocket.getName() + " прошла предстартовую проверку.");
            for (int i = 9; i >= 0 ; i--) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i);
            }
            rocket.start();
        }else {
            System.out.println("Ракета - " + rocket.getName() + " не прошла предстартовую проверку.");
        }
    }
}
