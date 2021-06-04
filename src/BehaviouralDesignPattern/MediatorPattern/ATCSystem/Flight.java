package BehaviouralDesignPattern.MediatorPattern.ATCSystem;

public class Flight  implements Runnable {
    // 2. Producers are coupled only to the Mediator
    private ATC med;
    private int id;
    private static int num = 1;

    public Flight(ATC m) {
        med = m;
        id = num++;
    }

    @Override
    public void run() {
        int num;
        while (true) {
        	
            med.requestLanding(num = (int)(Math.random()*100));
            System.out.print( "Flight-" + id + "-" + num + "  " );
        }
    }
}
