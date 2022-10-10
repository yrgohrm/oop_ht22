public class Subclass extends Base {
    private Integer i;

    public Subclass() {
        super();
        this.i = 1;
    }

    public void setName(String name) {
        super.setName(name + i.toString());
    }
}
