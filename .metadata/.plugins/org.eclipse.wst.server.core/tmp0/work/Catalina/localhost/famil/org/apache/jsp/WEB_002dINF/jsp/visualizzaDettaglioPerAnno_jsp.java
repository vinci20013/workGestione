package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import spring.domain.*;
import java.util.*;

public final class visualizzaDettaglioPerAnno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/stili.css\">\r\n");
      out.write("\r\n");
      out.write("<link type=\"");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template.jsp", out, false);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<title>Visualizza Dettaglio per Anno</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function submitModificaForm(elem)\r\n");
      out.write("{\r\n");
      out.write("\tdocument.getElementById(elem).submit();\r\n");
      out.write("\t//alert(elem);\r\n");
      out.write("}\r\n");
      out.write("function submitEliminaForm(elem)\r\n");
      out.write("{\r\n");
      out.write("\tdocument.getElementById(elem).submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");

Persona pers=(Persona)request.getSession().getAttribute("utenteLoggatoSession");
Calendar calendar = GregorianCalendar.getInstance();
int mese=calendar.get(Calendar.MONTH)+1;
System.out.println("mese : "+mese);
int anno=calendar.get(Calendar.YEAR);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<br><br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td align=\"center\"  height =\"90px\" width = \"280px\">&nbsp;</td>\r\n");
      out.write("\t<td align=\"center\" class=\"h4\" style=\"color:#000000; font-size: 13pt\"><b>Anno&nbsp;&nbsp;");
      out.print(anno);
      out.write("</b>&nbsp;&nbsp;</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<form name=\"MioForm\" id=\"MioForm\" method=\"get\" action=\"vaiAVisualizzaDettaglio.htm\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"idPersona\" value=");
      out.print(pers);
      out.write("></input>\r\n");
      out.write("\t<a href=\"vediGrafico.htm\"><img alt=\"Logout\" src=\"images/barre.png\" width=\"50\" height=\"50\" title=\"Grafico\" border=\"0\"></a>\r\n");
      out.write("</form>\r\n");
      out.write("\t<!-- <a href=\"esci.htm\"><img alt=\"Logout\" src=\"images/barre.png\" width=\"50\" height=\"50\" title=\"Grafico\" border=\"0\"></a>-->\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t</table>\r\n");

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

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    <fieldset>\r\n");
      out.write("    <legend>&nbsp;&nbsp;Dettaglio mese di&nbsp;");
      out.print(monthString);
      out.write("&nbsp;&nbsp;</legend>\r\n");
      out.write("    <table align=\"center\" width=\"600px\"></table>      \r\n");
      out.write("   \r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<table align=\"left\" class=\"tabella4\">\r\n");
      out.write("    <tr>       \r\n");
      out.write("    <td>Entrate</td>     \t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("    <table class=\"tabella2\" align=\"center\">\t\r\n");
      out.write("\t<tr>\t    \t\t\t\r\n");
      out.write("\t<td align=\"center\" class=\"testaTabella\"><b>Tipologia</b></td>\t\t\r\n");
      out.write("\t<td align=\"center\" class=\"testaTabella\"><b>Descrizione</b></td>\r\n");
      out.write("\t<td align=\"center\" class=\"testaTabella\"><b>Data</b></td>\r\n");
      out.write("\t<td align=\"center\" class=\"testaTabella\"><b>Importo</b></td>\r\n");
      out.write("\t<td align=\"center\" class=\"testaTabella\"></td>\t\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
					
	Spesa spesa=null;
	Iterator it=m.iterator();
	
    while(it.hasNext()){		
		spesa=(Spesa) it.next();
		
		tot=tot+spesa.getImporto();	
		//metodo per arrotondare a due cifre dopo la virgola
		t=Math.floor(tot*100)/100;		
		conta++;		
	
      out.write("\t\r\n");
      out.write("\t<tr>\t\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\">");
      out.print(spesa.getTipologia());
      out.write("</td>\t\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\">");
      out.print(spesa.getDescrizione());
      out.write("</td>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\">");
      out.print(spesa.getDat());
      out.write("</td>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\">");
      out.print(spesa.getImporto());
      out.write("</td>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\">\r\n");
      out.write("\t<form name=\"");
      out.print("modificaForm_"+spesa.getId().getIdSpesa());
      out.write("\" method=\"get\" action=\"recuperaEntrata.htm\" id=\"");
      out.print("modificaForm_"+spesa.getId().getIdSpesa());
      out.write("\">\t\t\r\n");
      out.write("\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(spesa.getId().getIdSpesa());
      out.write("\"/>\t\t\r\n");
      out.write("\t<a href=\"#\" onclick=\"submitModificaForm('");
      out.print("modificaForm_"+spesa.getId().getIdSpesa());
      out.write("');\" class=\"aButton\"><img alt=\"Modifica\" src=\"images/matita.png\"  height=\"25px\" width=\"25px\" title=\"Modifica\" border=\"0\"></a>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t </td>\r\n");
      out.write("\t</tr>\t\t\r\n");
      out.write("\t");
}
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\"><b>Totale</b></td>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\"> </td>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\"> </td>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\">");
      out.print(t);
      out.write("</td>\t\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\"></td>\t\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
 
double tot1=0;
double tt=0;
List<Spesa> usci= u.get(g);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <table align=\"center\" width=\"600px\">      \r\n");
      out.write("    </table>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<table align=\"left\" class=\"tabella4\">\r\n");
      out.write("    <tr>          \r\n");
      out.write("    <td>Uscite</td>     \t\r\n");
      out.write("\t</table>\r\n");
      out.write("    <br><br>\r\n");
      out.write("\r\n");
      out.write("    <table align=\"center\">\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>    \r\n");
      out.write("    <table class=\"tabella2\" align=\"left\"> \t\r\n");
      out.write("\t<tr>\t    \t\t\t\r\n");
      out.write("\t<td align=\"center\" class=\"testaTabella\"><b>Tipologia</b></td>\t\t\r\n");
      out.write("\t<td align=\"center\" class=\"testaTabella\"><b>Descrizione</b></td>\r\n");
      out.write("\t<td align=\"center\" class=\"testaTabella\"><b>Data</b></td>\r\n");
      out.write("\t<td align=\"center\" class=\"testaTabella\"><b>Importo</b></td>\t\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
					

	Iterator its=usci.iterator();
	
    while(its.hasNext()){		
		spesa=(Spesa) its.next();
		tot1=tot1+spesa.getImporto();
		//metodo per arrotondare a due cifre dopo la virgola
		tt=Math.floor(tot1*100)/100;		
		conta++;		
	
      out.write("\t\r\n");
      out.write("\t<tr>\t\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\">");
      out.print(spesa.getTipologia());
      out.write("</td>\t\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\">");
      out.print(spesa.getDescrizione());
      out.write("</td>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\">");
      out.print(spesa.getDat());
      out.write("</td>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\">");
      out.print(spesa.getImporto());
      out.write("</td>\r\n");
      out.write("\t</tr>\t\t\r\n");
      out.write("\t");
}
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\"><b>Totale</b></td>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\"> </td>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\"> </td>\r\n");
      out.write("\t<td align=\"center\" class=\"rigaColor\">");
      out.print(tt);
      out.write("</td>\t\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<table align=\"center\" class=\"tabella3\">\r\n");
      out.write("    <tr>    \r\n");
      out.write("    <td valign=\"top\"><b>Saldo Residuo =");
      out.print(finale=Math.floor((t-tt)*100)/100);
      out.write("</b></td>  \r\n");
      out.write("    <td></td>\t\t\r\n");
      out.write("\t</table>\t\t\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t</fieldset>\t\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t\r\n");
}
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
