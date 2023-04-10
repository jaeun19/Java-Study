package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		Student[] sArr = ssm.printStudent(); // 컨트롤러의 배열 주소값을
		for (Student s : sArr) {
			System.out.println(s);
			// System.out.println("이름 : %s / 과목 : %s / 점수 : %d \n",
			// arr[i].getName(),arr[i].getSubject(),arr[i].getScore());
		}

		System.out.println("========== 학생 성적 출력 ==========");
		double[] dArr = ssm.avgScore(); // 안담아도상관은없음

		System.out.println("학생 점수 합계 : " + (int) dArr[0]);
		System.out.println("학생 점수 평균 : " + dArr[1]);

		System.out.println("========== 성적 결과 출력 ==========");
		for (Student s : sArr) {
			if (s.getScore() >= StudentController.CUT_LINE) {
				System.out.println(s.getName() + "학생은 통과입니다.");
			} else {
				System.out.println(s.getName() + "학생은 재시험 대상입니다.");

			}

		}

	}
}
