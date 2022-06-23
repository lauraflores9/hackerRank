package examples.day26;

/*
    Example used in tutorial: https://youtu.be/w5ReZxTo4yc
 */

public class Testers {

    public static void checkIsEmpty(Tree t) throws Exception {
        if (t instanceof EmptyBST) {
            if (t.isEmpty()) throw new Exception("All is good, the tree is an EmptyBST and it's empty");
        } else if (t instanceof NonEmptyBST) {
            if (!t.isEmpty()) throw new Exception("All is good, the tree is an NonEmptyBST and it's non-empty");
        }
    }
}
