import java.util.ArrayList;

public class VendingMachine {

	private static final int PASSWORD = 2201;
	private ArrayList<Product> products;
	private ArrayList<PaymentType> payments;

	public VendingMachine() {
		products = new ArrayList<Product>(4);
		payments = new ArrayList<PaymentType>(4);
	}

	public boolean validatePassword(int pw) {
		return pw == PASSWORD;
	}

	public boolean validatePayment(double amt) {
		return Bank.validatePayment(amt);
	}

}
