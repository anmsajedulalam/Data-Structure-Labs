package parentheses;

public class ArrayStack implements Stack {

    int size;
    int top;
    Object[] data;

    public ArrayStack() {
        size = 0;
        top = -1;
        data = new Object[5];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        boolean b=false;

        if (size == 0) {
            b = true;
        }

        return b;
    }

    public void push(Object e) throws StackOverflowException {
        if (size == data.length) {
            throw new StackOverflowException("ArrayOutOfBound Exception");
        } else {
            top++;
            data[top] = e;
            size++;
        }

    }

    public Object pop() throws StackUnderflowException {
        Object temp;
        if (size == 0) {
            throw new StackUnderflowException("ArrayStackUnderflow Exception");
        } else {
            temp=data[top];
            data[top]=null;
            top--;
            size--;
        }
        return temp;
    }

    public Object peek() throws StackUnderflowException {
        if (size == 0) {
            throw new StackUnderflowException("ArrayStackUnderflow Exception");
        }
        
        return data[top];
    }

    public String toString() {
        String s = "";
        for (int i = size-1; i >=0; i--) {
            s = s + data[i]+" ";
        }

        return s;
    }

    public Object[] toArray() {
        Object []temp=new Object[size];
        
        for(int i=size-1;i>=0;i--){
            temp[i]=data[i];
            System.out.print(temp[i]+" ");
        }
        System.out.println();
        return temp;
    }

    public int search(Object e) {
        int idx=0;
        int i;
        for(i=size-1;i>=0;i--){
            if(data[i].equals(e)){
                break;
            }else{
                idx++;
            }
        }
        if(i==-1){
            return -1;
        }
        
            return idx;
        
    }
}
