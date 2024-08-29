package silsub2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String band;
	
	public Product() {};
	
	public String getPName() {return pName;}
	public void setPName(String pName) {this.pName = pName;}
	
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	
	public String getBand() {return band;}
	public void setBand(String band) {this.band = band;}
	
	public String infromation() {
		System.out.print(pName+"/"+price+"/"+band);
		return band ;
		}
}
