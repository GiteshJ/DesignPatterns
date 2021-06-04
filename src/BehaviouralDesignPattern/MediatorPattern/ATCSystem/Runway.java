package BehaviouralDesignPattern.MediatorPattern.ATCSystem;

public class Runway implements Runnable {
    // 3. Consumers are coupled only to the Mediator
    private ATC med;
    private int    id;
    private static int num = 1;

    public Runway(ATC m) {
        med = m;
        id = num++;
    }

    @Override
    public void run() {
        while (true) {
            System.out.print("Runway-" + id + "-" + med.landFlight() + "  ");
        }
    }
}
