package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;

	public int existMemberNum() {

		int count = 0;
		for (Member member : m) { //member 안에 들어있는 요소를 m에 있는거랑 비교하면서 하나씩 확인
			if (member != null) {//null값이 아니라면
				count++; // 카운트됨
			}
		}
		return count;
	}

	public boolean checkId(String inputId) {
		for (Member member : m) {
			if (member != null) { // null값이 아니고 
				if (member.getId().equals(inputId)) // 갖고있는 아이디가 새로입력받은 아이디와 일치한다면
					return true; //true 반환
				}
			}
		return false;

}


	public void insertMember(String id, String name, String password, String email, String gender, int age) {
		// gender 생성자 자료형 다름
		// 0, 1 || 2
		m[existMemberNum()] = new Member(id, name, password, email, gender.charAt(0), age);
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				//m[i] = member;
				break;
			}
		}
	}

	public String searchId(String id) {
		for (Member member : m) {
			if (member != null) {
				if (id.equals(member.getId())) {
					return member.toString();
				}
			}
		}
		return null;
	}

	public Member[] searchName(String name) {
		Member[] m2 = new Member[SIZE];
		int index = 0;
		for (Member member : m) {
			if (member != null) {
				if (name.equals(member.getName())) {
					m2[index++] = member;
				}
			}
		}
		return m2;

	}

	public Member[] searchEmail(String email) {
		Member[] m2 = new Member[SIZE];
		int index = 0;
		for (Member member : m) {
			if (member != null) {

				if (email.equals(member.getEmail())) {
					m2[index++] = member;
				}
			}
		}
		return m2;
	}

	public boolean updatePassword(String id, String password) {
		for(int i = 0;i<m.length;i++) {
			if(m[i] != null) {//멤버변수가 비어있지 않으면서 
				if(id.equals(m[i].getId())) { //받은 아이디가 
					m[i].setPassword(password);
					return true;
				}
			}
		}
		return false;

	}

	public boolean updateName(String id, String name) {
		for(int i = 0;i<m.length;i++) {
			if(m[i] != null) {
				if(id.equals(m[i].getId())) { 
					m[i].setName(name);
					return true;
				}
			}
		}
		
		return false;

	}

	public boolean updateEmail(String id, String email) {
		for(int i = 0;i<m.length;i++) {
			if(m[i] != null) {
				if(id.equals(m[i].getId())) { 
					m[i].setEmail(email);
					return true;
				}
			}
		}
		return false;
	}

	public boolean delete(String id) {
		
		for(int i = 0;i<m.length;i++) {
			if(m[i] != null) {
				if(id.equals(m[i].getId())) {
					m[i] = null ;
					return true;
				}
			}
		}
		return false;

	}

	public void delete() {

		m = new Member[SIZE];
	}

	public Member[] printAll() {
		return m;
	}

	}


