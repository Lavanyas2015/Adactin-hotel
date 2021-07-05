package com.utilities;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;





public class getreports {
	
 public static void getrjvmreport(String jsonpath) {
	 
	 File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\reports\\jvmreport");
	 
	 Configuration con=new Configuration(f, "Adactin");
	 con.addClassifications("platform name","Window10");
	 con.addClassifications("Browser","Chrome");
	 con.addClassifications("Browserversion","89.0");
	 con.addClassifications("Sprint number","23");
	 
	 List<String>list=new ArrayList<>();
	 list.add(jsonpath);
	 
	 ReportBuilder r= new ReportBuilder(list,con);
	 r.generateReports();
	 
	 
 }
}
