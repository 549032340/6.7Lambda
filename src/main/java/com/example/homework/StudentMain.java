package com.example.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StudentMain {

//	public int randomScore() {
//		int [] scores= {100,95,90,85,80,75,70,65,60};
//		int num=(int) (Math.random()*8);
//		int score=scores[num];
//		return score;
//	}
//	public String randomName() {
//		String [] names= {"赵A","钱B","孙C","李D","周E","吴F","郑G","王H","冯I","陈J","褚K","卫L","蒋M","沈N","韩O","杨P"};
//		int num=(int) (Math.random()*15);
//		String name=names[num];
//		return name;
//	}
//	public  List<Student> findMatchStudent(List<Student> student,Predicate<Student> prdeicate){
//		List<Student> list=new ArrayList<>();
//		for (Student student2 : student) {
//			if(prdeicate.test(student2)) {
//				list.add(student2);
//			}
//		}
//		return list;
//	}
	public static void main(String[] args) {
//		List<Student> list=new ArrayList<>();
//		for (int i = 0; i < 50; i++) {
//			list.add(new Student(i, new StudentMain().randomName(), new StudentMain().randomScore()));
//		}
		Supplier<Student> supplier=new Supplier<Student>() {
			int i=1;
			@Override
			public Student get() {
				int [] scores= {100,95,90,85,80,75,70,65,60};
				int num1=(int) (Math.random()*8);
				int score=scores[num1];
				String [] names= {"赵A","钱B","孙C","李D","周E","吴F","郑G","王H","冯I","陈J","褚K","卫L","蒋M","沈N","韩O","杨P"};
				int num2=(int) (Math.random()*15);
				String name=names[num2];
				Student student=new Student(i++, name, score);
				return student;
			}
		};
		
		Stream<Student> s=Stream.generate(()->supplier.get()).limit(50);
//		s.forEach(System.out::println);
		List<Student> list = s.collect(Collectors.toList());//将Stream流数据转换成list
//		list.forEach(System.out::println);
		Map<Integer, Long> counting = list.stream().collect(
                Collectors.groupingBy(Student::getScroe, Collectors.counting()));
        System.out.println("各个分数的人："+counting);
//        System.out.println("分数为90的所有同学共有:"+"人，分别是："+new StudentMain().findMatchStudent(list, p->p.getScroe()==90));
      
        //group by score
        Map<Integer, List<Student>> groupByScoreMap =
            list.stream().collect(Collectors.groupingBy(Student::getScroe));

        System.out.println(groupByScoreMap);

	}
}
