package BehaviouralDesignPattern.ObserverPattern.CricketObserver;

public class CricketMain {

	public static void main(String[] args) {
		// create objects for testing
        AverageScoreDisplay averageScoreDisplay =
                          new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay =
                          new CurrentScoreDisplay();
  
        // pass the displays to Cricket data
        CricketData cricketData = new CricketData();
  
        // register display elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);
  
        // in real app you would have some logic to
        // call this function when data changes
        cricketData.runs = 90;
        cricketData.wickets = 2;
        cricketData.overs = (float) 11.0;
        cricketData.dataChanged();
  
        //remove an observer
        cricketData.unregisterObserver(averageScoreDisplay);
  
        // now only currentSoreDisplay gets the
        // notification
        cricketData.runs = 100;
        cricketData.wickets = 2;
        cricketData.overs = (float) 12.0;
        cricketData.dataChanged();

	}

}
