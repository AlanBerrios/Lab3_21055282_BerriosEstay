package tdas;

import java.util.List;

public abstract class Pixel {

    protected String y;
    protected String x;
    protected String bit;
    protected String r;
    protected String g;
    protected String b;
    protected String hex;
    protected String depth;

    public abstract List<String> toLista();

    public String getY() {
        return y;
    }
    public void setY(String y) {
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getBit() {
        return bit;
    }

    public void setBit(String bit) {
        this.bit = bit;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

}
