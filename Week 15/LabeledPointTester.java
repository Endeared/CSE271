// TreeSet import
import java.util.TreeSet;

public class LabeledPointTester {

    public static void main(String[] args) {
        // creating 4 new labeled points
        LabeledPoint lp1 = new LabeledPoint(1, 2, "ABC");
        LabeledPoint lp2 = new LabeledPoint(2, 2, "ABC");
        LabeledPoint lp3 = new LabeledPoint(1, 2, "ABC");
        LabeledPoint lp4 = new LabeledPoint(2, 2, "DEF");

        // creating TreeSet of labeled points, inserting 4 labeled points (3 unique)
        TreeSet<LabeledPoint> lpTreeSet = new TreeSet<LabeledPoint>();
        lpTreeSet.add(lp1);
        lpTreeSet.add(lp2);
        lpTreeSet.add(lp3);
        lpTreeSet.add(lp4);

        System.out.println("=== PRINTING POINTS ===");
        // should print out 3 labeled points
        for (LabeledPoint lp : lpTreeSet) {
            System.out.println(lp.x + " " + lp.y + " " + lp.label);
        }
        System.out.println();

        System.out.println("=== TESTING EQUALITY ===");
        System.out.println(lp1.equals(lp2)); // should return false
        System.out.println(lp1.equals(lp3)); // should return true
        System.out.println();

        System.out.println("=== TESTING HASHCODE ===");
        System.out.println(lp1.hashCode()); // should return 95392
        System.out.println();

        System.out.println("=== TESTING COMPARETO ===");
        System.out.println(lp1.compareTo(lp2)); // should return -1
        System.out.println(lp1.compareTo(lp3)); // should return 0
        System.out.println(lp2.compareTo(lp4)); // returns -3
    }   
}
