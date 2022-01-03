package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\src\\main\\java\\com\\Properties\\configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String geturl() throws Throwable {

		String url = p.getProperty("url");

		return url;

	}

	public String getUsername() throws Throwable {

		String username = p.getProperty("username");

		return username;

	}
	public String getInstanceproperty() {
		
		String property = p.getProperty("Propertyconfiguration");
		
		return property;
		

	}

	public String getIstancelog() {
		
		String log = p.getProperty("logi1");
		
		return log;
		

	}
public String getIstancelog2() {
		
		String log2 = p.getProperty("logi2");
		
		return log2;
}
public String getIstancepass() {
	
	String pass = p.getProperty("password");
	
	return pass;
}

public String getIstancelog3() {
	
	String log3 = p.getProperty("log3");
	
	return log3;
}
public String getIstanceloc() {
	
	String loc = p.getProperty("loc");
	
	return loc;
}

public String getIstancetex() {
	
	String tex = p.getProperty("tex");
	
	return tex;
}
public String getIstancehotel() {
	
	String hotel = p.getProperty("hotel");
	
	return hotel;

}
public String getIstanceind() {
	
	String ind = p.getProperty("ind");
	
	return ind;

}
public String getIstanceone() {
	
	String one = p.getProperty("one");
	
	return one;

}
public String getIstancetwo() {
	
	String two = p.getProperty("two");
	
	return two;

}
public String getIstancelog4() {
	
	String log4 = p.getProperty("log4");
	
	return log4;

}
public String getIstanceten() {
	
	String ten = p.getProperty("ten");
	
	return ten;

}
public String getIstancelog5() {
	
	String log5 = p.getProperty("log5");
	
	return log5;

}
public String getIstancelog6() {
	
	String log6 = p.getProperty("log6");
	
	return log6;

}
public String getIstanceBrow() {
	
	String Brow = p.getProperty("Brow");
	
	return Brow;

}
public String getIstanceurlauto() {
	
	String urlauto = p.getProperty("urlauto");
	
	return urlauto;

}
public String getIstancedatadriven() {
	
	String datadriven = p.getProperty("datadriven");
	
	return datadriven;

}
public String getIstancewin() {
	
	String win = p.getProperty("win");
	
	return win;

}
public String getIstanceimg() {
	
	String img = p.getProperty("img");
	
	return img;

}
}





