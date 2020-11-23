package io.learnstuff.threads.forkjoins;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * 
 * <p>Original implementation at: 
 * http://howtodoinjava.com/2014/05/27/forkjoin-framework-tutorial-forkjoinpool-example/</p>
 *
 */
@SuppressWarnings("serial")
public class FolderProcessor extends RecursiveTask<List<String>> {

	private final String path;

	public FolderProcessor(String path) {
		this.path = path;
	}

	@Override
	protected List<String> compute() {
		List<String> list = new ArrayList<String>();
		List<FolderProcessor> tasks = new ArrayList<FolderProcessor>();
		File file = new File(path);
		File content[] = file.listFiles();
		if (content != null) {
			for (int i = 0; i < content.length; i++) {
				if (content[i].isDirectory()) {
					// create a new instance
					FolderProcessor task = new FolderProcessor(content[i].getAbsolutePath());
					// for the task
					task.fork();
					// add the task to the list of tasks
					tasks.add(task);
				} else {
					// search for JPG images
					if (content[i].getName().endsWith(".jpg")) {
						// add result to list of results
						list.add(content[i].getAbsolutePath());
					}
				}
			}
		}
		addResultsFromTasks(list, tasks);
		return list;
	}

	private void addResultsFromTasks(List<String> list, List<FolderProcessor> tasks) {
		for (FolderProcessor item : tasks) {
			// join the results from all the tasks added to task list
			list.addAll(item.join());
		}
	}
}