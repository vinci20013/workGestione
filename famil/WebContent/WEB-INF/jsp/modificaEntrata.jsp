<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@page import="spring.domain.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/stili.css">
<link type="<jsp:include page="template.jsp"></jsp:include>"></link>
<title>Aggiungi Entrata</title>
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

Spesa s=(Spesa)request.getAttribute("SpesaEntrata");
int idSpesa=s.getId().getIdSpesa();
System.out.println("idSpesa in modifica jsp "+idSpesa);
Persona utenteLoggato=(Persona)request.getSession().getAttribute("utenteLoggatoSession");

int idPersona=utenteLoggato.getIdPersona();
System.out.println(idPersona);

//Calendar calendar = GregorianCalendar.getInstance();
//int an=calendar.get(Calendar.YEAR);
//System.out.println(an);
//int gio=s.getDat();
String[] temp;
Date d=s.getDat();
System.out.println("DATE data :"+d);
String pr=d.toString();
System.out.println("prova data :"+pr);
temp=pr.split("-");
String a=temp[0];
String m=temp[1];
String g=temp[2];
int ann=Integer.parseInt(a);
int mes=Integer.parseInt(m);
int giorn=Integer.parseInt(g);
//int me=calendar.get(Calendar.MONTH)+1;
//System.out.println(me);
           
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
<br><br>
<table class="tabella1" align="center" border="0">
<tr height="35px">
<td width="30px" align="center">
<img src="images/soldi_1.png" title="imm" width="110" height="75" border="0">
</td>

<td width="6px"></td>
<td width="200px">
<h4 align="left"><b>Modifica Entrata</b></h4>
</td>
</tr>
</table>
 
 <br>
 <br>

