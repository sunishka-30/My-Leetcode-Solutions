class MyCircularQueue {

    final int[] ar;
        int front = 0;
    int rear = -1;
    int len = 0;

        public MyCircularQueue(int k) 
        { 
            ar = new int[k];
        }

        public boolean enQueue(int val) {
            if (!isFull()) {
                rear = (rear + 1) % ar.length;
                ar[rear] = val;
                len++;
                return true;
            } else return false;
        }

        public boolean deQueue() {
            if (!isEmpty()) {
                front = (front + 1) % ar.length;
                len--;
                return true;
            } else return false;
        }

        public int Front() { return isEmpty() ? -1 : ar[front];}

        public int Rear() {return isEmpty() ? -1 : ar[rear];}

        public boolean isEmpty() { return len == 0;}

        public boolean isFull() { return len == ar.length;}
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */