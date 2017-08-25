package InterfaceStuff;

public class Gas extends abstractMain {
	public Gas() {
		boom = new Spark();
	}

	@Override
	void exaust() {

	}

	@Override
	void kaboom() {
		boom.boom1();
	}

}
