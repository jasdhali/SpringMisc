package springrecipes.chapter02;

import com.apress.springrecipes.shop.Battery;
import com.apress.springrecipes.shop.Disc;
import com.apress.springrecipes.shop.Product;

public class ProductCreator {

	public ProductCreator() {
	}
	
	public static Product createProduct(String productId){
		if( "aaa".equals(productId)){
			return new Battery("AAA",2.5);
		}else{
			return new Disc("CD-RW" , 1.5 );
		}
		//throw new IllegalArgumentException("Unknown Product");
	}
}