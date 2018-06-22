package cn.hd.dubbo.sample.test;

import java.sql.SQLOutput;
import java.util.List;

import cn.hd.dubbo.sample.provider.SampleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Consumer {
	//ceshi
	
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "sample-consumer.xml" });
		context.start();
		//
		//
		SampleService sampleService = (SampleService) context.getBean("sampleService");
		String hello = sampleService.sayHello("tom");
		System.out.println(hello);
		System.out.println("1234");
		List list = sampleService.getUsers();

		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		System.in.read();
		System.out.println("dev002_test merge to dev01");
		System.out.println("create new dev001 ..1");
		System.out.println("create new dev001 ..2");
		System.out.println("create new dev001 ..3");
	}

}