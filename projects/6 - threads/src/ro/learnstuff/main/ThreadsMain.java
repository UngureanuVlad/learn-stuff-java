package ro.learnstuff.main;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import ro.learnstuff.threading.FolderProcessor;
import ro.learnstuff.threading.RunnableThread;
import ro.learnstuff.threading.ThreadSubcalss;

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

		// fork join
		ForkJoinPool pool = new ForkJoinPool();
		// create tree instances of folder process
		FolderProcessor system = new FolderProcessor("C:\\Windows");
		FolderProcessor programFiles = new FolderProcessor("C:\\Program Files");
		FolderProcessor documents = new FolderProcessor("C:\\Documents And Settings");
		// execute the instances
		pool.execute(system);
		pool.execute(programFiles);
		pool.execute(documents);
		
		// fancy display of tasks
		while ((!system.isDone()) || (!programFiles.isDone()) || (!documents.isDone())) {
			System.out.printf("======================================================\n");
			System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());
			System.out.printf("Main: Active Threads: %d\n", pool.getActiveThreadCount());
			System.out.printf("Main: Task Count: %d\n", pool.getQueuedTaskCount());
			try {
				// wait 1 second for visibility
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// close fork join pool
		pool.shutdown();
		List<String> results;
		int totalResults = 0;
		// join results
		results = system.join();
		totalResults += results.size();
		System.out.printf("System: %d files found.\n", results.size());
		// join results
		results = programFiles.join();
		totalResults += results.size();
		System.out.printf("Apps: %d files found.\n", results.size());
		// join results
		results = documents.join();
		totalResults += results.size();
		System.out.printf("Documents: %d files found.\n", results.size());
		
		System.out.println("Total images found: "+ totalResults);
	}

}
