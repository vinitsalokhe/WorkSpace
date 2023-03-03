package com.pro.demo;

public class Trial {

	public static void main(String[] args) {

		Database db1;
		db1 = Database.getInstance();
		db1.setConnection();

		Database db2;
		db2 = Database.getInstance();
		db2.setConnection();

	}
}
