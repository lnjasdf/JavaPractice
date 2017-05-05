package pattern.creational.Prototype;

import java.io.Serializable;

/**
 * Created by lnjasdf on 2017/5/5.
 */
public class Professor implements Cloneable, Serializable {
    private static final long serialVersionUID = -8116435789074075509L;
    public String name;
    public int age;

    public Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
