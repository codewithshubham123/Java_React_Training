package com.assignments.lambdaexpressions;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		}
	}

}

class ThreadLambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 way
//		new Thread(new MyRunnable()).start();

		// 2nd way
		Runnable runnable = () -> {
			try {
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
					Thread.sleep(1000);
				}
			} catch (Exception e) {
			}
		};
		new Thread(runnable).start();

		// 3rd way
		new Thread(() -> {
			try {
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
					Thread.sleep(1000);
				}
			} catch (Exception e) {
			}
		}).start();
	}

}
