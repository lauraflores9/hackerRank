package examples.day22;

/*
    Example used in tutorial: https://youtu.be/cqoGE1GPqU8
 */

public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elem);
    public NonEmptyBST<D> add(D elem);
}
