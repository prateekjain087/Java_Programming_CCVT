package com.rt.cloning;

public class TestClass {
//changes done
	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	Department d1=new Department(7, "HR");
	Employee e1=new Employee(1, "Ram",d1);
	Employee e2= e1.clone();
	Department d2=new Department(17, "ENV");
	Employee e3=new Employee(3, "Sam",d2);
	Employee e4=(Employee) new Employee(e3);
	e4.getDep().setDname("new");
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	System.out.println(e4);
//	e2.setEid(3);
	e2.setEname("Shyam");
	e2.getDep().setDid(8);
	e2.getDep().setDname("Acc");
	System.out.println(e1);
	System.out.println(e2);
//new Employee().getEid();
	System.out.println(e1 instanceof Cloneable);
	System.out.println(e1.clone()!=e1);
	System.out.println(e2.getClass()==e1.getClass());
	System.out.println(e1.equals(e2));
	}

}
