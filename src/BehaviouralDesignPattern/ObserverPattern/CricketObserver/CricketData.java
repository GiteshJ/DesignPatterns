package BehaviouralDesignPattern.ObserverPattern.CricketObserver;

import java.util.ArrayList;
import java.util.Iterator;

class CricketData implements Subject
{
    int runs;
    int wickets;
    float overs;
    ArrayList<Observer> observerList;
  
    public CricketData() {
        observerList = new ArrayList<Observer>();
    }
  
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }
  
    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }
  
    @Override
    public void notifyObservers()
    {
        for (Iterator<Observer> it =
              observerList.iterator(); it.hasNext();)
        {
            Observer o = it.next();
            o.update(runs,wickets,overs);
        }
    }
  
    // get latest runs from stadium
    private int getLatestRuns()
    {
        // return 90 for simplicity
        return runs;
    }
  
    // get latest wickets from stadium
    private int getLatestWickets()
    {
        // return 2 for simplicity
        return wickets;
    }
  
    // get latest overs from stadium
    private float getLatestOvers()
    {
        // return 90 for simplicity
        return overs;
    }
  
    // This method is used update displays
    // when data changes
    public void dataChanged()
    {
        //get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();
  
        notifyObservers();
    }
}