import java.util.List;

public class MixedSum {

    /*
     * Assumes input will only contain Integer or String types
     */
    public int sum(List<?> mixed) {
        int total = 0;  // declare outside the loop

        for (int i = 0; i < mixed.size(); i++) {
            Object item = mixed.get(i);  // get the actual element

            if (item instanceof Integer) {
                total += (Integer) item;
            } else if (item instanceof String) {
                int num = Integer.parseInt((String) item);
                total += num;
            }
        }

        return total;
    }
}