<form name="MioForm" method="post" action="modificaE.htm">
<input type="hidden" name="idPersona" value=<%=utenteLoggato.getIdPersona()%>></input>
<input type="hidden" name="idSpesa" value=<%=idSpesa%>></input>
<table align="center" border="1">
		    			    			    			
		<tr height="40px">	
		<td width="150px"><b>Data</b></td>		
			
        <td>&nbsp;&nbsp;<select class="giorno" name="giorno" >
        
		<option value="<%=giorn%>" <%if(giorno.equals("")){%>selected="selected"<% } %>><%=giorn%></option>		        	
        <option value="<%=giorn%>" <%if(giorno.equals("01")){%>selected="selected"<% } %>>1</option>
        <option value="<%=giorn%>" <%if(giorno.equals("02")){%>selected="selected"<% } %>>2</option>
        <option value="<%=giorn%>" <%if(giorno.equals("03")){%>selected="selected"<% } %>>3</option>
        <option value="<%=giorn%>" <%if(giorno.equals("04")){%>selected="selected"<% } %>>4</option>
        <option value="<%=giorn%>" <%if(giorno.equals("05")){%>selected="selected"<% } %>>5</option>
        <option value="<%=giorn%>" <%if(giorno.equals("06")){%>selected="selected"<% } %>>6</option>
        <option value="<%=giorn%>" <%if(giorno.equals("07")){%>selected="selected"<% } %>>7</option>
        <option value="<%=giorn%>" <%if(giorno.equals("08")){%>selected="selected"<% } %>>8</option>
        <option value="<%=giorn%>" <%if(giorno.equals("09")){%>selected="selected"<% } %>>9</option>
        <option value="<%=giorn%>" <%if(giorno.equals("10")){%>selected="selected"<% } %>>10</option>
        <option value="<%=giorn%>" <%if(giorno.equals("11")){%>selected="selected"<% } %>>11</option>
        <option value="<%=giorn%>" <%if(giorno.equals("12")){%>selected="selected"<% } %>>12</option>
        <option value="<%=giorn%>" <%if(giorno.equals("13")){%>selected="selected"<% } %>>13</option>
        <option value="<%=giorn%>" <%if(giorno.equals("14")){%>selected="selected"<% } %>>14</option>
        <option value="<%=giorn%>" <%if(giorno.equals("15")){%>selected="selected"<% } %>>15</option>
        <option value="<%=giorn%>" <%if(giorno.equals("16")){%>selected="selected"<% } %>>16</option>
        <option value="<%=giorn%>" <%if(giorno.equals("17")){%>selected="selected"<% } %>>17</option>
        <option value="<%=giorn%>" <%if(giorno.equals("18")){%>selected="selected"<% } %>>18</option>
        <option value="<%=giorn%>" <%if(giorno.equals("19")){%>selected="selected"<% } %>>19</option>
        <option value="<%=giorn%>" <%if(giorno.equals("20")){%>selected="selected"<% } %>>20</option>
        <option value="<%=giorn%>" <%if(giorno.equals("21")){%>selected="selected"<% } %>>21</option>
        <option value="<%=giorn%>" <%if(giorno.equals("22")){%>selected="selected"<% } %>>22</option>
        <option value="<%=giorn%>" <%if(giorno.equals("23")){%>selected="selected"<% } %>>23</option>
        <option value="<%=giorn%>" <%if(giorno.equals("24")){%>selected="selected"<% } %>>24</option>
        <option value="<%=giorn%>" <%if(giorno.equals("25")){%>selected="selected"<% } %>>25</option>
        <option value="<%=giorn%>"<%if(giorno.equals("26")){%>selected="selected"<% } %>>26</option>
        <option value="<%=giorn%>" <%if(giorno.equals("27")){%>selected="selected"<% } %>>27</option>
        <option value="<%=giorn%>" <%if(giorno.equals("28")){%>selected="selected"<% } %>>28</option>
        <option value="<%=giorn%>" <%if(giorno.equals("29")){%>selected="selected"<% } %>>29</option>
        <option value="<%=giorn%>" <%if(giorno.equals("30")){%>selected="selected"<% } %>>30</option>
        <option value="<%=giorn%>" <%if(giorno.equals("31")){%>selected="selected"<% } %>>31</option>

      </select>

      <select class="mese" name="mese" >

        
		<option value="<%=mes%>" <%if(giorno.equals("")){%>selected="selected"<% } %>><%=mes%></option>		
        <option value="<%=mes%>" <%if(mese.equals("01")){%>selected="selected"<% } %>>1</option>
        <option value="<%=mes%>" <%if(mese.equals("02")){%>selected="selected"<% } %>>2</option>
        <option value="<%=mes%>" <%if(mese.equals("03")){%>selected="selected"<% } %>>3</option>
        <option value="<%=mes%>" <%if(mese.equals("04")){%>selected="selected"<% } %>>4</option>
        <option value="<%=mes%>" <%if(mese.equals("05")){%>selected="selected"<% } %>>5</option>
        <option value="<%=mes%>" <%if(mese.equals("06")){%>selected="selected"<% } %>>6</option>
        <option value="<%=mes%>" <%if(mese.equals("07")){%>selected="selected"<% } %>>7</option>
        <option value="<%=mes%>" <%if(mese.equals("08")){%>selected="selected"<% } %>>8</option>
        <option value="<%=mes%>" <%if(mese.equals("09")){%>selected="selected"<% } %>>9</option>
        <option value="<%=mes%>" <%if(mese.equals("10")){%>selected="selected"<% } %>>10</option>
        <option value="<%=mes%>" <%if(mese.equals("11")){%>selected="selected"<% } %>>11</option>
        <option value="<%=mes%>" <%if(mese.equals("12")){%>selected="selected"<% } %>>12</option>

      </select>

      <select class="anno" name="anno" >
        
		<option value="<%=ann%>" <%if(anno.equals("")){%>selected="selected"<% } %>><%=ann%></option> 
		<option value="<%=ann%>" <%if(anno.equals("2012")){%>selected="selected"<% } %>>2012</option> 
		<option value="<%=ann%>" <%if(anno.equals("2013")){%>selected="selected"<% } %>>2013</option> 
		<!-- <option value="" <%if(giorno.equals("")){%>selected="selected"<% } %>></option>-->      
        
      </select>
	  </td>
      </tr>
	
    	<tr height="40px">
		<td width="150px"><b>Importo</b></td>
		<td>&nbsp;&nbsp;<input name="importo" type= "text" value="<%=s.getImporto()%>" size="27"/></td>
    	</tr>
     
     
     	<tr height="40px"> 
		<td width="150px"><b>Tipologia</b></td>        
        <td>&nbsp;&nbsp;              
        <select class="tipologia" name="tipologia">
                       
        <option value="Stipendio" <%if(tipologia.equals("Stipendio")){%>selected="selected"<% } %>>Stipendio</option>
        <option value="Rimborso" <%if(tipologia.equals("Rimborso")){%>selected="selected"<% } %>>Rimborso</option>
        
   
      	</select>      	   	
		</td>    
 		</tr>		
 		  
    	<tr height="40px">
		<td width="150px"><b>Descrizione</b></td>
		<td>&nbsp;&nbsp;<input name="descrizione" type="text" value="<%=s.getDescrizione()%>" size="27"/></td>
    	</tr> 
    		
    	</table>  
    		
    	<p align="center">&nbsp;</p>  
  		<table align="center" border="0">
	   	<tr>	 	  	
		   <td><a href="#" onclick="submitForm();" class="aButton"><img width="35" height="35" alt="Modifica" src="images/salva.png" title="Modifica" border="0"></a>
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