package BehaviouralDesignPattern.ObserverPattern.CricketObserver;

interface Observer
{
    public void update(int runs, int wickets,
                      float overs);
}