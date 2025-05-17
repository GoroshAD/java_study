public class LinkedStack {
    private Node tail; // ссылка на последний добавленный узел (обёртку)
    private int size; // размер стека, т.е. количество элементов в нём

    public void push(int value) {
        Node node = new Node(value); // создаём новый узел
        if (tail != null) { // если в стеке уже есть элементы
            node.setPrev(tail); // связываем новый узел с последним
        }
        tail = node; // назначаем новый узел последним узлом
        size++; // увеличиваем счётчик элементов
    }

    public int pop() {
        int res = tail.getValue();
        tail = tail.getPrev();
        --size;
        return res;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        if (isEmpty()) {
            return "EMPTY";
        }
        String res = "";
        Node start = tail;
        for (int i = 0; i < size - 1; ++i) {
            res += start.getValue() + " -> ";
            start = start.getPrev();
        }
        res += start.getValue();
        return res;
    }
}

