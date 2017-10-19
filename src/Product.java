
public class Product {

	private String name;
	private int quantity;
	private double price;

	public Product(String n, int q, double p) {
		name = n;
		quantity = q;
		price = p;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double updatePrice(double p) {
		return price = p;
	}

	public int decreaseQuantity() {
		return quantity--;
	}

	public int increaseQuantity(int n) {
		return quantity += n;
	}

	public boolean isOutOfStock() {
		return quantity == 0;
	}

}
