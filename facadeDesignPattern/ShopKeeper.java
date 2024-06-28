package facadeDesignPattern;

public class ShopKeeper {
	
	private Iphone iphone;
	private Samsung samsung;
	private Redmi redmi;
	
	public ShopKeeper() {
		this.iphone = new Iphone();
		this.samsung = new Samsung();
		this.redmi = new Redmi();
	}
	
	public void iPhoneSale() {
		iphone.modelNo();
		iphone.price();
	}
	
	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}
	
	public void redmiSale() {
		redmi.modelNo();
		redmi.price();
	}


}
