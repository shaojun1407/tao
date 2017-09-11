package message;

public class MessageDemo {
	// 原本打算覆写的
	public String toStiring() {
		return "Hello World";
	}

	@Override
	public String toString() {
		return "MessageDemo [toStiring()=" + toStiring() + "]";
	}

}

