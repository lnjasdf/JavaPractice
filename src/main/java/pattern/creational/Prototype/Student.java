package pattern.creational.Prototype;

import java.io.*;

/**
 * Created by lnjasdf on 2017/5/5.
 */
public class Student implements Cloneable, Serializable {
    private static final long serialVersionUID = 139008146036678083L;
    public String name;
    public int age;
    public Professor professor;

    public Student(String name, int age, Professor professor) {
        this.name = name;
        this.age = age;
        this.professor = professor;
    }

    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    public Object cloneDeep() throws  CloneNotSupportedException {
        Professor p = (Professor)professor.clone();
        Student student = (Student)super.clone();
        student.professor = p;
        return student;
    }

    /**
     * 序列化方式拷贝
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object cloneSerialize() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return oi.readObject();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", professor=" + professor +
                '}';
    }
}
