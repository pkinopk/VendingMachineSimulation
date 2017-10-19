
public class PaymentType {

	private static int idCount = 7777;
	private String name;
	private int id;

	public PaymentType(String n) {
		name = n;
		id = idCount++;
	}

	public String getName() {
		return name;
	}

	public double getId() {
		return id;
	}

}
