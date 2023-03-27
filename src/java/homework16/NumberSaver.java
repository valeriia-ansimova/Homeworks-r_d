package homework16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NumberSaver {

    private List<Integer> longList = new ArrayList<>(2000000);
    private List<Integer> shortList = new LinkedList<>();

    public void addToLongList(Integer number) {
        longList.add(number);
    }

    public void addToShortList(Integer number) {
        shortList.add(number);
    }

    @Override
    public String toString() {
        return "NumberSaver{" +
                "longList=" + longList +
                ", shortList=" + shortList +
                '}';
    }
}
