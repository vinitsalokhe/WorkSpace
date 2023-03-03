package com.pro.demo;

public class Database {

	private static Database dbObject;

	private Database() {

	}

	public static Database getInstance() {
		if (dbObject == null) {
			dbObject = new Database();
		}
		return dbObject;
	}

	public void setConnection() {
		System.out.println(">>>>>>>>>>>>>>>>>This are the singletone class<<<<<<<<<<<<<<");
	}

}
