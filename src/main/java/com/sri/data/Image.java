package com.sri.data;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "image")
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	@Lob
	private byte[] img;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Image(int id, String name, byte[] img) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", img=" + Arrays.toString(img) + "]";
	}

}
