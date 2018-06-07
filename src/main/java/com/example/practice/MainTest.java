package com.example.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainTest {

	public  List<Person> findMatchPerson(List<Person> person,Predicate<Person> prdeicate){
		List<Person> list=new ArrayList<>();
		for (Person person2 : person) {
			if(prdeicate.test(person2)) {
				list.add(person2);
			}
		}
		return list;
	}
	public  <T> int mapSum(List<Person> person,Function<Person,Double> fun) {
		int sum=0;
		for (Person person2 : person) {
			sum+=fun.apply(person2);
		}
		return sum;
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Person> list=new ArrayList<>();
		list.add(new Person(1,"老王",1.8));
		list.add(new Person(2,"老李",1.9));
		list.add(new Person(3,"老张",2.1));
		
		System.out.println("----------------------");
		System.out.println("使用lambda表达式对列表进行迭代");
		list.forEach(n -> System.out.println(n));
		System.out.println("----------------------");
		
		System.out.println();
		
		System.out.println("----------------------");
		System.out.println("lambda表达式对集合元素进行选择");
		System.out.println(new MainTest().findMatchPerson(list,p->p.getId()==2));	
		System.out.println(new MainTest().findMatchPerson(list, p->p.getName().equals("老王")));
		double sumsalary=new MainTest().mapSum(list, Person::getSalary);
		System.out.println("sumsalary: "+sumsalary+"k");
		System.out.println("----------------------");
		
		System.out.println();
		
		System.out.println("----------------------");
		System.out.println("使用lambda表达式对所有人的工资增加20%");
		List salary = Arrays.asList(100, 200, 300, 400, 500);
//		salary.stream().map((sal) -> sal +  .2*sal).forEach(System.out::println);
		System.out.println("----------------------");
		
		
		
	}
}
