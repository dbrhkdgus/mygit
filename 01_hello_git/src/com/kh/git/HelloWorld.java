package com.kh.git;

import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.foo.Foo;


/**
 * 원격 저장소 등록 후 push할 수 있다.
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world~");
		System.out.println("Hello git~");
		System.out.println("Goof luck!");
		
		new Foo().sayFoo();
		new Foo().sayFoo(); // #syaFoo에서 추가
		System.out.println("Good luck to you!"); //#master에서 추가
		
		new Dog().say();
		new Cat().say();
	}
	
}
