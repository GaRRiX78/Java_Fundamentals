class main {
    public static void main(String[] args) {
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());
        GenericsClass<String> stringObj = new GenericsClass<>("Object Oriented Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());
    }
}

class GenericsClass<T> {

    private T data;

    public GenericsClass(T data) {
        this.data = data;
    }
    public T getData() {
        return this.data;
    }
}

