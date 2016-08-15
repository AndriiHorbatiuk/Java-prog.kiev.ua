package Lesson7.Generic.Pair;

/**
 * Created by Andrey on 15.08.2016.
 */
public class Pair<L, R> {
    private L left;
    private R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Range{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
