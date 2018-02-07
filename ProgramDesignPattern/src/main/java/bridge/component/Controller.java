package bridge.component;

public abstract class Controller {
    private TV tv;

    public abstract void openTv();

    public abstract void closeTv();

    public abstract void changeTV();

    public Controller(TV tv) {
        this.tv = tv;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
