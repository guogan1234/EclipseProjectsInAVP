package com.vince.ZhuJie;

import java.util.HashMap;
import java.util.Map;

import com.vince.ZhuJie.TestA;

/**
 * �����ר����������ע��ʹ��
 * @author tmser
 */
@TestA    //ʹ������ע��
public class UserAnnotation {

	@TestA //ʹ�������Աע��
	private Integer age;

	@TestA //ʹ���˹��췽��ע��
	public UserAnnotation(){

	}
	@TestA //ʹ�����෽��ע��
	public void a(){
		@TestA //ʹ���˾ֲ�����ע��
		Map m = new HashMap(0);
	}

	public void b(@TestA Integer a){ //ʹ���˷�������ע��

	}
}
