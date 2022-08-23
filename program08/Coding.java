package com.josh.training.javaprograms.program08;

/**
 * Simultaneously saving and compiling the written code Coding class implements
 * Runnable interface to create a thread
 */
public class Coding implements Runnable {
	public void run() {
		String t = Thread.currentThread().getName();
		if (t.equals("code")) {
			code(5);
		} else if (t.equals("save")) {
			save();
		} else {
			compile();
		}
	}

	synchronized void code(int c) {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Coding...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("prodlem occured");
			}
		}
	}

	void save() {
		for (;;) {
			System.out.println("Autosaving");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("problem occured in autosaving");
			}
		}
	}

	void compile() {
		for (;;) {
			System.out.println("Compiling");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("problem occured in compiling");
			}
		}
	}
}
