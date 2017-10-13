package com.vince.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ParseAnnotation {

	/**
	 * �򵥴�ӡ��UserAnnotation ������ʹ�õ�����ע��
	 * �÷���ֻ��ӡ�� Type ���͵�ע��
	 * @throws ClassNotFoundException
	 */
	public static void parseTypeAnnotation() throws ClassNotFoundException {  
		Class clazz = Class.forName("com.vince.Test.UserAnnotation"); 

		Annotation[] annotations = clazz.getAnnotations();
		System.out.println(annotations.length);
		for (Annotation annotation : annotations) {  
			TestA testA = (TestA)annotation;
			System.out.println("id= \""+testA.id()+"\"; name= \""+testA.name()+"\"; gid = "+testA.gid());  
		}  
	} 

	/**
	 * �򵥴�ӡ��UserAnnotation ������ʹ�õ��ķ���ע��
	 * �÷���ֻ��ӡ�� Method ���͵�ע��
	 * @throws ClassNotFoundException
	 */
	public static void parseMethodAnnotation(){
		Method[] methods = UserAnnotation.class.getDeclaredMethods();
		System.out.println(methods.length);
		for (Method method : methods) {  
			/* 
			 * �жϷ������Ƿ���ָ��ע�����͵�ע�� 
			 */  
			boolean hasAnnotation = method.isAnnotationPresent(TestA.class);  
			if (hasAnnotation) {  
				/* 
				 * ����ע�����ͷ��ط�����ָ������ע�� 
				 */  
				TestA annotation = method.getAnnotation(TestA.class);  
				System.out.println("method = " + method.getName()  
				+ " ; id = " + annotation.id() + " ; description = "  
				+ annotation.name() + "; gid= "+annotation.gid());  
			}  
		}  
	}

	/**
	 * �򵥴�ӡ��UserAnnotation ������ʹ�õ��ķ���ע��
	 * �÷���ֻ��ӡ�� Method ���͵�ע��
	 * @throws ClassNotFoundException
	 */
	public static void parseConstructAnnotation(){
		Constructor[] constructors = UserAnnotation.class.getConstructors();
		System.out.println(constructors.length);
		for (Constructor constructor : constructors) { 
			/* 
			 * �жϹ��췽�����Ƿ���ָ��ע�����͵�ע�� 
			 */  
			boolean hasAnnotation = constructor.isAnnotationPresent(TestA.class);  
			if (hasAnnotation) {  
				/* 
				 * ����ע�����ͷ��ط�����ָ������ע�� 
				 */  
				TestA annotation =(TestA) constructor.getAnnotation(TestA.class);  
				System.out.println("constructor = " + constructor.getName()  
				+ " ; id = " + annotation.id() + " ; description = "  
				+ annotation.name() + "; gid= "+annotation.gid());  
			}  
		}  
	}

	public static void main(String[] args) throws ClassNotFoundException {
//		parseTypeAnnotation();
//		parseMethodAnnotation();
		parseConstructAnnotation();
	}
}
