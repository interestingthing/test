package yibao;

import java.util.concurrent.locks.ReentrantLock;

//∂‡Ã¨
public class Y4 {
	static volatile int j = 0;

	public static void main(String[] args) {

		ReentrantLock lock = new ReentrantLock();
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				new Thread() {
					public void run() {
						for (int k = 0; k < 10000; k++) {
							synchronized (lock) {

								try {
									wait();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								notifyAll();
								j++;
							}
						}
					};
				}.start();
			} else {
				new Thread() {
					public void run() {
						for (int k = 0; k < 10000; k++) {
							synchronized (lock) {
								try {
									wait();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								notifyAll();
								j--;
							}
						}
					};
				}.start();
			}
		}
		System.out.println(j);
	}

}