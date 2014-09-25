/**
 * 
 */
package com.stone.core.test;

import com.stone.core.product.service.Animal;
import com.stone.core.product.service.impl.Dog;

/**
 * @author Peter
 * @create 2014年7月13日
 * @TODO
 */
public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal animal = new Dog();
		animal.info();
	}

}
