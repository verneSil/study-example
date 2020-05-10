public class NodeTools {

    public static MyNode initialRandomNodes(int count) {
        MyNode tmpLastNode = null;
        MyNode tmpHead = null;
        for (int i = 0; i < count; i++) {
            int numberToSet = ((Double) (Math.random() * 10)).intValue();
            MyNode myNode = new MyNode();
            myNode.setNumber(numberToSet);
            //如果没有初始化第一个
            if (tmpHead == null) {
                tmpLastNode = myNode;
                tmpHead = myNode;
            } else {
                tmpLastNode.setNext(myNode);
                myNode.setLast(tmpLastNode);
                tmpLastNode = myNode;
            }
        }
        return tmpHead;
    }

    public static MyNode reversNodes(MyNode head) {
        MyNode tmpHead = null;
        MyNode tmpNode = head;
        MyNode tmpNext;
        MyNode tmpLast;
        for (; ; ) {
            tmpLast = tmpNode.getLast();
            tmpNext = tmpNode.getNext();
            if (tmpLast == null) {
                tmpNode.setNext(null);
                tmpNode.setLast(tmpNext);
            } else {
                tmpNode.setNext(tmpLast);
                tmpNode.setLast(tmpNext);
            }
            if (tmpNext == null) {
                tmpHead = tmpNode;
                tmpHead.setLast(null);
                return tmpHead;
            } else {
                tmpNode = tmpNext;
            }
        }
    }


    public static MyNode reverNodesEveryK(MyNode head, int k) {
        MyNode tmpNode = head;
        MyNode tmpKHead = null;
        MyNode tmpKLast = null;
        MyNode tmpKNext = null;

        MyNode resultHead;
        MyNode resultTail;
        int count4k = 0;
        for (; ; ) {
            count4k++;
            if (tmpNode == null) {
                break;
            }
            if (count4k == 1) tmpKLast = tmpNode.getLast();
            if (count4k == k) {
                tmpKNext = tmpNode.getNext();
                // 倒序便利已经读过的k个节点.
                MyNode result[] = reverseTmpNode(tmpNode, k);
                resultHead = result[0];
                resultTail = result[1];
                if (tmpKLast == null) {
                    tmpKHead = resultHead;
                    tmpKHead.setLast(null);
                } else {
                    tmpKLast.setNext(resultHead);
                    resultHead.setLast(tmpKLast);
                }
                if (tmpKNext == null) {
                    resultTail.setNext(null);
                } else {
                    resultTail.setNext(tmpKNext);
                    tmpKNext.setLast(resultTail);
                }

                count4k = 0;
            }
            if (count4k == 0) {
                tmpNode = tmpKNext;
            } else {
                tmpNode = tmpNode.getNext();
            }
            if (tmpNode == null) {
                break;
            }
        }
        return tmpKHead;
    }

    private static MyNode[] reverseTmpNode(MyNode tmpTail, int k) {
        MyNode currentNode = tmpTail;
        MyNode currentTmpLast = null;
        MyNode currentTmpNext = null;
        MyNode resultHead = null;
        MyNode resultTail = null;
        MyNode result[] = new MyNode[2];
        for (int i = 0; i < k; i++) {
            currentTmpLast = currentNode.getLast();
            currentTmpNext = currentNode.getNext();

            if (i == 0 && i != k - 1) {
                resultHead = currentNode;
                currentNode.setLast(null);
                currentNode.setNext(currentTmpLast);
            } else if (i != 0 && i != k - 1) {
                currentNode.setNext(currentTmpLast);
                currentNode.setLast(currentTmpNext);
            } else if (i == 0 && i == k - 1) {
                resultHead = currentNode;
                resultTail = currentNode;
            } else if (i != 0 && i == k - 1) {
                resultTail = currentNode;
                currentNode.setNext(null);
                currentNode.setLast(currentTmpNext);
            }
            currentNode = currentTmpLast;
        }
        result[0] = resultHead;
        result[1] = resultTail;
        return result;
    }

    public static void printNodes(MyNode head) {
        for (; ; ) {
            if (head == null) break;
            System.out.print("->" + head.getNumber());
            head = head.next;
        }
        System.out.println();
    }


    public static class MyNode {
        private int number;
        private MyNode next;
        private MyNode last;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public MyNode getNext() {
            return next;
        }

        public void setNext(MyNode next) {
            this.next = next;
        }

        public MyNode getLast() {
            return last;
        }

        public void setLast(MyNode last) {
            this.last = last;
        }
    }
}
