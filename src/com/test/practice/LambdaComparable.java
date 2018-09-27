package com.test.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaComparable {

	public static void main(String[] args) {
		
		List<Product>plist=new ArrayList<Product>();
		plist.add(new Product(30, "HP", 20000));
		plist.add(new Product(33, "Dell", 30000));
		plist.add(new Product(22, "Lenovo", 45000));
		plist.add(new Product(17, "Asus", 40000));
		
		Collections.sort(plist,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		for(Product p:plist)
		System.out.println(p.id+":"+p.name+":"+p.price);
		
		System.out.println("===========================");
		 // using lambda to filter data  
        Stream<Product> filtered_data = plist.stream().filter(p -> p.price >= 30000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  

	}

}
