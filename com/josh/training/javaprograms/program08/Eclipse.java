package com.josh.training.javaprograms.program08;

/**
 * Creating multiple threads using Runnable interface
 * initializing multiple threads using class "Eclipse"
 * 
 */
public class Eclipse {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Eclipse open start coding");
		Coding code = new Coding();

		Thread thread1 = new Thread(code);
		Thread thread2 = new Thread(code);
		Thread thread3 = new Thread(code);

		thread1.setName("code");
		thread2.setName("save");
		thread3.setName("compile");
		thread1.setPriority(1);
		thread2.setPriority(6);
		thread3.setPriority(4);
		thread2.setDaemon(true);
		thread3.setDaemon(true);
		thread1.start();
		thread2.start();
		thread3.start();

	}
}

/*
 * Eclipse open start coding Coding... Autosaving Compiling Autosaving Compiling
 * Coding... Compiling Autosaving Coding... Compiling Autosaving Coding...
 * Autosaving Compiling Coding... Autosaving Compiling Coding... Autosaving
 * Compiling
 */