package io.learnstuff.streams.lambda;

@FunctionalInterface
public interface ShortToByteFunction {

    byte applyAsByte(short s);
}
