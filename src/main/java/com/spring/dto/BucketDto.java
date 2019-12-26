package com.spring.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class BucketDto {
	
	private int num;
	private String nickname;
	private String type;
	private String subject;
	private String content;
	private String image;
	private int likecount;
	private int withcount;
	private String hashtag;
	private String area;
	private String dday;
	private Timestamp writeday;
	
	@Override
	public String toString() {
		return "BucketDto [num=" + num + ", nickname=" + nickname + ", type=" + type + ", subject=" + subject
				+ ", content=" + content + ", image=" + image + ", likecount=" + likecount + ", withcount=" + withcount
				+ ", hashtag=" + hashtag + ", area=" + area + ", dday=" + dday + ", writeday=" + writeday + "]";
	}
	
	public String getDay() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(this.getWriteday());
	}
	
	public String getDaytime() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(this.getWriteday());
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getLikecount() {
		return likecount;
	}
	public void setLikecount(int likecount) {
		this.likecount = likecount;
	}
	public int getWithcount() {
		return withcount;
	}
	public void setWithcount(int withcount) {
		this.withcount = withcount;
	}
	public String getHashtag() {
		return hashtag;
	}
	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDday() {
		return dday;
	}
	public void setDday(String dday) {
		this.dday = dday;
	}
	public Timestamp getWriteday() {
		return writeday;
	}
	public void setWriteday(Timestamp writeday) {
		this.writeday = writeday;
	}
	
}