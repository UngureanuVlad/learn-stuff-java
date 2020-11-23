package io.learnstuff.threads.main;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import io.learnstuff.threads.callables.Callables;
import io.learnstuff.threads.forkjoins.FolderProcessor;
import io.learnstuff.threads.forkjoins.ForkJoins;
import io.learnstuff.threads.threading.RunnableThread;
import io.learnstuff.threads.threading.ThreadSubcalss;

public class ThreadsMain {

	static ForkJoinPool fjPool = new ForkJoinPool();

	public static void main(String[] args) {

		// extending thread
		ThreadSubcalss threadSubcalss = new ThreadSubcalss();
		threadSubcalss.start();

		Thread runnableThread = new Thread(new RunnableThread());
		runnableThread.start();

		// tread implementation
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Thread Running");
			}
		};
		thread.start();

		// executor service
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		executorService.execute(new Runnable() {
			public void run() {
				System.out.println("Executor service thread running");
			}
		});

		executorService.shutdown();

		// fork join example
		ForkJoins forkJoins = new ForkJoins();
		forkJoins.illustrateForkJoin();
		
		// callables
		Callables callables = new Callables();
		callables.illustrateCallables();
		
	}

}
