package bitmanipulation;

public class PairwiseSwap {
    public static int pairWiseSwap(Integer value) {
        Integer mask = 0;
        // odd bits first
        for (int i = 0; i < Integer.BYTES * 4; i += 2) {
            mask += (int) Math.pow((double)2, (double)i);
        }
        return ((value & mask) << 1) | ((value & (mask << 1)) >> 1);
    }
}
