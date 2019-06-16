import java.util.HashMap;
import java.util.Map;


public class Bins {

    private Map<Integer, Integer> binMap = new HashMap<Integer, Integer>();

    public Bins(Integer minimum, Integer maximum){
        for (int i = minimum; i < maximum + 1; i++){
            this.binMap.put(i,0);
        }
    }
}
