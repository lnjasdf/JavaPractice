package java.practice;

/**
 * Created by lnjasdf on 2016/7/4.
 */
public class EqualsHashCode {
    private int anInt;
    private float aFloat;
    private Double aDouble;
    private String string;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EqualsHashCode that = (EqualsHashCode) o;

        if (anInt != that.anInt) return false;
        if (Float.compare(that.aFloat, aFloat) != 0) return false;
        if (aDouble != null ? !aDouble.equals(that.aDouble) : that.aDouble != null) return false;
        return string != null ? string.equals(that.string) : that.string == null;

    }

    @Override
    public int hashCode() {
        int result = anInt;
        result = 31 * result + (aFloat != +0.0f ? Float.floatToIntBits(aFloat) : 0);
        result = 31 * result + (aDouble != null ? aDouble.hashCode() : 0);
        result = 31 * result + (string != null ? string.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EqualsHashCode{" +
                "anInt=" + anInt +
                ", aFloat=" + aFloat +
                ", aDouble=" + aDouble +
                ", string='" + string + '\'' +
                '}';
    }


    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
