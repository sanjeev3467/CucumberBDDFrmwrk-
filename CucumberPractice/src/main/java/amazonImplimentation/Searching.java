package amazonImplimentation;

public class Searching {
	
	public String DisplayProducts(Product product) {
		
		if(product.getProductList().contains(product.getProductName())) {
			
			System.out.println("Product Name: "+product.getProductName());
			
			return product.getProductName();
		}
		return null;
		
		
	}

}
