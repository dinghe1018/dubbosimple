package cn.hd.dubbo.sample.provider;

import java.util.List;

public interface SampleService {

	//
	String sayHello(String name);

	public List getUsers();

}