//package javaapplication4;

public class ArrayQueue implements Queue {

    int size;
    int front;
    int rear;
    Object[] data;

    public ArrayQueue() {
        size = 0;
        front = -1;
        rear = -1;
        data = new Object[20];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void enqueue(Object o) throws QueueOverflowException {
        if (size == data.length) {
            throw new QueueOverflowException();
        } else if (front == -1) {
            front++;
            rear++;
            data[rear] = o;
            size++;
        } else {
            rear = (rear + 1) % data.length;
            data[rear] = o;
            size++;

        }

    }

    public Object dequeue() throws QueueUnderflowException {
        if (size == 0) {
            throw new QueueUnderflowException();
        }
        Object frontElement = data[front];
        front = (front + 1) % data.length;
        size--;
        return frontElement;
    }

    public Object peek() throws QueueUnderflowException {
        if (size == 0) {
            throw new QueueUnderflowException();
        }
        Object frontElement = data[front];
        return frontElement;
    }

    public String toString() {
        return " ";
    }

    public int search(Object o) {
        return 0;
    }

    public Object[] toArray() {
        int k = front;
        Object temp[] = new Object[size];
        for (int i = 0; i < size; i++) {
            temp[i] = data[k];
            k = (k + 1) % data.length;
        }
        return temp;
    }
}
