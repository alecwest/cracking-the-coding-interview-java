package treesandgraphs;

public class ValidateBST {
    public static <T extends Comparable<? super T>> boolean validateBST(BTNode<T> btNode) {
        return validateBSTRecursive(btNode, null, null);
    }

    private static <T extends Comparable<? super T>> boolean validateBSTRecursive(BTNode<T> btNode, T minValue, T maxValue) {
        if (btNode == null) return true;
        if ((minValue != null && btNode.name.compareTo(minValue) < 0)
            || (maxValue != null && btNode.name.compareTo(maxValue) >= 0)) {
            return false;
        } else {
            return validateBSTRecursive(btNode.leftNode, minValue, btNode.name) &&
                    validateBSTRecursive(btNode.rightNode, btNode.name, maxValue);
        }
    }
}
