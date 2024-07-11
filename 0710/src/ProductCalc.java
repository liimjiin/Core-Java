
public class ProductCalc {
	void calc(Product[] pArray) {
		for(Product p : pArray) {
												
			int sellPrice = p.getCount()*p.getSell();
			int buyPrice = p.getCount()*p.getPrice();
			int profit = sellPrice - (buyPrice + p.getDelivery());
			double margin = (double) profit / buyPrice * 100;
			
			p.setProfit(profit);
			p.setMargin(margin);								
		}
		
	}
	

}
