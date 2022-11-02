public class Pair2<T1 extends Comparable<T1>, T2 extends Comparable<T2>>
        implements Comparable<Pair2<T1, T2>> {
    private T1 val1;
    private T2 val2;

    public Pair2(T1 val1, T2 val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T1 getVal1() {
        return val1;
    }

    public T2 getVal2() {
        return val2;
    }

    @Override
    public int compareTo(Pair2<T1, T2> o) {
        int res = val1.compareTo(o.getVal1());
        if (res == 0) {
            return val2.compareTo(o.getVal2());
        }

        return res;
    }
}
