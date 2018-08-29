package bitmanipulation;

public class PairwiseSwap {
    public static int pairWiseSwap(Integer value) {
        return ((value & 0x55555555) << 1) | ((value & 0xAAAAAAAA) >>> 1);
    }
}
