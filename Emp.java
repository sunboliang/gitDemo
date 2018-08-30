package fun.sbl.test;

import java.io.Serializable;

/**
* @author sunbo
* @date 2018-08-29 16:23
*/
public class Emp implements Serializable {

	private Integer empno;
	private String empname;
	private Date hiredate;
	private Double sal;
	private Double comm;
	private Emp mgr;
}