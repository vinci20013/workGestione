<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/stili.css">
<title>Login</title>
</head>

<body>
<div  align="center" id="home">

<table class="tabella" align="center" border="0">
<tr height="30px">

<td width="20px">

<img src="images/pass.png" title="imm" border="0">
</td>

<td width="250px">
<h4 style="color:#2a76e4" >Gestione Familiare</h4>
</td>

</tr>
</table>

 <br><br><br>
 <table align="center" border="0">
 <tr>
 <td width="350px">
 <form  method="post" action="log.htm"> 
    <fieldset>    			
    			<br>
    			<br>	
    			<br>
    			    			    			
				<input type="text" name="username" id="username" class="username" 
					 onfocus="if(this.value=='Nome utente') this.value='';" title="Inserisci il nome utente" size="15">
				<br>
				<br>
				<br>				
				<input type="password" name="password" id="password" class="password" 
					 onfocus="if(this.value=='Password') this.value='';" title="Inserisci la tua password" size="15"><br><br>
				
				<br><br>
				<input type="submit" value="." class="log">
				<br><br><br>
				
	</fieldset>

   </form> 
 </td>
 </tr>
 
 </table>	
<br>
<br>
 <p class="errore">
 <b><%if(request.getParameter("erroreLogin")!=null){ %> 
	 <%=request.getParameter("erroreLogin") %>	 
		<% }%></b>
 </p>
	 
</div>	
 
</body>
</html>