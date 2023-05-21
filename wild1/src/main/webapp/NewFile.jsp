<%@page import="test.TextApplication"%>
<%@page import="java.io.*"%>
<%@page import="java.sql.* "%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=cp1251"/>
<title>DB</title>
</head>
<body bgcolor="#E6E6FA">
 
 <% 
 
 Connection pripoj = TextApplication.con();

		 
 Statement dotaz  = null;
 Statement dotaz1 = null;
 Statement dotaz2 = null;
 
 ResultSet vysledek;
 ResultSet vysledek1;
 ResultSet vysledek2;
 
    dotaz  = pripoj.createStatement();
	dotaz1 = pripoj.createStatement();
	dotaz2 = pripoj.createStatement();
	
	String sql = "select * from test.adress a";
	String sql1 = "select * from test.buil b";
	String sql2 = "select * from test.fil f";
	
	vysledek  = dotaz.executeQuery(sql);
	vysledek1 = dotaz1.executeQuery(sql1);
	vysledek2 = dotaz2.executeQuery(sql2);
	
	ResultSetMetaData rsmd = vysledek2.getMetaData();
	ResultSetMetaData rsmd1 = vysledek1.getMetaData();
	ResultSetMetaData rsmd2 = vysledek.getMetaData();
	
	int  totalColumn3 = rsmd.getColumnCount();
	int  totalColumn1 = rsmd1.getColumnCount();
	int  totalColumn2 = rsmd2.getColumnCount();
	

	  out.println("<p>Филиалы:</p>");
	  out.println("<table border='2' style='border-collapse:collapse' bgcolor=#ffa07a>");
	  out.println("<tr>");
	  for(int a=1;a<=totalColumn3;a++)
	    {
	        out.println("<th bgcolor=#6495ed>"+rsmd.getColumnName(a)+"</th>");
	    }
	  out.println("</tr>");
	 while (vysledek2.next()) {
	  out.println("<tr>");
	  for(int col=1;col<=totalColumn3;col++)
      {
		  Object obj= vysledek2.getObject(col);       

      	if (vysledek2.getObject(col) == null) 
      		{   out.println("<td>"+ " " +"</td>");    }
      	else          
      		out.println("<td align=center>"+ String.valueOf(obj)+"</td>");
      }
	  out.println("</tr>");
	                          }
	  out.println("</table>");
	  
	  out.println("<br>");
	  out.println("<p>Компании:</p>");
	  
	  out.println("<table border='2' style='border-collapse:collapse' bgcolor=#ffa07a>");
	  out.println("<tr>");
	  for(int a=1;a<=totalColumn1;a++)
	    {
	        out.println("<th bgcolor=#6495ed>"+rsmd1.getColumnName(a)+"</th>");
	    }
	  out.println("</tr>");
	 while (vysledek1.next()) {
	  out.println("<tr>");
	  for(int col=1;col<=totalColumn1;col++)
      {
		  Object obj= vysledek1.getObject(col);       

      	if (vysledek1.getObject(col) == null) 
      		{   out.println("<td>"+ " " +"</td>");    }
      	else          
      		out.println("<td align=center>"+ String.valueOf(obj)+"</td>");
      }
	  out.println("</tr>");
	                          }
	  out.println("</table>");
	  
	  out.println("<br>");
	  out.println("<p style=font-size:14px;>Адреса:</p>");
	  
	  out.println("<table border='2' style='border-collapse:collapse' bgcolor=#ffa07a>");
	  out.println("<tr>");
	  for(int a=1;a<=totalColumn2;a++)
	    {
		    if (a == 6) {  }
		    else
	        out.println("<th bgcolor=#6495ed>"+rsmd2.getColumnName(a)+"</th>");
	    }
	  out.println("</tr>");
	 while (vysledek.next()) {
	  out.println("<tr>");
	  for(int col=1;col<=totalColumn2;col++)
      {
		  
	    Object obj= vysledek.getObject(col);       

      	if (vysledek.getObject(col) == null) 
      		{   out.println("<td>"+ " " +"</td>");    }
      	else     
      		if (col == 6) {  }
		    else
      		out.println("<td align=center>"+ String.valueOf(obj)+"</td>");
      }
	  out.println("</tr>");
	                          }
	  out.println("</table>");
	  
 
	  dotaz.close();
	  dotaz1.close();
	  dotaz2.close();
	  
	  pripoj.close();
 %>

</body>
</html>