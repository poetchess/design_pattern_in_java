package poetchess.observer.weather;

/**
 * Created by poetchess on 17-6-13.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
