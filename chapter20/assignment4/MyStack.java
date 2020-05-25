package chapter20.assignment4;

public class MyStack {

    private Object[] arr;
    private int pos = 0;
  
    public MyStack() {
      this.arr = new Object[1];
    }

    public void push(Object obj) {
        if(pos > (arr.length-1)) {
            Object[] newArr = new Object[arr.length+1];
            for(int i = 0; i < arr.length; i ++) {
                newArr[i] = arr[i];
            }

            arr = newArr;
        }
        arr[pos] = obj;
        pos++;
    }

    public void add(Object obj) {
        push(obj);
    }
    
    public Object pop() {
        Object topOfStack = arr[arr.length-1];

        Object[] newArr = new Object[arr.length-1];
        for(int i = 0; i < newArr.length; i ++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
        pos--;
        return topOfStack;
    }

    public Object peek() {
        return arr[arr.length-1];
    }

    public boolean empty() {
        if(arr.length == 0) {
            return true;
        } 
        return false;
    }

    public int search(Object obj) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public Object[] toArray() {
      return arr;
    }
}