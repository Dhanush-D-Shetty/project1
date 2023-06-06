<%@page import="dto.Marks_Card"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Marks Card</title>
</head>
<body>

<div style="color: white;background-color: orange; ">
  <h1 style="text-align: center;"> Karnataka School Examination and Assesment Board </h1>
  <h2 style="text-align: center;position: relative;top: -20px;">SSLC Examination Result</h2>
</div>

<% Marks_Card  mc = (Marks_Card)request.getAttribute("Markslist"); %>

<div style="position: relative;top: 70px;left: 250px;">
<div style="width: 800px" >
<ul style="display: flex;list-style: none;background-color: green;color: white;height:30px ">
  <li> Name </li>
  <li style="position: relative;left: 300px"> <%=mc.getStudent_Name() %>  </li>
</ul>
<ul style="display: flex;list-style: none;background-color: green;color: white;height:30px ">
  <li> Register Number</li>
  <li style="position: relative;left: 240px"> <%=mc.getRegster_Number() %></li>
</ul>
</div>
 
 
 <div >
<table border="1px solid  cellpadding="20px" Style="width: 500px;">
<tr>
<th> Subject</th>
<th>Internal Marks</th>
<th>External Mars</th>
<th>Total Marks</th>
</tr>


<tr>
<td>Kannada </td>
<td>  <%=mc.getKannada_Internal()%> </td>
<td> <%=mc.getKannada_external()%>  </td>
<td> <%=mc.getKannada_external()+mc.getKannada_Internal()%></td>
</tr>

<tr>
<td>English </td>
<td>  <%=mc.getEnglsh_Internal()%> </td>
<td> <%=mc.getEnglsh_external()%>  </td>
<td><%=mc.getEnglsh_Internal()+mc.getEnglsh_external()%></td>
</tr>

<tr>
<td>Hindhi </td>
<td>  <%=mc.getHindi_Internal()%> </td>
<td> <%=mc.getHindi_external()%>  </td>
<td><%=mc.getHindi_Internal()+mc.getHindi_external()%></td>
</tr>

<tr>
<td>Social </td>
<td>  <%=mc.getSocial_Internal()%> </td>
<td> <%=mc.getSocial_external()%>  </td>
<td><%=mc.getSocial_external()+mc.getSocial_Internal()%></td>
</tr>

<tr>
<td>Mathematics </td>
<td>  <%=mc.getMaths_Internal()%> </td>
<td> <%=mc.getMaths_external()%>  </td>
<td><%=mc.getMaths_Internal()+mc.getMaths_external()%></td>
</tr>

<tr>
<td>Science </td>
<td>  <%=mc.getScience_Internal()%> </td>
<td> <%=mc.getScience_external()%>  </td>
<td><%=mc.getScience_external()+mc.getScience_Internal()%></td>
</tr>


<tr>
<td colspan="3"> Total  </td> 
<% int sum= mc.getKannada_external()+mc.getKannada_Internal()+mc.getEnglsh_Internal()+mc.getEnglsh_external()
                +mc.getHindi_Internal()+mc.getHindi_external()+mc.getSocial_external()+mc.getSocial_Internal()+mc.getMaths_Internal()
                 +mc.getMaths_external()+ mc.getScience_external()+mc.getScience_Internal();%>   
	
<td>         <%=sum%>   </td>
</tr>
</table>

<ul style="display: flex;list-style: none;background-color: green;color: white;height:30px;width: 755px; ">
  <li> Result </li>        
  <li style="position: relative;left: 300px">   Pass </li>
</ul>

</div>
</div>
</div>



</body>
</html>