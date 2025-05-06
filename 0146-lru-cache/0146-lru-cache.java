class LRUCache {

    private class Node {
        int key, val;
        Node prev, next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private final int capacity;
    private Node head, tail;
    private HashMap<Integer, Node> cashe;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        cashe = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

        if (!cashe.containsKey(key))
            return -1;

        Node existNode = cashe.get(key);
        moveToFront(existNode);
        return existNode.val;
    }

    public void put(int key, int value) {

        if (cashe.containsKey(key)) {

            // update the old value then move this node to the first
            Node existNode = cashe.get(key);
            existNode.val = value;
            moveToFront(existNode);

        } else {

            if (cashe.size() == capacity) {

                // remove the lru and then add it at fisrt
                Node lru = tail.prev;
                cashe.remove(lru.key);
                removeLRU();
            }

            //insert into map and then to dll at first
            Node newNode = new Node(key, value);
            addToFront(newNode);
            cashe.put(key, newNode);

        }
    }

    private void addToFront(Node node) {

        //inset the new node at the first on linkedlist to be as most_recent_used
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    private void moveToFront(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        addToFront(node);
    }

    private void removeLRU() {

        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */