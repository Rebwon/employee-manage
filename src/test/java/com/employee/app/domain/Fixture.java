package com.employee.app.domain;

import java.util.Arrays;
import java.util.List;

import com.employee.app.domain.payload.EmployeePayload;
import com.employee.app.domain.vo.Email;
import com.employee.app.domain.vo.Grade;
import com.employee.app.domain.vo.Name;
import com.employee.app.domain.vo.Phone;

public class Fixture {
	private Fixture() {}

	public static Employee createEmployeeChulsu() {
		return Employee.builder()
			.name(new Name("김철수"))
			.email(new Email("chulsu@naver.com"))
			.grade(Grade.of("차장"))
			.phone(new Phone("010-1234-1234"))
			.build();
	}

	public static Employee createEmployeeSunmin() {
		return Employee.builder()
			.name(new Name("문선민"))
			.phone(new Phone("010-2222-5512"))
			.email(new Email("sunmin@naver.com"))
			.grade(Grade.of("사원"))
			.build();
	}

	public static List<Employee> createEmployeeList() {
		return Arrays.asList(
			Employee.builder()
				.id(1)
				.name(new Name("김철수"))
				.email(new Email("chulsu@naver.com"))
				.grade(Grade.of("차장"))
				.phone(new Phone("010-1234-1234"))
				.build(),
			Employee.builder()
				.id(2)
				.name(new Name("문선민"))
				.phone(new Phone("010-2222-5512"))
				.email(new Email("sunmin@naver.com"))
				.grade(Grade.of("사원"))
				.build()
		);
	}

	public static EmployeePayload createPayload() {
		return EmployeePayload.builder()
			.name(new Name("김철수"))
			.email(new Email("chulsu@naver.com"))
			.grade(Grade.of("차장"))
			.phone(new Phone("010-1234-1234"))
			.build();
	}

	public static EmployeePayload createPayloadSunmin() {
		return EmployeePayload.builder()
			.name(new Name("문선민"))
			.phone(new Phone("010-2222-5512"))
			.email(new Email("sunmin@naver.com"))
			.grade(Grade.of("사원"))
			.build();
	}
}
