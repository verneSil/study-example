package reverselist;

public class ReverseListMainTest {
    public static void main(String[] args) {
        // 指定k个的链表反转.最后多余的不反转
        // 1  2 3 4 5 6 7 8 9 0  ; 假设k=3
        // 3 2 1  6 4 5 9 8 7 0;
        Double random = Math.random();
        //int count = ((Double) (random * 10)).intValue() ;
        int count = 100;
        NodeTools.MyNode myNode = NodeTools.initialRandomNodes(count);
        NodeTools.printNodes(myNode);
//        reverselist.NodeTools.MyNode reversedHead= reverselist.NodeTools.reversNodes(myNode);
//        reverselist.NodeTools.printNodes(reversedHead);
        NodeTools.MyNode reverseKHead = NodeTools.reverNodesEveryK(myNode, 17);
        NodeTools.printNodes(reverseKHead);
    }
}
