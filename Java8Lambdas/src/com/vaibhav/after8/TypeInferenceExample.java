/**
 * 
 */
package com.vaibhav.after8;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 16, 2017
 */
public class TypeInferenceExample {
	
	public static int getLength(String s) {
		return s.length();
	}

	public static void main(String[] args) {
		TypeInferenceExample typeInference = new TypeInferenceExample();
		StringLenghtLanmdaImpL impL = typeInference.new StringLenghtLanmdaImpL();
		System.out.println(impL.getStringLength("Hello World before java-8"));
		
		//the same operation can be achieved with lambda via the below way
		System.out.println(TypeInferenceExample.getLength("Hello World with creating a new method inside a class"));
		
		// Type Inference achieving with Lambdas
		StringLengthLambda usingLambda1 = (String s) -> s.length();
		StringLengthLambda usingLambda2 = (s) -> s.length();
		StringLengthLambda usingLambda3 = s -> s.length();
		System.out.println(usingLambda1.getStringLength("Hello World after java-8"));
		System.out.println(usingLambda2.getStringLength("Hello World after java-8"));
		System.out.println(usingLambda3.getStringLength("Hello World after java-8"));
	}

	interface StringLengthLambda {
		public int getStringLength(String s);
	}

	class StringLenghtLanmdaImpL implements StringLengthLambda {
		@Override
		public int getStringLength(String s) {
			// TODO Auto-generated method stub
			return s.length();
		}

	}
}
