package com.hou.maven.dto;

public class Feedback {
	
	  private Integer feedid;
	 	private String name;
	 	private String subject;
	 	private String msg;
	 	private String email;
	 	private String ip;
		public Integer getFeedid() {
			return feedid;
		}
		public void setFeedid(Integer feedid) {
			this.feedid = feedid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getIp() {
			return ip;
		}
		public void setIp(String ip) {
			this.ip = ip;
		}
		@Override
		public String toString() {
			return "Feedback [feedid=" + feedid + ", name=" + name + ", subject=" + subject + ", msg=" + msg
					+ ", email=" + email + ", ip=" + ip + "]";
		}
	 	
}
