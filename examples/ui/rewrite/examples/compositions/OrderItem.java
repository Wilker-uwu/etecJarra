package ui.rewrite.examples.compositions;

/**
 * An <code>OrderItem</code> is only useful for usage when combined with <code>Order</code>.
 * @see {@link Order}
 */
@SuppressWarnings("unused")
public class OrderItem {
	
	private int id = -1;
	private String description = null;
	private int	quantity = -1;
	private double unitValue = -1;
	
	public OrderItem(int id, String description, int quantity, double unitValue) {
		this.id = id;
		this.description = description;
		this.quantity = quantity;
		this.unitValue = unitValue;
	}
}
