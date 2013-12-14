<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="spring.domain.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" href="css/stili.css">

<link type="<jsp:include page="template.jsp"></jsp:include>">

<title>Visualizza Dettaglio per Anno</title>
</head>

<script>
function submitModificaForm(elem)
{
	document.getElementById(elem).submit();
	//alert(elem);
}
function submitEliminaForm(elem)
{
	document.getElementById(elem).submit();
}
</script>
<%
Persona pers=(Persona)request.getSession().getAttribute("utenteLoggatoSession");
Calendar calendar = GregorianCalendar.getInstance();
int mese=calendar.get(Calendar.MONTH)+1;
System.out.println("mese : "+mese);
int anno=calendar.get(Calendar.YEAR);
%>

<body>
<br><br>
	<br>
	<table>
	<tr>
	<td align="center"  height ="90px" width = "280px">&nbsp;</td>
	<td align="center" class="h4" style="color:#000000; font-size: 13pt"><b>Anno&nbsp;&nbsp;<%=anno%></b>&nbsp;&nbsp;</td>
	<td>
	<form name="MioForm" id="MioForm" method="get" action="vaiAVisualizzaDettaglio.htm">
	<input type="hidden" name="idPersona" value=<%=pers%>></input>
	<a href="vediGrafico.htm"><img alt="Logout" src="images/barre.png" width="50" height="50" title="Grafico" border="0"></a>
</form>
	<!-- <a href="esci.htm"><img alt="Logout" src="images/barre.png" width="50" height="50" title="Grafico" border="0"></a>-->
	</td>
	</tr>	
	</table>
<%
HashMap<Integer,List<Spesa>> s=(HashMap<Integer,List<Spesa>>)request.getAttribute("hashEntrate");
System.out.println("s : "+s.size());
HashMap<Integer,List<Spesa>> u=(HashMap<Integer,List<Spesa>>)request.getAttribute("hashUscite");

for(int g=0; g<s.size(); g++){
	
	String monthString;
	switch (g+1) {
	    case 1:  monthString = "Gennaio";
	             break;
	    case 2:  monthString = "Febbraio";
	             break;
	    case 3:  monthString = "Marzo";
	             break;
	    case 4:  monthString = "Aprile";
	             break;
	    case 5:  monthString = "Maggio";
	             break;
	    case 6:  monthString = "Giugno";
	             break;
	    case 7:  monthString = "Luglio";
	             break;
	    case 8:  monthString = "Agosto";
	             break;
	    case 9:  monthString = "Settembre";
	             break;
	    case 10: monthString = "Ottobre";
	             break;
	    case 11: monthString = "Novembre";
	             break;
	    case 12: monthString = "Dicembre";
	             break;
	    default: monthString = "Invalid month";
	             break;
	}
double tot=0;
double finale=0;
int conta=0;
int valore=0;
double t=0;
System.out.println("meseeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee : ");
List<Spesa> m= s.get(g);
%>
	
    <fieldset>
    <legend>&nbsp;&nbsp;Dettaglio mese di&nbsp;<%=monthString%>&nbsp;&nbsp;</legend>
    <table align="center" width="600px"></table>      
   
	<br><br>
	<table align="left" class="tabella4">
    <tr>       
    <td>Entrate</td>     	
	</table>
	<br><br>
    <table class="tabella2" align="center">	
	<tr>	    			
	<td align="center" class="testaTabella"><b>Tipologia</b></td>		
	<td align="center" class="testaTabella"><b>Descrizione</b></td>
	<td align="center" class="testaTabella"><b>Data</b></td>
	<td align="center" class="testaTabella"><b>Importo</b></td>
	<td align="center" class="testaTabella"></td>		
	</tr>
	<%					
	Spesa spesa=null;
	Iterator it=m.iterator();
	
    while(it.hasNext()){		
		spesa=(Spesa) it.next();
		
		tot=tot+spesa.getImporto();	
		//metodo per arrotondare a due cifre dopo la virgola
		t=Math.floor(tot*100)/100;		
		conta++;		
	%>	
	<tr>	
	<td align="center" class="rigaColor"><%=spesa.getTipologia()%></td>	
	<td align="center" class="rigaColor"><%=spesa.getDescrizione()%></td>
	<td align="center" class="rigaColor"><%=spesa.getDat()%></td>
	<td align="center" class="rigaColor"><%=spesa.getImporto()%></td>
	<td align="center" class="rigaColor">
	<form name="<%="modificaForm_"+spesa.getId().getIdSpesa()%>" method="get" action="recuperaEntrata.htm" id="<%="modificaForm_"+spesa.getId().getIdSpesa()%>">		
	<input type="hidden" name="id" value="<%=spesa.getId().getIdSpesa()%>"/>		
	<a href="#" onclick="submitModificaForm('<%="modificaForm_"+spesa.getId().getIdSpesa()%>');" class="aButton"><img alt="Modifica" src="images/matita.png"  height="25px" width="25px" title="Modifica" border="0"></a>
	</form>
	 </td>
	</tr>		
	<%}%>	
	<tr>
	<td align="center" class="rigaColor"><b>Totale</b></td>
	<td align="center" class="rigaColor"> </td>
	<td align="center" class="rigaColor"> </td>
	<td align="center" class="rigaColor"><%=t%></td>	
	<td align="center" class="rigaColor"></td>	
	</tr>	
	</table>
	
<% 
double tot1=0;
double tt=0;
List<Spesa> usci= u.get(g);
%>


    <table align="center" width="600px">      
    </table>
	<br><br>
	<table align="left" class="tabella4">
    <tr>          
    <td>Uscite</td>     	
	</table>
    <br><br>

    <table align="center">
    <tr>
    <td>    
    <table class="tabella2" align="left"> 	
	<tr>	    			
	<td align="center" class="testaTabella"><b>Tipologia</b></td>		
	<td align="center" class="testaTabella"><b>Descrizione</b></td>
	<td align="center" class="testaTabella"><b>Data</b></td>
	<td align="center" class="testaTabella"><b>Importo</b></td>		
	</tr>
	<%					

	Iterator its=usci.iterator();
	
    while(its.hasNext()){		
		spesa=(Spesa) its.next();
		tot1=tot1+spesa.getImporto();
		//metodo per arrotondare a due cifre dopo la virgola
		tt=Math.floor(tot1*100)/100;		
		conta++;		
	%>	
	<tr>	
	<td align="center" class="rigaColor"><%=spesa.getTipologia()%></td>	
	<td align="center" class="rigaColor"><%=spesa.getDescrizione()%></td>
	<td align="center" class="rigaColor"><%=spesa.getDat()%></td>
	<td align="center" class="rigaColor"><%=spesa.getImporto()%></td>
	</tr>		
	<%}%>	
	<tr>
	<td align="center" class="rigaColor"><b>Totale</b></td>
	<td align="center" class="rigaColor"> </td>
	<td align="center" class="rigaColor"> </td>
	<td align="center" class="rigaColor"><%=tt%></td>	
	</tr>	
	
	</table>
	
	</table>
	<br><br>
	<table align="center" class="tabella3">
    <tr>    
    <td valign="top"><b>Saldo Residuo =<%=finale=Math.floor((t-tt)*100)/100%></b></td>  
    <td></td>		
	</table>		
	<br><br>
	</fieldset>	
	<br><br>
	
<%}%>
</body>
</html>