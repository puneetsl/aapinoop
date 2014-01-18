package indian.politics;

public class Kejriwal {
	private static volatile Kejriwal instance = null;

	private Kejriwal() {
	}

	public static Kejriwal getInstance() {
		if (instance == null) {
			synchronized (Kejriwal.class) {
				if (instance == null) {
					instance = new Kejriwal();
				}
			}
		}
		return instance;
	}
	protected void honesty()
	{
		System.out.println("I am honest, every one else is dalal");
		honesty();//infinite until stackoverflow
	}
}
