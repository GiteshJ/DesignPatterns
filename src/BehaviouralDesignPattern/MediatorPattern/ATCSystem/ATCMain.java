package BehaviouralDesignPattern.MediatorPattern.ATCSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATCMain {
	
	public static void main(String[] args) {
		List<Thread> producerList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press ENTER for exit");
		ATC mb = new ATC();
		producerList.add(new Thread(new Flight(mb)));
		producerList.add(new Thread(new Flight(mb)));
		producerList.add(new Thread(new Flight(mb)));
		producerList.add(new Thread(new Flight(mb)));
		producerList.add(new Thread(new Flight(mb)));
		producerList.add(new Thread(new Runway(mb)));
		for (Thread p : producerList) {
			p.start();
		}
		boolean stop = false;
		String exit = scanner.nextLine();
		while (!stop) {
			if (exit.equals("")) {
				stop = true;
				for (Thread p : producerList) {
					p.stop();
				}
			}
		}
	}
}
