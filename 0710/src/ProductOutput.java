
public class ProductOutput {
	void output(Product[] pArray) {
		
		System.out.println("\t" + "<<상품별 판매 이익금 및 이익율표>>" + "\t");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("상품명\t수량\t판매단가\t매입단가\t운송료\t이익금\t이익율");
		System.out.println("-------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < pArray.length; i++) {
			Product p = pArray[i];
			System.out.println(p.getName()+"\t"+p.getCount()+"\t"+p.getSell()+"\t"+
					p.getPrice()+"\t"+p.getDelivery()+"\t"+p.getProfit()+"\t"+String.format("%.2f",p.getMargin()));
		}
	
	}

}
