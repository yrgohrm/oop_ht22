import java.util.ArrayList;
import java.util.List;

public class EqualsEx {
    private int data;
    private String foo;
    private List<Integer> bar;

    public EqualsEx(int data, String foo, List<Integer> bar) {
        this.data = data;
        this.foo = foo;
        this.bar = bar;
    }

    public EqualsEx(EqualsEx other) {
        this.data = other.data;
        this.foo = other.foo;
        this.bar = new ArrayList<>(other.bar);
    }

    public int getData() {
        return data;
    }

    public String getFoo() {
        return foo;
    }

    public List<Integer> getBar() {
        return bar;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + data;
        result = prime * result + ((bar == null) ? 0 : bar.hashCode());
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
        EqualsEx other = (EqualsEx) obj;
        if (data != other.data)
            return false;
        if (foo == null) {
            if (other.foo != null)
                return false;
        }
        else if (!foo.equals(other.foo))
            return false;
        if (bar == null) {
            if (other.bar != null)
                return false;
        }
        else if (!bar.equals(other.bar))
            return false;
        return true;
    }
}
