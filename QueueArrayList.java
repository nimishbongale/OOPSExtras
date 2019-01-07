public class QueueArrayList {

	public static final int DEFAULT_SIZE = 5;

	private Object data[];

	private int index;

	public QueueArrayList() {
		data = new Object[DEFAULT_SIZE];
	}

	public boolean isEmpty() {
		return index == 0;
	}

	public void enqueue(Object obj) throws Exception {
		if (index == DEFAULT_SIZE - 1) {
			throw new Exception("Queue is full. Dequeue some objects");
		}
		this.data[index] = obj;
		this.index++;
	}

	public Object dequeue() throws Exception {
		if (isEmpty())
			throw new Exception("Queue is empty");
		Object obj = this.data[0];
		for (int i = 0; i < this.index - 1; i++) {
			data[i] = data[i + 1];
		}
		this.index--;
		return obj;

	}

	public void print() throws Exception {
		if (isEmpty())
			throw new Exception("Queue is empty");
		for (int i = 0; i < this.index; i++) {
			Object obj = this.data[i];
			System.out.println(obj.toString());
		}
	}

	public static void main(String[] args) throws Exception {

		QueueArrayList queue = new QueueArrayList();
		queue.enqueue("Bangalore");
		queue.dequeue();

		queue.enqueue("Delhi");
		queue.enqueue("Kolkata");
		queue.enqueue("Chennai");
		queue.dequeue();

		queue.enqueue("Mangalore");
		queue.enqueue("Mumbai");
		
		System.out.println("Contents of queue");
		queue.print();
	}

}