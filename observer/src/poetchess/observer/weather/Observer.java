package poetchess.observer.weather;

/**
 * Created by poetchess on 17-6-13.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
