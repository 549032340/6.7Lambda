package com.example.practice;

@FunctionalInterface
public interface Predicate<T> {

	boolean test(T t);
}
