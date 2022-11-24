package tdas;

import java.util.ArrayList;
import java.util.List;

public class Pixbitd extends Pixel {

    public Pixbitd(String y, String x, String bit, String depth){

        this.setY(y);
        this.setX(x);
        this.setBit(bit);
        this.setDepth(depth);
        }

    public List<String> toLista() {

        List<String> pixbitlist = new ArrayList<String>();
        pixbitlist.add(y);
        pixbitlist.add(x);
        pixbitlist.add(bit);
        pixbitlist.add(depth);

        return pixbitlist;

    }


}
