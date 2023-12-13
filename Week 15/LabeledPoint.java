// Objects import for equals / compareTo methods
import java.util.Objects;

public class LabeledPoint implements Comparable {

    // instance vars
    public int x;
    public int y;
    public String label;

    // constructor - takes in x, y, and label
    public LabeledPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }
    

    // hashCode method - simply returns hash of x, y, and label
    public int hashCode() {
        return Objects.hash(x, y, label);
    }

    // equals method - checks if object is a LabeledPoint, then checks if
    // x, y, and label are equal to existing LabeledPoint
    public boolean equals(Object object) {
        boolean isLabeledPoint = object instanceof LabeledPoint;

        if (isLabeledPoint == true) {
            LabeledPoint lp = (LabeledPoint) object;
            return this.x == lp.x && this.y == lp.y && this.label.equals(lp.label);
        } else {
            return false;
        }

    }

    // compareTo method - admittedly a little confused on this but again checking if
    // object is a LabeledPoint, then checking for equality of x, y, and label and returning
    // an int based on the result (i.e a point of 1, 2, "ABC" is less than a point of
    // 2, 2, "ABC" because this.x - lp.x is -1)
    @Override public int compareTo(Object object) {
        boolean isLabeledPoint = object instanceof LabeledPoint;

        if (isLabeledPoint == true) {
            LabeledPoint lp = (LabeledPoint) object;
            if (this.x == lp.x) {
                if (this.y == lp.y) {
                    return this.label.compareTo(lp.label);
                } else {
                    return this.y - lp.y;
                }
            } else {
                return this.x - lp.x;
            }
        } else {
            return -1;
        }
    }

}