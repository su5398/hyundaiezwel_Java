package silsub2.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p = new Product();
		
		p.setPName("a");
		p.setPrice(0);
		p.setBand("b");
		
		p.infromation();
	}

}
