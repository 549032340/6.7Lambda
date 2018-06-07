package com.example.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Car {

	private double price;

	
	public Car(double price) {
		super();
		this.price = price;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}
	public  <T> int mapSum(List<Car> car,Function<Car,Double> fun) {
		int sum=0;
		for (Car person2 : car) {
			sum+=fun.apply(person2);
		}
		return sum;
	}
	public static void main(String[] args) {
		List<Car> car=new ArrayList<>();
		car.add(new Car(3.0));
		car.add(new Car(3.5));
		car.add(new Car(4.0));
		car.add(new Car(5.1));
		double sumprice=new Car().mapSum(car, Car::getPrice);
		System.out.println("sumprice: "+sumprice+"k");
	}
}
