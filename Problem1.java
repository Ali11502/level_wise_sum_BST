import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem1 {
    private class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
        }
    }

    private Node root;
    static Node level = null;
    LinkedList<Integer> linkedList = new LinkedList<>();
    ArrayList<Integer> arrayList = new ArrayList<>();

    public Problem1() throws IOException {

        System.out.print("Enter vlues");
        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));
        String[] strNums;

        strNums = bi.readLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            arrayList.add(Integer.parseInt(strNums[i]));
        }
        for (int i = 0; i < arrayList.size(); i++)
            insert(arrayList.get(i));
    }

    public void insert(int key) {
        Node nn = new Node(key);
        if (root == null) {
            root = nn;
        } else {
            Node temp = root;
            Node prev = null;
            while (temp != null) {
                if (temp.data > key) {
                    prev = temp;
                    temp = temp.left;
                } else {
                    prev = temp;
                    temp = temp.right;
                }
            }
            if (key < prev.data) {
                prev.left = nn;
            } else {
                prev.right = nn;
            }
        }
    }

    private void traverse() {
        if (root == null) {
            System.out.println("empty tree");
            return;
        }
        LinkedQueue<Node> q = new LinkedQueue<>();
        q.enqueue(root);
        q.enqueue(level);
        linkedList.add(root.data);
        int sum = 0;
        while (true) {
            Node temp = q.dequeue();
            if (temp != level) {
                if (temp.left != null) {
                    q.enqueue(temp.left);
                    sum += temp.left.data;
                }
                if (temp.right != null) {
                    q.enqueue(temp.right);
                    sum += temp.right.data;
                }
            } else {
                if (q.isEmpty()) break;
                linkedList.add(sum);
                sum = 0;
                q.enqueue(level);
            }
        }
    }

    public void printLevelWiseSum() {
        traverse();
        for (int i = 0; i < linkedList.size(); i++) {
            if (i != linkedList.size() - 1) {
                System.out.print(linkedList.get(i) + "-");
            }
            if (i == linkedList.size() - 1) {
                System.out.print(linkedList.get(i));
            }
        }
    }


    public static void main(String[] args) throws IOException {
        Problem1 problem1 = new Problem1();

        problem1.printLevelWiseSum();


    }


}
