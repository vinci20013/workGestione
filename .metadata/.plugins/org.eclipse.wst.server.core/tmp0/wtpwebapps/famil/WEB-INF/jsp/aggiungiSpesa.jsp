<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="spring.domain.*"%>
<%@page import="java.util.*"%>
 <!-- WEB-INF/jsp/aggiungiSpesa.jsp -->   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/stili.css">

<link type="<jsp:include page="template.jsp"></jsp:include>"></link>
<title>Nuova Spesa</title>
</head>


<script type="text/javascript">
function controllo(){	
	if (document.MioForm.importo.value == ''){				
		$(document).ready(function(){
			alert("Inserire campo importo");
		    $('input[name="importo"]').css('background-color', '#ffefd5').focus();
			});
		return false;		
		}
	
	return true;	
  }
		
	function submitForm(){
		var check = controllo();
		if(check)
			{
			document.MioForm.submit();
			}
		
 }
</script>

<%
Persona utenteLoggato=(Persona)request.getSession().getAttribute("utenteLoggatoSession");

int idPersona=utenteLoggato.getIdPersona();
System.out.println(idPersona);

Calendar calendar = GregorianCalendar.getInstance();
int an=calendar.get(Calendar.YEAR);
System.out.println(an);
int gio=calendar.get(Calendar.DAY_OF_MONTH);
System.out.println(gio);
int me=calendar.get(Calendar.MONTH)+1;
System.out.println(me);
           
          String giorno="";
          String mese="";
          String anno="";
          String tipologia="";
          String descrizione="";
         	
%>

<body>

<br>
<br>
<br>
<br>

<table class="tabella1" align="center" border="0">
<tr height="35px">
<td width="30px" align="center">
<img src="images/soldi_1.png" title="imm" width="110" height="75" border="0">
</td>
<td width="6px"></td>
<td width="200px">
<h4 align="left"><b>Aggiungi nuova Spesa</b></h4>
</td>
</tr>
</table>
 
 <br>
 <br>

<form name="MioForm" id="MioForm" method="get" action="inserisciSpesa.htm">
<input type="hidden" name="idPersona" value=<%=utenteLoggato.getIdPersona()%>></input>

