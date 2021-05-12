package com.cos.blog.test;


public class Member {
		
		//java 변수는 모두 private 으로 생성
		//변수를 직접 수정을 못하게 함. 함수를 사용하여 객체지향 유지
		private int id;
		private String username;
		private String password;
		private String email;
		
		
		public Member(int id, String username, String password, String email) {
			this.id = id;
			this.username = username;
			this.password = password;
			this.email = email;
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		
}
