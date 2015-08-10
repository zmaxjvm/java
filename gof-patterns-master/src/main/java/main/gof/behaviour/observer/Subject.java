package main.gof.behaviour.observer;

/**
 * Created by zmax.
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
