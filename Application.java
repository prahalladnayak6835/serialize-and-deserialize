package ser_desr_home;



import java.io.*;
import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Employee e1=new Employee();
        Developer developer2=new Developer();
        System.out.println(e1.numofemp);
        System.out.println(developer2.numofdev);
        FileOutputStream fileOutputStream = new FileOutputStream("ser_des_home.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(e1);
        System.out.println("parent class serialized");
        try {
         objectOutputStream.writeObject(developer2);
         System.out.println("child clas serialized");
            }catch (Exception e){
                System.out.println(e);
            }

//        objectOutputStream.writeObject(developer2);
//        System.out.println("child clas serialized");

        FileInputStream fileInputStream=new FileInputStream("ser_des_home.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

        Employee e3= (Employee) objectInputStream.readObject();
        System.out.println(e1.numofemp);
        System.out.println("parent class deserialized");

        Developer developer3= (Developer) objectInputStream.readObject();
        System.out.println(developer3.numofdev);
        System.out.println("child class deserialized");

    }


}
