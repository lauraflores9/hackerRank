package examples.day26;

/*
    Example used in tutorial: https://youtu.be/w5ReZxTo4yc
 */

public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elem);
    public NonEmptyBST<D> add(D elem);
}
