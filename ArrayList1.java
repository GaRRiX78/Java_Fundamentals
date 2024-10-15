


import java.lang.Object;

public class ArrayList1<E>{
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public ArrayList1() {
    }

    public int getSize() {
        return this.list.size();
    }

    public E peek() {
        return this.list.get(this.getSize() - 1);
    }

    public void push(E var1) {
        this.list.add(var1);
    }

    public E pop() {
        Object var1 = this.list.get(this.getSize() - 1);
        this.list.remove(this.getSize() - 1);
        return (E) var1;
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public String toString() {
        return "stack: " + this.list.toString();
    }

    public static void main(String[] var0) {
        ArrayList1 var1 = new ArrayList1();
        var1.push("London");
        var1.push("Paris");
        var1.push("Berlin");
        String var2 = var1.toString();
        System.out.println(var2);
        System.out.println("Size of Stack:" + var1.getSize());
        System.out.println((String)var1.peek());
        String var3 = (String)var1.pop();
        System.out.println(var3);
        System.out.println(var1.isEmpty());
        ArrayList1 var4 = new ArrayList1();
        var4.push(1);
        var4.push(2);
        var4.push(3);
        String var5 = var4.toString();
        System.out.println(var5);
        System.out.println("Size of Stack:" + var4.getSize());
        System.out.println(var4.peek());
        int var6 = (Integer)var4.pop();
        System.out.println(var6);
        System.out.println(var4.isEmpty());
    }
}
