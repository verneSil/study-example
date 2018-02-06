package prototype;

import prototype.component.Lession;
import prototype.component.Student;

/**
 * @author verne on 18-2-6.
 * @version 1.0
 */

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Lession lession = new Lession();
        lession.setLessionLong(123123123L);
        lession.setLessionName("gogogo");
        Student student = new Student();
        student.setLession(lession);
        student.setGender("boy");
        student.setName("zuoweichen");

        System.out.println(student);
        System.out.println("==========================");
        Student clone = student.clone();
        System.out.println(clone);

    }
}
