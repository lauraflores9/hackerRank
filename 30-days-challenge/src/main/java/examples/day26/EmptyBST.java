package examples.day26;

/*
    Example used in tutorial: https://youtu.be/w5ReZxTo4yc
 */

public class EmptyBST<D extends Comparable> implements Tree<D> {
    public EmptyBST(){}

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(D elem) {
        return false;
    }

    @Override
    public NonEmptyBST<D> add(D elem) {
        return new NonEmptyBST<D>(elem);
    }
}
