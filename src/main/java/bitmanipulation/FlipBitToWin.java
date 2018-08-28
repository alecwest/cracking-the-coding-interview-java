package bitmanipulation;

public class FlipBitToWin {
    public static int flipBitToWin(int value) {
        BitCount maxBits = new BitCount();
        String binaryRep = Integer.toBinaryString(value);

        BitCount currBits = new BitCount();
        boolean addToNumRight = false;
        for (int i = 0; i < binaryRep.length(); i++) {
            boolean bit = binaryRep.charAt(i) == '1';
            if (!bit) {
                if (i > 0 && binaryRep.charAt(i - 1) == '0') {
                    addToNumRight = false;
                    currBits.numLeft = 0;
                    currBits.numRight = 0;
                } else if (addToNumRight) {
                    setMax(maxBits, currBits);
                    currBits.numLeft = currBits.numRight;
                    currBits.numRight = 0;
                    addToNumRight = false;
                } else {
                    addToNumRight = true;
                }
            } else {
                if (addToNumRight) {
                    currBits.numRight++;
                } else {
                    currBits.numLeft++;
                }
            }
        }
        setMax(maxBits, currBits);
        return maxBits.numLeft + maxBits.numRight + 1;
    }

    private static void setMax(BitCount currMax, BitCount newBitCount) {
        if (newBitCount.numLeft + newBitCount.numRight > currMax.numLeft + currMax.numRight) {
            currMax.numLeft = newBitCount.numLeft;
            currMax.numRight = newBitCount.numRight;
        }
    }

    private static class BitCount {
        public int numLeft = 0;
        public int numRight = 0;
    }
}
