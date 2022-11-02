public class PairEx<E extends Comparable<E>> 
    implements Comparable<PairEx<E>> {
    private E value1;
    private E value2;

    public PairEx(E value1, E value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public E getValue1() {
        return value1;
    }

    public E getValue2() {
        return value2;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value1 == null) ? 0 : value1.hashCode());
        result = prime * result + ((value2 == null) ? 0 : value2.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PairEx<?> other = (PairEx<?>) obj;
        if (value1 == null) {
            if (other.value1 != null)
                return false;
        }
        else if (!value1.equals(other.value1))
            return false;
        if (value2 == null) {
            if (other.value2 != null)
                return false;
        }
        else if (!value2.equals(other.value2))
            return false;
        return true;
    }

    @Override
    public int compareTo(PairEx<E> o) {
        int res = value1.compareTo(o.value1);
        if (res == 0) {
            return value2.compareTo(o.value2);
        }

        return res;
    }

    @Override
    public String toString() {
        return "X" + value1 + ", " + value2 + "Y";
    }
}
