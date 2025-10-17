package array.list.inheritance;

import java.util.ArrayList;

public class ModArrayList<D> extends ArrayList<D> {

    public D getUsingMod(int index) {
        int modIndex = Math.abs(index) % this.size();
        return this.get(modIndex);
    }
}
