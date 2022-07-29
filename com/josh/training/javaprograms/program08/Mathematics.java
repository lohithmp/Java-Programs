package com.josh.training.javaprograms.program08;

/**
 * Conducting Arithmetic operations using Multithreading
 */
public class Mathematics {

	public void add() {
		int sum = 0;
		for (int i = 0; i <= 3; i++) {
			System.out.println("adding " + i + " to " + (sum + i));
			try {
				/*
				 * Sleep method is stop working for 1 second
				 */
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void sub(int c) {
		int sub = 0;
		for (int i = 0; i <= 3; i++) {
			System.out.println("subtract " + i + " to " + (sub - i));
			try {
				/*
				 * wait method is wait until notify method call it
				 */
				wait();
				System.out.println("waiting");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void multiply(int d) {
		int multiply = 2;
		for (int i = 0; i <= 3; i++) {
			System.out.println("Multiply " + i + " to " + (multiply * i));
			/*
			 * notify method is use for invoke wait method
			 */
			notify();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Mathematics math = new Mathematics();
		/*
		 * Anonymous class for using multiple threads
		 */
		Thread t1 = new Thread() {
			public void run() {
				math.add();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				math.sub(3);
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				math.multiply(3);
			}
		};

		t1.start();
		t2.start();
		t3.start();
	}

}
/*
 * OUTPUT: subtract 0 to 0 adding 0 to 0 Multiply 0 to 0 Multiply 1 to 2
 * Multiply 2 to 4 Multiply 3 to 6 waiting subtract 1 to -1 adding 1 to 1 adding
 * 2 to 2 adding 3 to 3
 */
