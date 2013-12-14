<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@page import="spring.domain.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/stili.css">-->
</head>
<body>
 <%
Persona utenteLoggato=(Persona)request.getSession().getAttribute("utenteLoggatoSession");
 %>
  
<div align="left">
<table>
<tr>
<td width="50" ></td>
<td>
<img src="images/pers.png" title="persone" border="0">
</td>
<td width="50" align="left"><font face="verdana" size="2" style="color:#2a76cc" ><b>&nbsp;&nbsp;Ciao&nbsp;<%=utenteLoggato.getNome()%>!</b></font>
</td>
<td width="1300"></td>
<td>
 <a href="#" onclick="top.location.href = 'menu.htm'" class="aButton"><img width="40" height="40" alt="Annulla" src="images/pr.jpg" title="Annulla" border="0"></a>
</td>
<td>
<a href="esci.htm"><img alt="Logout" src="images/logout.png" title="Logout" border="0"></a>
</td>

</tr>
</table>
</div>
<br>


<table>
<tr>
<td width="50" align="left">&nbsp;&nbsp;</td>
</tr>
</table>
<br><br>
<table align="left"  width="400px" height="10000px" border="0"> 
<table align="right" width="400px" height="10000px" border="0"> 
 <tr>
<td width="100">
<div  align="center" id="home">
<table class="tabella" align="center" border="0">
<tr height="30px">
<td width="20px">
<img src="images/soldi.png" width="65" height="65" title="soldi" border="0" />
</td>
<td width="350px" >
<h1 style="color:#2a76cc"> Gestione Familiare</h1>
<br>

</td>
</tr>
</table>

<br><br>
</div>
</td>
</table>
</table>

</body>
</html>
