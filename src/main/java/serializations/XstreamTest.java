package serializations;

import com.thoughtworks.xstream.XStream;

public class XstreamTest {
    public static void main(String[] args) {


        XStream xStream = new XStream();
        Student student = new Student();
        student.setAge(21);
        student.setName("Victor");
        //Serialization
        String url = xStream.toXML(student);
        System.out.println(url);
        //Deserealisation
        Student newJone=(Student)xStream.fromXML(url);
        System.out.println(newJone);
    }
}
