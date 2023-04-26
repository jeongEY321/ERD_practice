package com.java.user.domain;

//User 테이블의 컬럼과 1:1로 매칭되는 객체를 생성해서
//자바 프로그램과 데이터베이스 간의 
//데이터를 주고받는 과정을 좀 더 십게 처리하기 위한 객체를 디자인
public class User {

	private int userNumber;
	private String userName;
	private String phoneNumber;
	private int totalpaying;
	private Grade grade; // Grade에 있는 값 제외하고는 들어올수가 없다.




	public User(int userNumber, String userName, String phoneNumber, int totalpaying, Grade grade) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.totalpaying = totalpaying;
		this.grade = grade;
	}

	// 기본 생성자 뽑기
	public User() {}

	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getTotalpaying() {
		return totalpaying;
	}
	public void setTotalpaying(int totalpaying) {
		this.totalpaying = totalpaying;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}


	public String toString() {
		return  "## 회원번호: " + userNumber +
				", 회원명: " + userName +
				", 전화번호: " + phoneNumber  +
				", 총 결제금액: " + totalpaying + "원" +
				", 등급: " + grade;
	}
}




