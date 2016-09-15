package ocpjp6.ch02;

/**
 * Created by grzesikl on 06/06/2016.
 */


public interface Bounceable extends  Movable, Spherical{ //can extend multiple interfaces!
    public void bounce();
    public void setBounceFactor(int bf);
}
