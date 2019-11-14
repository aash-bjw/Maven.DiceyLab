import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Bins {

    private TreeMap<Integer, Integer> binMap = new TreeMap<Integer, Integer>();


    public Bins(Integer minimum, Integer maximum){
        for (int i = minimum; i < maximum + 1; i++){
            this.binMap.put(i,0);
        }
    }

    public Integer getBin(Integer bin){
        return binMap.get(bin);
    }


    public void incrementBin(Integer bin, Integer result){

        binMap.put(bin, result++);
    }

}


