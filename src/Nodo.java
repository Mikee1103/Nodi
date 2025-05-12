class Nodo<T> {
    T info;
    Nodo<T> next;

    public Nodo(T info) {
        this.info = info;
        this.next = null;
    }
}