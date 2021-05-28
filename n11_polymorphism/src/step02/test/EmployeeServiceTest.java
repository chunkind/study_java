package step02.test;

import step02.service.EmployeeService;
import step02.vo.Employee;
import step02.vo.Engineer;
import step02.vo.Manager;

public class EmployeeServiceTest {
    public static void main(String[] args) {
    	Manager m1 = new Manager("m11", "김준성", "과천", 400, "재정부");
		Manager m2 = new Manager("k11", "성영식", "방배동", 300, "기획부");
		Engineer e1 = new Engineer("E11", "김새봄", "만주", 200, "영업부", 500);
		Engineer e2 = new Engineer("Q11", "박정하", "평양", 500, "집행부", 200);
		EmployeeService service = new EmployeeService();

		System.out.println("\n====== 1. printInfo calling =====");
		service.printInfo(m1);
		service.printInfo(e2);

		System.out.println("\n====== 2. printAllInfo calling =====");
		Employee[] arr = { m1, m2, e1, e2 };
		service.printAllInfo(arr);

		System.out.println("\n====== 3. findByEmpId calling =====");
		Employee emp = service.findByEmpId(arr, "m11");
		System.out.println(emp);

		System.out.println("\n====== 4. findByAddr calling =====");
		Employee [ ] empAll = service.findByAddr(arr, "방배동");
		for(int i = 0; i<empAll.length; i++ ){
			if(empAll[i]==null)
				continue;
			System.out.println(empAll[i].getName() + "  " + empAll[i].getAddr() );
		}

		System.out.println("\n====== 5. getAnnualSalary calling =====");
		System.out.println("Annual Salary1 :: " + service.getAnnualSalary(e1)+(e2));
		System.out.println("Annual Salary2 :: "+ service.getAnnualSalary(m1)+(m2));

		System.out.println("\n====== 6. getTotalCost calling =====");
		System.out.println(" *** 모든 고용인들의 총 인건비는? *** "+
		service.getTotalCost(arr)+"만원");
	}
}
