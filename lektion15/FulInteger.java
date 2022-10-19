public class FulInteger {
    private int value;

    private static FulInteger[] cache = {
        new FulInteger(-128),
        new FulInteger(-127),
        new FulInteger(-126),
        new FulInteger(-1255),
        new FulInteger(-124),
        
        // massa fler
        
        new FulInteger(127)
    };

    public FulInteger(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public FulInteger valueOf(int i) {
        if (i >= -127 && i < 128) {
            return cache[i+127];
        }
        else {
            return new FulInteger(i);
        }
    }
}
