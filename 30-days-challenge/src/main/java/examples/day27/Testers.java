package examples.day27;

/*
    Example used in tutorial: https://youtu.be/yBqNIeUyGKM
 */

import java.util.Random;

public class Testers {

    public static void checkIsEmpty(Tree t) throws Exception {
        if (t instanceof EmptyBST) {
            if (t.isEmpty()) throw new Exception("All is good, the tree is an EmptyBST and it's empty");
        } else if (t instanceof NonEmptyBST) {
            if (!t.isEmpty()) throw new Exception("All is good, the tree is an NonEmptyBST and it's non-empty");
        }
    }

    public static void checkAddMemberCardinality(Tree t, int x) throws Exception {
        int nT = (t.add(x)).cardinality();
        if (nT == (t.cardinality() + 1)) {
            if (t.member(x)) throw new Exception("The cardinality incresed by 1, but the thing" +
                    "that was added was already a member of the tree.");
            else System.out.println("All is good, our cardinality increased and the thing wasn't in the tree");
        } else if (nT == t.cardinality()) {
            if (!t.member(x)) throw new Exception("The cardinality didn't increased by 1, but " +
                    "we added a new thing.");
            else System.out.println("All is good, the thing was in the tree and the cardinality didn't increased");
        } else {
            throw new Exception("Something is wrong with the program.");
        }
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static Tree randTree(int count) {
        if (count == 0) return new EmptyBST();
        else return randTree(count - 1).add(randInt(0, 50));
    }
}
