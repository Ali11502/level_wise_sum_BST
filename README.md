## README

### Problem 1: LevelWiseSum for a BST

This Java program computes the level-wise sum of nodes in a Binary Search Tree (BST) and prints the sums separated by a "-". The BST is constructed using linked list-based implementations of nodes and queues.

### Input and Output Format

- **Input Format:** 
  - The input contains space-separated positive integers for creating the BST. These integers are inserted into the BST in the given order.
- **Output Format:** 
  - The output contains level-wise sum values separated by "-".

**Example:**
- **Input:** `34 28 65 21 31 43 87 56 28 30`
- **Output:** `34-94-182-114`

### Class Descriptions

#### Problem1 Class

This is the main class that constructs the BST and computes the level-wise sum.

- **Inner Node Class:** Represents a node in the BST.
- **Fields:**
  - `Node root`: The root of the BST.
  - `LinkedList<Integer> linkedList`: Stores level-wise sums.
  - `ArrayList<Integer> arrayList`: Stores input integers.
- **Constructor:** Reads input values and inserts them into the BST.
- **Methods:**
  - `insert(int key)`: Inserts a node into the BST.
  - `traverse()`: Traverses the BST level by level and computes the sums.
  - `printLevelWiseSum()`: Prints the computed level-wise sums.

#### LinkedQueue Class

Implements a generic queue using a linked list.

- **Inner Node Class:** Represents a node in the queue.
- **Fields:**
  - `Node<E> front`: The front of the queue.
  - `Node<E> rear`: The rear of the queue.
  - `int count`: The number of elements in the queue.
- **Constructor:** Initializes an empty queue.
- **Methods:**
  - `enqueue(E value)`: Adds an element to the queue.
  - `dequeue()`: Removes and returns an element from the queue.
  - `isEmpty()`: Checks if the queue is empty.
  - `peek()`: Returns the front element without removing it.
  - `size()`: Returns the number of elements in the queue.

#### LinkedList Class

Implements a generic linked list.

- **Inner Node Class:** Represents a node in the linked list.
- **Fields:**
  - `Node head`: The head of the linked list.
  - `int size`: The number of elements in the linked list.
  - `int index`: The index for tracking positions in the list.
- **Constructor:** Initializes an empty linked list.
- **Methods:**
  - `add(T d)`: Adds an element to the linked list.
  - `find(T d)`: Checks if an element exists in the linked list.
  - `findNode(T d)`: Finds and returns a node with the given data.
  - `findIndex(int index)`: Checks if a node exists at the given index.
  - `getNode(int index)`: Returns the node at the given index.
  - `clear()`: Clears the linked list.
  - `delete(T d)`: Deletes an element from the linked list.
  - `get(int index)`: Returns the data at the given index.
  - `size()`: Returns the size of the linked list.
  - `toString()`: Returns a string representation of the linked list.
  - `insertBefore(Node n, T d)`: Inserts an element before a given node.

### How to Run

1. Compile the Java files:
   ```sh
   javac Problem1.java LinkedQueue.java LinkedList.java
   ```

2. Run the `Problem1` class:
   ```sh
   java Problem1
   ```

3. Enter space-separated integers as input when prompted. The program will then print the level-wise sum of the BST.

### Example Usage

```sh
$ java Problem1
Enter values: 34 28 65 21 31 43 87 56 28 30
34-94-182-114
```

### Notes

- Ensure that the `LinkedQueue.java` and `LinkedList.java` files are in the same directory as `Problem1.java`.
- The program uses a linked list-based queue to facilitate level order traversal of the BST.
- The program supports dynamic insertion and traversal to compute level-wise sums.