<table align="center" border="1">
		    			    			    			
		<tr height="40px">	
		<td width="150px"><b>Data</b></td>		
			
        <td>&nbsp;&nbsp;<select class="giorno" name="giorno" >
        
		<option value="<%=gio%>" <%if(giorno.equals("")){%>selected="selected"<% } %>><%=gio%></option>		        	
        <option value="1" <%if(giorno.equals("1")){%>selected="selected"<% } %>>1</option>
        <option value="2" <%if(giorno.equals("2")){%>selected="selected"<% } %>>2</option>
        <option value="3" <%if(giorno.equals("3")){%>selected="selected"<% } %>>3</option>
        <option value="4" <%if(giorno.equals("4")){%>selected="selected"<% } %>>4</option>
        <option value="5" <%if(giorno.equals("5")){%>selected="selected"<% } %>>5</option>
        <option value="6" <%if(giorno.equals("6")){%>selected="selected"<% } %>>6</option>
        <option value="7" <%if(giorno.equals("7")){%>selected="selected"<% } %>>7</option>
        <option value="8" <%if(giorno.equals("08")){%>selected="selected"<% } %>>8</option>
        <option value="9" <%if(giorno.equals("9")){%>selected="selected"<% } %>>9</option>
        <option value="10" <%if(giorno.equals("10")){%>selected="selected"<% } %>>10</option>
        <option value="11" <%if(giorno.equals("11")){%>selected="selected"<% } %>>11</option>
        <option value="12" <%if(giorno.equals("12")){%>selected="selected"<% } %>>12</option>
        <option value="13" <%if(giorno.equals("13")){%>selected="selected"<% } %>>13</option>
        <option value="14" <%if(giorno.equals("14")){%>selected="selected"<% } %>>14</option>
        <option value="15" <%if(giorno.equals("15")){%>selected="selected"<% } %>>15</option>
        <option value="16" <%if(giorno.equals("16")){%>selected="selected"<% } %>>16</option>
        <option value="17" <%if(giorno.equals("17")){%>selected="selected"<% } %>>17</option>
        <option value="18" <%if(giorno.equals("18")){%>selected="selected"<% } %>>18</option>
        <option value="19" <%if(giorno.equals("19")){%>selected="selected"<% } %>>19</option>
        <option value="20" <%if(giorno.equals("20")){%>selected="selected"<% } %>>20</option>
        <option value="21" <%if(giorno.equals("21")){%>selected="selected"<% } %>>21</option>
        <option value="22" <%if(giorno.equals("22")){%>selected="selected"<% } %>>22</option>
        <option value="23" <%if(giorno.equals("23")){%>selected="selected"<% } %>>23</option>
        <option value="24" <%if(giorno.equals("24")){%>selected="selected"<% } %>>24</option>
        <option value="25" <%if(giorno.equals("25")){%>selected="selected"<% } %>>25</option>
        <option value="26"<%if(giorno.equals("26")){%>selected="selected"<% } %>>26</option>
        <option value="27" <%if(giorno.equals("27")){%>selected="selected"<% } %>>27</option>
        <option value="28" <%if(giorno.equals("28")){%>selected="selected"<% } %>>28</option>
        <option value="29" <%if(giorno.equals("29")){%>selected="selected"<% } %>>29</option>
        <option value="30" <%if(giorno.equals("30")){%>selected="selected"<% } %>>30</option>
        <option value="31" <%if(giorno.equals("31")){%>selected="selected"<% } %>>31</option>

      </select>

      <select class="mese" name="mese" >

        
		<option value="<%=me%>" <%if(giorno.equals("")){%>selected="selected"<% } %>><%=me%></option>		
        <option value="1" <%if(mese.equals("1")){%>selected="selected"<% } %>>1</option>
        <option value="2" <%if(mese.equals("2")){%>selected="selected"<% } %>>2</option>
        <option value="3" <%if(mese.equals("3")){%>selected="selected"<% } %>>3</option>
        <option value="4" <%if(mese.equals("4")){%>selected="selected"<% } %>>4</option>
        <option value="5" <%if(mese.equals("5")){%>selected="selected"<% } %>>5</option>
        <option value="6" <%if(mese.equals("6")){%>selected="selected"<% } %>>6</option>
        <option value="7" <%if(mese.equals("7")){%>selected="selected"<% } %>>7</option>
        <option value="8" <%if(mese.equals("8")){%>selected="selected"<% } %>>8</option>
        <option value="9" <%if(mese.equals("9")){%>selected="selected"<% } %>>9</option>
        <option value="10" <%if(mese.equals("10")){%>selected="selected"<% } %>>10</option>
        <option value="11" <%if(mese.equals("11")){%>selected="selected"<% } %>>11</option>
        <option value="12" <%if(mese.equals("12")){%>selected="selected"<% } %>>12</option>

      </select>

      <select class="anno" name="anno" >
        
		<option value=<%=an-1%> <%if(anno.equals(an-1)){%>selected="selected"<% } %>><%=an-1%></option> 
		<option value="<%=an%>" <%if(giorno.equals("")){%>selected="selected"<% } %>><%=an%></option>      
        
      </select>
	  </td>
      </tr>
	
    	<tr height="40px">
		<td width="150px"><b>Importo</b></td>
		<td>&nbsp;&nbsp;<input name="importo" id="importo" type= "text" value="" size="27"/></td>
    	</tr>
     
     
     	<tr height="40px"> 
		<td width="150px"><b>Tipologia</b></td>        
        <td>&nbsp;&nbsp;              
        <select class="tipologia" name="tipologia">
                       
        <option value="Luce" <%if(tipologia.equals("")){%>selected="selected"<% } %>>Luce</option>
        <option value="Gas" <%if(tipologia.equals("Gas")){%>selected="selected"<% } %>>Gas</option>
        <option value="Condominio" <%if(tipologia.equals("Condominio")){%>selected="selected"<% } %>>Condominio</option>
        <option value="Strisciate" <%if(tipologia.equals("Strisciate")){%>selected="selected"<% } %>>Strisciate</option>
        <option value="Varie" <%if(tipologia.equals("Varie")){%>selected="selected"<% } %>>Varie</option>
        <option value="Mutuo" <%if(tipologia.equals("Mutuo")){%>selected="selected"<% } %>>Mutuo</option>
        <option value="PostPay" <%if(tipologia.equals("PostPay")){%>selected="selected"<% } %>>PostPay</option>        
        <option value="Prelievi" <%if(tipologia.equals("Prelievi")){%>selected="selected"<% } %>>Prelievi</option>
        <option value="Telefono" <%if(tipologia.equals("Telefono")){%>selected="selected"<% } %>>Telefono</option>
        <option value="Immondizia" <%if(tipologia.equals("Immondizia")){%>selected="selected"<% } %>>Immondizia</option>    
        <option value="Farmacia" <%if(tipologia.equals("Farmacia")){%>selected="selected"<% } %>>Farmacia</option>
   
      	</select>      	   	
		</td>    
 		</tr>		
 		  
    	<tr height="40px">
		<td width="150px"><b>Descrizione</b></td>
		<td>&nbsp;&nbsp;<input name="descrizione" id="descrizione" type="text" value="" size="27"/></td>
    	</tr> 
    		
    	</table>  
    	<div id="risposta">	</div>
    	<p align="center">&nbsp;</p>  
  		<table align="center" border="0">  		
	   	<tr>	 	  	
		   <td>
		   <a href="#" onclick="submitForm();" class="aButton"><img width="35" height="35" alt="Salva" src="images/salva.png" title="Salva" border="0"></a>		   
		   <a href="#" onclick="top.location.href = 'menu.htm'" class="aButton"><img width="40" height="40" alt="Annulla" src="images/pr.jpg" title="Annulla" border="0"></a>		   
		   </td>		  
	    </tr>	   
   		</table>
   		
 		
 </form>
 <br>
 <br>  
 <p class="errore" align="center">
 <b><%if(request.getParameter("erroreFormato")!=null){ %> 
	 <%=request.getParameter("erroreFormato") %>	 
		<% }%></b>
 </p>
 
</body>
</html>