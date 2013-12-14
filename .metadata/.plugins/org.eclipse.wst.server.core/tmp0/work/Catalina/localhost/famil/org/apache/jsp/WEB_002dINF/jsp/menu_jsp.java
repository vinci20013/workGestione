package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import spring.domain.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/stili.css\">\r\n");
      out.write("\r\n");
      out.write("<title>menu</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" ");

Persona utenteLoggato=(Persona)request.getSession().getAttribute("utenteLoggatoSession");
 
      out.write("\r\n");
      out.write("<div align=\"left\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"50\" ></td>\r\n");
      out.write("<td>\r\n");
      out.write("<img src=\"images/pers.png\" title=\"persone\" border=\"0\">\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td width=\"50\" align=\"left\"><font face=\"verdana\" size=\"2\" style=\"color:#2a76e4\" ><b>&nbsp;&nbsp;Ciao&nbsp;");
      out.print(utenteLoggato.getNome());
      out.write("!</b></font>\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td width=\"1300\"></td>\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.write("<a href=\"esci.htm\"><img alt=\"Logout\" src=\"images/logout.png\" title=\"Logout\" border=\"0\"></a>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"50\" align=\"left\">&nbsp;&nbsp;</td>\r\n");
      out.write("<td width=\"1300\" align=\"left\" class=\"ggg\"><u><b>HOME-</b></u></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br><br>\r\n");
      out.write("<div  align=\"center\" id=\"home\">\r\n");
      out.write("<table class=\"tabella\" align=\"center\" border=\"0\">\r\n");
      out.write("<tr height=\"30px\">\r\n");
      out.write("<td width=\"20px\">\r\n");
      out.write("\r\n");
      out.write("<img src=\"images/soldi.png\" title=\"soldi\" border=\"0\">\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td width=\"350px\">\r\n");
      out.write("<h1 style=\"color:#2a76e4\">Gestione Familiare</h1>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write(" <h2 style=\"color:#2a76e4\" >Menu'</h2>\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write(" <table align=\"center\" border=\"0\">\r\n");
      out.write(" <tr>\r\n");
      out.write("   \r\n");
      out.write("<td width = \"900px\">\r\n");
      out.write("<table align=\"center\" >\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\t\t\r\n");
      out.write("\t\t<table border=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>\t\t\t\r\n");
      out.write("\t\t<a href=\"aggiungiSpesa.htm\" class=\"aButton\"><img alt=\"entrateuscite\" src=\"images/shopping_cart_info.png\" height=\"65px\" width=\"65px\" title=\"uscite\" border=\"0\"></a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<a href=\"aggiungiSpesa.htm\" class=\"aButton\">&nbsp;&nbsp;Nuova Spesa</a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("</td>\r\n");
      out.write("<td width=\"50px\"></td>\r\n");
      out.write("<td>\r\n");
      out.write("\t\t<table border=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>\t\r\n");
      out.write("\t\t<a href=\"vaiAVisualizzaDettaglio.htm\" class=\"aButton\"><img alt=\"Ricerca\" src=\"images/tempo_denaro.png\" height=\"65px\" width=\"65px\" title=\"vista\" border=\"0\"></a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<a href=\"vaiAVisualizzaDettaglio.htm\" class=\"aButton\">&nbsp;&nbsp;Vista</a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr height=\"50px\">\r\n");
      out.write("<td>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\t\t\r\n");
      out.write("\t\t<table border=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>\t\t\t\r\n");
      out.write("\t\t<a href=\"aggiungiEntrata.htm\" class=\"aButton\"><img alt=\"entrateuscite\" src=\"images/salvadanaio.png\" height=\"90px\" width=\"90px\" title=\"entrate\" border=\"0\"></a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<a href=\"aggiungiEntrata.htm\" class=\"aButton\">&nbsp;&nbsp;Nuova Entrata</a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<!-- RICERCA SPESE, ENTRATE -->\r\n");
      out.write("\r\n");
      out.write("<td width=\"50px\"></td>\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.write("\t\t<table border=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>\t\r\n");
      out.write("\t\t<a href=\"vaiAVisualizzaGrafico.htm\" class=\"aButton\"><img alt=\"Ricerca\" src=\"images/lente.png\" height=\"80px\" width=\"80px\" title=\"ricerca\" border=\"0\"></a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<a href=\"vaiAVisualizzaGrafico.htm\" class=\"aButton\">&nbsp;&nbsp;Ricerca</a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td width=\"50px\"></td>\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.write("\t\t<table border=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>\t\r\n");
      out.write("\t\t<a href=\"storico.htm\" class=\"aButton\"><img alt=\"Storico\" src=\"images/agenda.png\" height=\"60px\" width=\"60px\" title=\"storico\" border=\"0\"></a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<a href=\"storico.htm\" class=\"aButton\">&nbsp;&nbsp;Storico</a>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
