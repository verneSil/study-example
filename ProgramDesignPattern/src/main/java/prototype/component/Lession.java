package prototype.component;

/**
 * @author verne on 18-2-6.
 * @version 1.0
 */

public class Lession implements Cloneable{

    private String lessionName;
    private long lessionLong;

    public String getLessionName() {
        return lessionName;
    }

    public void setLessionName(String lessionName) {
        this.lessionName = lessionName;
    }

    public long getLessionLong() {
        return lessionLong;
    }

    public void setLessionLong(long lessionLong) {
        this.lessionLong = lessionLong;
    }

    @Override
    public Lession clone() throws CloneNotSupportedException {
        Lession lession = (Lession)super.clone();
        return lession;
    }

    @Override
    public String toString() {
        return "Lession{" +
                "lessionName='" + lessionName + '\'' +
                ", lessionLong=" + lessionLong +
                '}';
    }
}
