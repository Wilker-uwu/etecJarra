package ui.rewrite.examples.compositions;

import java.util.ArrayList;
import java.util.List;

/**
 * An <code>Order</code> needs <code>OrderItem</code>s to exist.<br/>
 * It holds multiple instances of <code>OrderItem</code> to use somewhere else.
 * @see {@link OrderItem}
 */
@SuppressWarnings("unused")
public class Order {
	private int id = -1;
	private List<OrderItem> items = null;
	
	public Order() {
		items = new ArrayList<OrderItem>(0);
	}
	
	public void add(OrderItem anItem) {
		this.items.add(anItem);
	}
}
