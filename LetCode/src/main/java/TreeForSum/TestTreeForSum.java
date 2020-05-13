package TreeForSum;


import java.util.Random;

public class TestTreeForSum {
    // 这个提没有写出来
    public static void main(String[] args) {
        TreeNode treeNode = initNewTree();
        printCurrentNode(treeNode);
        boolean f = findTarget(treeNode, 10);
        System.out.println(f);
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

    //    0 1 2 3 4 5 6 7 8 9 0
    //    1 1 1 1 1 1
    public static boolean findTarget(TreeNode root, int k) {
        int[] bow = new int[65535];
        int[] xbow = new int[65536];
        getResult(root, bow, xbow);
        for (int i = -65536; i < 65535; i++) {
            if (i < 0) {
                if (xbow[i] == 1 && bow[k - i] == 1) return true;
            } else {
                if (bow[i] == 1 && bow[k - i] == 1) return true;
            }
        }
        return false;
    }

    public static void getResult(TreeNode root, int[] bow, int[] xbow) {
        if (root.val >= 0) {
            bow[root.val] = 1;
        } else {
            xbow[-root.val] = 1;
        }
        if (root.left != null) {
            getResult(root.left, bow, xbow);
        }
        if (root.right != null) {
            getResult(root.right, bow, xbow);
        }
    }

    public static int getBowNumber(int k, int[] bow, int[] xbow) {
        if (k >= 0) {
            return bow[k];
        } else {
            return xbow[-k];
        }
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
}

