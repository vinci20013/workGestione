<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@page import="spring.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/stili.css">

<title>menu</title>
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

<td width="50" align="left"><font face="verdana" size="2" style="color:#2a76e4" ><b>&nbsp;&nbsp;Ciao&nbsp;<%=utenteLoggato.getNome()%>!</b></font>
</td>

<td width="1300"></td>

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
<td width="1300" align="left" class="ggg"><u><b>HOME-</b></u></td>
</tr>
</table>
<br><br>
<div  align="center" id="home">
<table class="tabella" align="center" border="0">
<tr height="30px">
<td width="20px">

<img src="images/soldi.png" title="soldi" border="0">
</td>

<td width="350px">
<h1 style="color:#2a76e4">Gestione Familiare</h1>
</td>
</tr>
</table>

 <h2 style="color:#2a76e4" >Menu'</h2>
  <br>
  <br>
  <br>
 <table align="center" border="0">
 <tr>
   
<td width = "900px">
<table align="center" >
<tr>
<td>		
		<table border="0">
		<tr>
		<td>			
		<a href="aggiungiSpesa.htm" class="aButton"><img alt="entrateuscite" src="images/shopping_cart_info.png" height="65px" width="65px" title="uscite" border="0"></a>
		</td>
		<td></td>
		<td>
		<a href="aggiungiSpesa.htm" class="aButton">&nbsp;&nbsp;Nuova Spesa</a>
		</td>
		</tr>
		</table>
</td>
<td width="50px"></td>
<td>
		<table border="0">
		<tr>
		<td>	
		<a href="vaiAVisualizzaDettaglio.htm" class="aButton"><img alt="Ricerca" src="images/tempo_denaro.png" height="65px" width="65px" title="vista" border="0"></a>
		</td>
		<td></td>
		<td>
		<a href="vaiAVisualizzaDettaglio.htm" class="aButton">&nbsp;&nbsp;Vista</a>
		</td>
		</tr>		
		</table>
</td>
</tr>

<tr height="50px">
<td>
</td>
</tr>

<tr>
<td>		
		<table border="0">
		<tr>
		<td>			
		<a href="aggiungiEntrata.htm" class="aButton"><img alt="entrateuscite" src="images/salvadanaio.png" height="90px" width="90px" title="entrate" border="0"></a>
		</td>
		<td></td>
		<td>
		<a href="aggiungiEntrata.htm" class="aButton">&nbsp;&nbsp;Nuova Entrata</a>
		</td>
		</tr>
		</table>
</td>

<!-- RICERCA SPESE, ENTRATE -->

<td width="50px"></td>

<td>
		<table border="0">
		<tr>
		<td>	
		<a href="vaiAVisualizzaGrafico.htm" class="aButton"><img alt="Ricerca" src="images/lente.png" height="80px" width="80px" title="ricerca" border="0"></a>
		</td>
		<td></td>
		<td>
		<a href="vaiAVisualizzaGrafico.htm" class="aButton">&nbsp;&nbsp;Ricerca</a>
		</td>
		</tr>		
		</table>
</td>

<td width="50px"></td>

<td>
		<table border="0">
		<tr>
		<td>	
		<a href="storico.htm" class="aButton"><img alt="Storico" src="images/agenda.png" height="60px" width="60px" title="storico" border="0"></a>
		</td>
		<td></td>
		<td>
		<a href="storico.htm" class="aButton">&nbsp;&nbsp;Storico</a>
		</td>
		</tr>		
		</table>
</td>
</tr>
</table>
</table>
</div>
</body>
</html>
