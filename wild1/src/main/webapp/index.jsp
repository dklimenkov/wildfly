<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>

<p>Адреса:</p>
<table cellpadding="2" cellspacing="2" border="1">
     <tr>
       <th>Index_name</th>
       <th>City</th>
       <th>Street</th>
       <th>House</th>
       <th>Flat</th>
     </tr>
     <c:forEach var="product" items="${listProduct1} }">
     <tr>
         <td>${product.Index_name }</td>
         <td>${product.City }</td>
         <td>${product.Street }</td>
         <td>${product.House }</td>
         <td>${product.Flat }</td>
     </tr>
     </c:forEach>
</table>
<br></br>
<p>Компании:</p>
<table cellpadding="2" cellspacing="2" border="1">
     <tr>
      <th>Name_Company</th>
      <th>Form</th>
       <th>Index_name</th>
       <th>City</th>
       <th>Street</th>
       <th>House</th>
       <th>Flat</th>
       <th>Name_Filial</th>
     </tr>
     <c:forEach var="product" items="${listProduct2} }">
     <tr>
         <td>${product.Name_Company }</td>
         <td>${product.Form }</td>
         <td>${product.Index_name }</td>
         <td>${product.City }</td>
         <td>${product.Street }</td>
         <td>${product.House }</td>
         <td>${product.Flat }</td>
         <td>${product.Name_Filial }</td>
     </tr>
     </c:forEach>
</table>
<br></br>
<p>Филиалы:</p>
<table cellpadding="2" cellspacing="2" border="1">
     <tr>
      <th>Name_Filial</th>
       <th>Index_name</th>
       <th>City</th>
       <th>Street</th>
       <th>House</th>
       <th>Flat</th>
     </tr>
     <c:forEach var="product" items="${listProduct} }">
     <tr>
         <td>${product.Name_Filial }</td>
         <td>${product.Index_name }</td>
         <td>${product.City }</td>
         <td>${product.Street }</td>
         <td>${product.House }</td>
         <td>${product.Flat }</td>
     </tr>
     </c:forEach>
</table>

</body>
</html>