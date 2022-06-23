package examples.day26;

/*
    Example used in tutorial: https://youtu.be/w5ReZxTo4yc
 */

public class BinarySearchTree {

    public static void main(String[] args) throws Exception {
        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(5);

        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
    }
}
