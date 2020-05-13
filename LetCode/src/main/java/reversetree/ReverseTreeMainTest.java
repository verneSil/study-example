package reversetree;

/*public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}*/

import java.util.Random;

public class ReverseTreeMainTest {
    public static void main(String[] args) {
        TreeNode treeNode = initNewTree();
        printTreeLeft(treeNode);
        System.out.println();
        printCurrentNodeRight(treeNode);
        System.out.println();
        Solution solution = new Solution();
        solution.invertTree(treeNode);
        printTreeLeft(treeNode);
        System.out.println();
        printCurrentNodeRight(treeNode);
    }

    private static TreeNode initNewTree() {
        Random random = new Random();
        int depthToBe = random.nextInt(10);
        TreeNode treeHead = new TreeNode(random.nextInt(100));
        generateCurrentNode(depthToBe, 0, treeHead, random);
        return treeHead;
    }

    private static void generateCurrentNode(int depthoToBe, int currentDepth, TreeNode treeHead, Random random) {

        boolean hasRight = random.nextInt(10) > 1;
        boolean hasLeft = random.nextInt(10) > 1;
        int newDepth = currentDepth + 1;
        boolean hasChild = depthoToBe != currentDepth;
        if (hasLeft && hasChild) {
            treeHead.left = new TreeNode(random.nextInt(100));
            generateCurrentNode(depthoToBe, newDepth, treeHead.left, random);
        }
        if (hasRight && hasChild) {
            treeHead.right = new TreeNode(random.nextInt(100));
            generateCurrentNode(depthoToBe, newDepth, treeHead.right, random);
        }
    }

    private static void printTreeLeft(TreeNode head) {
        printCurrentNode(head);
    }

    private static void printCurrentNode(TreeNode head) {

        if (head.left != null) {
            printCurrentNode(head.left);
        }
        System.out.print("->" + head.val);
        if (head.right != null) {
            printCurrentNode(head.right);
        }
    }

    private static void printCurrentNodeRight(TreeNode head) {

        if (head.right != null) {
            printCurrentNode(head.right);
        }
        System.out.print("->" + head.val);
        if (head.left != null) {
            printCurrentNode(head.left);
        }
    }

}
