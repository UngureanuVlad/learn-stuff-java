package io.learnstuff.reactive.main;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;
import io.learnstuff.reactive.elements.DataSubscriber;

public class ReactiveStreamsMain {

  public static void main(String[] args) throws InterruptedException {
    List<String> items = List.of("1", "x", "2", "x", "3", "x");
    
    SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
    DataSubscriber<String> subscriber = new DataSubscriber<>();
    
    publisher.subscribe(subscriber);
    items.forEach(publisher::submit);
    
    // wait until all data is consumed
    Thread.sleep(1000);
    // without sleep the publisher will close before the values get processed
    publisher.close();

  }

}
