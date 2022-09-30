public class Konstr {
    // private Konstr this;
    private int data;

    public Konstr(int data) {
        this.data = data;
    }

    public void setCrazyStuff(int data) {
        this.data = data * 22 + 4;
    }

    public static void main(String[] args) {
        int val1 = 5;
        int val2 = 7;
        Konstr data1 = new Konstr(val1);
        Konstr data2 = new Konstr(val2);

        int bosse = 45;
        data1.setCrazyStuff(bosse);
    }
}
