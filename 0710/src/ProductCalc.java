
public class ProductCalc {
	void calc(Product p) {
		
		int sellPrice = p.getCount()*p.getSell();
		int buyPrice = p.getCount()*p.getPrice();
		int profit = sellPrice - (buyPrice + p.getDelivery());
		double margin = profit / buyPrice * 100;
		
		p.setProfit(profit);
		p.setMargin(margin);
		
	}
	

}
