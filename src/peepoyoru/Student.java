package peepoyoru;

public class Student {

    String name;
    int age;

    public Student(String name,int age){

        this.name=name;
        this.age=age;

    }

    public void Intro() {
        System.out.println(name+","+age);
    }


}
