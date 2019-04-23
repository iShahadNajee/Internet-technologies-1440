<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"  import="java.util.ArrayList" import="java.util.ArrayList" import="uqu.jeelab.model.bookstore"%> 
  
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>

 <%
ArrayList bookstore = (ArrayList) request.getAttribute("bookstore");
out.println("<table border><tr><th>NameOfbook</th><th>Price</th></tr>");
for(Object obj : bookstore){
	bookstore b = (bookstore) obj;
String NameOfbook = b.getNameOfbook();
String Price = b.getPrice();
out.println("<tr><td>" + NameOfbook + "</td><td>" + Price +"</td></tr>");
}
out.println("</table>");
    %>


</body>
</html>