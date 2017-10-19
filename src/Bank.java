import java.util.ArrayList;

public class Bank {

	private int bankCode;
	private String name;
	private ArrayList<PaymentType> payments;

	public Bank(int code, String n, ArrayList<PaymentType> p) {
		bankCode = code;
		name = n;
		payments = p;
	}

	public static boolean validatePayment(double amt) {
		// just to simulate some payment failures returns false if the (int)amt is a
		// prime number
		int n = (int) amt;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
