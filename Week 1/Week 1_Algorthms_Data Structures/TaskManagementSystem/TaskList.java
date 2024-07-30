public class TaskList {
    private Node head;

    public TaskList() {
        head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTaskId() == taskId) {
                return current.getTask();
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean deleteTask(int taskId) {
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (current.getTask().getTaskId() == taskId) {
                if (prev != null) {
                    prev.setNext(current.getNext());
                } else {
                    head = current.getNext();
                }
                return true;
            }
            prev = current;
            current = current.getNext();
        }
        return false;
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getTask());
            current = current.getNext();
        }
    }
}
