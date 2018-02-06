package prototype.component;

/**
 * @author verne on 18-2-6.
 * @version 1.0
 */

public class Student implements Cloneable{
    private  String name ;
    private String gender;
    private Lession lession;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Lession getLession() {
        return lession;
    }

    public void setLession(Lession lession) {
        this.lession = lession;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student clone =(Student) super.clone();
        clone.setLession(this.lession.clone());
        return clone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", lession=" + lession.toString() +
                '}';
    }
}
