package com.example.app;

import com.example.transformer.Transformer;

public class Application {
	public static void main(String... args) {
		Transformer transformer = new Transformer();
		System.out.println(transformer.transform());
	}
}
