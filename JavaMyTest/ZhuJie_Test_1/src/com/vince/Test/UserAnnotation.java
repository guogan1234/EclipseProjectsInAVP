package com.vince.Test;

import java.util.HashMap;
import java.util.Map;
 
/**
 * �����ר����������ע��ʹ��
 * @author tmser
 */
 
@TestA(name="type",gid=Long.class) //���Աע��
public class UserAnnotation {
	
	@TestA(name="param",id=1,gid=Long.class) //���Աע��
	private Integer age;
	
	@TestA (name="construct",id=2,gid=Long.class)//���췽��ע��
	public UserAnnotation(){
		
	}
	@TestA(name="public method",id=3,gid=Long.class) //�෽��ע��
	public void a(){
		Map<String,String> m = new HashMap<String,String>(0);
	}
	
	@TestA(name="protected method",id=4,gid=Long.class) //�෽��ע��
	protected void b(){
		Map<String,String> m = new HashMap<String,String>(0);
	}
	
	@TestA(name="private method",id=5,gid=Long.class) //�෽��ע��
	private void c(){
		Map<String,String> m = new HashMap<String,String>(0);
	}
	
	public void b(Integer a){ 
		
	}
}
