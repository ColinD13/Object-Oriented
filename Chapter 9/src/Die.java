import java.util.Random;

public class Die {
    protected int val;

    public int getVal() {
        return val;
    }

    public Die() {
        this.val = (int) (Math.random()*6)+1;
    }
}
