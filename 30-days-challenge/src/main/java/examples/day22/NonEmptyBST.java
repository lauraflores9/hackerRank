package examples.day22;

/*
    Example used in tutorial: https://youtu.be/cqoGE1GPqU8
 */

public class NonEmptyBST<D extends Comparable> implements Tree<D> {
    D data;
    Tree<D> left;
    Tree<D> right;

    public NonEmptyBST(D elem) {
        data = elem;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }

    public NonEmptyBST(D elem, Tree<D> leftTree, Tree<D> rightTree) {
        data = elem;
        left = leftTree;
        right = rightTree;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return (1 + left.cardinality() + right.cardinality());
    }

    @Override
    public boolean member(D elem) {
        if (data == elem) return true;
        else {
            if (elem.compareTo(data) < 0) return left.member(elem);
            else return right.member(elem);
        }
    }

    @Override
    public NonEmptyBST<D> add(D elem) {
        if (data == elem) return this;
        else {
            if (elem.compareTo(data) < 0) return new NonEmptyBST<>(data, left.add(elem), right);
            else return new NonEmptyBST<>(data, left, right.add(elem));
        }
    }
}