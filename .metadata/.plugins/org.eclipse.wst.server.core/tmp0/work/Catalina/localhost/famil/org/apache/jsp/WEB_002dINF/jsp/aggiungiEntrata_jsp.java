package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import spring.domain.*;
import java.util.*;

public final class aggiungiEntrata_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/stili.css\">\r\n");
      out.write("<link type=\"");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template.jsp", out, false);
      out.write("\"></link>\r\n");
      out.write("\r\n");
      out.write("<title>Aggiungi Entrata</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function controllo(){\r\n");
      out.write("\t\r\n");
      out.write("\tif (document.MioForm.importo.value == ''){\t\t\t\t\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\talert(\"Inserire campo importo\");\r\n");
      out.write("\t\t    $('input[name=\"importo\"]').css('background-color', '#ffefd5').focus();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\treturn false;\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\treturn true;\t\r\n");
      out.write("  }\r\n");
      out.write("\t\t\r\n");
      out.write("\tfunction submitForm(){\r\n");
      out.write("\t\tvar check = controllo();\r\n");
      out.write("\t\tif(check)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tdocument.MioForm.submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write(" }\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");

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
         	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br><br>\r\n");
      out.write("<table class=\"tabella1\" align=\"center\" border=\"0\">\r\n");
      out.write("<tr height=\"35px\">\r\n");
      out.write("<td width=\"30px\" align=\"center\">\r\n");
      out.write("<img src=\"images/soldi_1.png\" title=\"imm\" width=\"110\" height=\"75\" border=\"0\">\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td width=\"6px\"></td>\r\n");
      out.write("<td width=\"200px\">\r\n");
      out.write("<h4 align=\"left\"><b>Aggiungi nuova Entrata</b></h4>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write(" \r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("\r\n");
      out.write("<form name=\"MioForm\" method=\"post\" action=\"inserisciEntrata.htm\">\r\n");
      out.write("<input type=\"hidden\" name=\"idPersona\" value=");
      out.print(utenteLoggato.getIdPersona());
      out.write("></input>\r\n");
      out.write("\r\n");
      out.write("<table align=\"center\" border=\"1\">\r\n");
      out.write("\t\t    \t\t\t    \t\t\t    \t\t\t\r\n");
      out.write("\t\t<tr height=\"40px\">\t\r\n");
      out.write("\t\t<td width=\"150px\"><b>Data</b></td>\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("        <td>&nbsp;&nbsp;<select class=\"giorno\" name=\"giorno\" >\r\n");
      out.write("        \r\n");
      out.write("\t\t<option value=\"");
      out.print(gio);
      out.write('"');
      out.write(' ');
if(giorno.equals("")){
      out.write("selected=\"selected\"");
 } 
      out.write('>');
      out.print(gio);
      out.write("</option>\t\t        \t\r\n");
      out.write("        <option value=\"1\" ");
if(giorno.equals("1")){
      out.write("selected=\"selected\"");
 } 
      out.write(">1</option>\r\n");
      out.write("        <option value=\"2\" ");
if(giorno.equals("2")){
      out.write("selected=\"selected\"");
 } 
      out.write(">2</option>\r\n");
      out.write("        <option value=\"3\" ");
if(giorno.equals("3")){
      out.write("selected=\"selected\"");
 } 
      out.write(">3</option>\r\n");
      out.write("        <option value=\"4\" ");
if(giorno.equals("4")){
      out.write("selected=\"selected\"");
 } 
      out.write(">4</option>\r\n");
      out.write("        <option value=\"5\" ");
if(giorno.equals("5")){
      out.write("selected=\"selected\"");
 } 
      out.write(">5</option>\r\n");
      out.write("        <option value=\"6\" ");
if(giorno.equals("6")){
      out.write("selected=\"selected\"");
 } 
      out.write(">6</option>\r\n");
      out.write("        <option value=\"7\" ");
if(giorno.equals("7")){
      out.write("selected=\"selected\"");
 } 
      out.write(">7</option>\r\n");
      out.write("        <option value=\"8\" ");
if(giorno.equals("08")){
      out.write("selected=\"selected\"");
 } 
      out.write(">8</option>\r\n");
      out.write("        <option value=\"9\" ");
if(giorno.equals("9")){
      out.write("selected=\"selected\"");
 } 
      out.write(">9</option>\r\n");
      out.write("        <option value=\"10\" ");
if(giorno.equals("10")){
      out.write("selected=\"selected\"");
 } 
      out.write(">10</option>\r\n");
      out.write("        <option value=\"11\" ");
if(giorno.equals("11")){
      out.write("selected=\"selected\"");
 } 
      out.write(">11</option>\r\n");
      out.write("        <option value=\"12\" ");
if(giorno.equals("12")){
      out.write("selected=\"selected\"");
 } 
      out.write(">12</option>\r\n");
      out.write("        <option value=\"13\" ");
if(giorno.equals("13")){
      out.write("selected=\"selected\"");
 } 
      out.write(">13</option>\r\n");
      out.write("        <option value=\"14\" ");
if(giorno.equals("14")){
      out.write("selected=\"selected\"");
 } 
      out.write(">14</option>\r\n");
      out.write("        <option value=\"15\" ");
if(giorno.equals("15")){
      out.write("selected=\"selected\"");
 } 
      out.write(">15</option>\r\n");
      out.write("        <option value=\"16\" ");
if(giorno.equals("16")){
      out.write("selected=\"selected\"");
 } 
      out.write(">16</option>\r\n");
      out.write("        <option value=\"17\" ");
if(giorno.equals("17")){
      out.write("selected=\"selected\"");
 } 
      out.write(">17</option>\r\n");
      out.write("        <option value=\"18\" ");
if(giorno.equals("18")){
      out.write("selected=\"selected\"");
 } 
      out.write(">18</option>\r\n");
      out.write("        <option value=\"19\" ");
if(giorno.equals("19")){
      out.write("selected=\"selected\"");
 } 
      out.write(">19</option>\r\n");
      out.write("        <option value=\"20\" ");
if(giorno.equals("20")){
      out.write("selected=\"selected\"");
 } 
      out.write(">20</option>\r\n");
      out.write("        <option value=\"21\" ");
if(giorno.equals("21")){
      out.write("selected=\"selected\"");
 } 
      out.write(">21</option>\r\n");
      out.write("        <option value=\"22\" ");
if(giorno.equals("22")){
      out.write("selected=\"selected\"");
 } 
      out.write(">22</option>\r\n");
      out.write("        <option value=\"23\" ");
if(giorno.equals("23")){
      out.write("selected=\"selected\"");
 } 
      out.write(">23</option>\r\n");
      out.write("        <option value=\"24\" ");
if(giorno.equals("24")){
      out.write("selected=\"selected\"");
 } 
      out.write(">24</option>\r\n");
      out.write("        <option value=\"25\" ");
if(giorno.equals("25")){
      out.write("selected=\"selected\"");
 } 
      out.write(">25</option>\r\n");
      out.write("        <option value=\"26\"");
if(giorno.equals("26")){
      out.write("selected=\"selected\"");
 } 
      out.write(">26</option>\r\n");
      out.write("        <option value=\"27\" ");
if(giorno.equals("27")){
      out.write("selected=\"selected\"");
 } 
      out.write(">27</option>\r\n");
      out.write("        <option value=\"28\" ");
if(giorno.equals("28")){
      out.write("selected=\"selected\"");
 } 
      out.write(">28</option>\r\n");
      out.write("        <option value=\"29\" ");
if(giorno.equals("29")){
      out.write("selected=\"selected\"");
 } 
      out.write(">29</option>\r\n");
      out.write("        <option value=\"30\" ");
if(giorno.equals("30")){
      out.write("selected=\"selected\"");
 } 
      out.write(">30</option>\r\n");
      out.write("        <option value=\"31\" ");
if(giorno.equals("31")){
      out.write("selected=\"selected\"");
 } 
      out.write(">31</option>\r\n");
      out.write("\r\n");
      out.write("      </select>\r\n");
      out.write("\r\n");
      out.write("      <select class=\"mese\" name=\"mese\" >\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\t\t<option value=\"");
      out.print(me);
      out.write('"');
      out.write(' ');
if(giorno.equals("")){
      out.write("selected=\"selected\"");
 } 
      out.write('>');
      out.print(me);
      out.write("</option>\t\t\r\n");
      out.write("        <option value=\"1\" ");
if(mese.equals("1")){
      out.write("selected=\"selected\"");
 } 
      out.write(">1</option>\r\n");
      out.write("        <option value=\"2\" ");
if(mese.equals("2")){
      out.write("selected=\"selected\"");
 } 
      out.write(">2</option>\r\n");
      out.write("        <option value=\"3\" ");
if(mese.equals("3")){
      out.write("selected=\"selected\"");
 } 
      out.write(">3</option>\r\n");
      out.write("        <option value=\"4\" ");
if(mese.equals("4")){
      out.write("selected=\"selected\"");
 } 
      out.write(">4</option>\r\n");
      out.write("        <option value=\"5\" ");
if(mese.equals("5")){
      out.write("selected=\"selected\"");
 } 
      out.write(">5</option>\r\n");
      out.write("        <option value=\"6\" ");
if(mese.equals("6")){
      out.write("selected=\"selected\"");
 } 
      out.write(">6</option>\r\n");
      out.write("        <option value=\"7\" ");
if(mese.equals("7")){
      out.write("selected=\"selected\"");
 } 
      out.write(">7</option>\r\n");
      out.write("        <option value=\"8\" ");
if(mese.equals("8")){
      out.write("selected=\"selected\"");
 } 
      out.write(">8</option>\r\n");
      out.write("        <option value=\"9\" ");
if(mese.equals("9")){
      out.write("selected=\"selected\"");
 } 
      out.write(">9</option>\r\n");
      out.write("        <option value=\"10\" ");
if(mese.equals("10")){
      out.write("selected=\"selected\"");
 } 
      out.write(">10</option>\r\n");
      out.write("        <option value=\"11\" ");
if(mese.equals("11")){
      out.write("selected=\"selected\"");
 } 
      out.write(">11</option>\r\n");
      out.write("        <option value=\"12\" ");
if(mese.equals("12")){
      out.write("selected=\"selected\"");
 } 
      out.write(">12</option>\r\n");
      out.write("\r\n");
      out.write("      </select>\r\n");
      out.write("\r\n");
      out.write("      <select class=\"anno\" name=\"anno\" >\r\n");
      out.write("        \r\n");
      out.write("\t\t<option value=");
      out.print(an-1);
      out.write(' ');
if(anno.equals(an-1)){
      out.write("selected=\"selected\"");
 } 
      out.write('>');
      out.print(an-1);
      out.write("</option> \r\n");
      out.write("\t\t<option value=\"");
      out.print(an);
      out.write('"');
      out.write(' ');
if(giorno.equals("")){
      out.write("selected=\"selected\"");
 } 
      out.write('>');
      out.print(an);
      out.write("</option>      \r\n");
      out.write("        \r\n");
      out.write("      </select>\r\n");
      out.write("\t  </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t\r\n");
      out.write("    \t<tr height=\"40px\">\r\n");
      out.write("\t\t<td width=\"150px\"><b>Importo</b></td>\r\n");
      out.write("\t\t<td>&nbsp;&nbsp;<input name=\"importo\" type= \"text\" value=\"\" size=\"27\"/></td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("     \t<tr height=\"40px\"> \r\n");
      out.write("\t\t<td width=\"150px\"><b>Tipologia</b></td>        \r\n");
      out.write("        <td>&nbsp;&nbsp;              \r\n");
      out.write("        <select class=\"tipologia\" name=\"tipologia\">\r\n");
      out.write("                       \r\n");
      out.write("        <option value=\"Stipendio\" ");
if(tipologia.equals("")){
      out.write("selected=\"selected\"");
 } 
      out.write(">Stipendio</option>\r\n");
      out.write("        <option value=\"Rimborso\" ");
if(tipologia.equals("Gas")){
      out.write("selected=\"selected\"");
 } 
      out.write(">Rimborso</option>\r\n");
      out.write("        \r\n");
      out.write("   \r\n");
      out.write("      \t</select>      \t   \t\r\n");
      out.write("\t\t</td>    \r\n");
      out.write(" \t\t</tr>\t\t\r\n");
      out.write(" \t\t  \r\n");
      out.write("    \t<tr height=\"40px\">\r\n");
      out.write("\t\t<td width=\"150px\"><b>Descrizione</b></td>\r\n");
      out.write("\t\t<td>&nbsp;&nbsp;<input name=\"descrizione\" type=\"text\" value=\"\" size=\"27\"/></td>\r\n");
      out.write("    \t</tr> \r\n");
      out.write("    \t\t\r\n");
      out.write("    \t</table>  \r\n");
      out.write("    \t\t\r\n");
      out.write("    \t<p align=\"center\">&nbsp;</p>  \r\n");
      out.write("  \t\t<table align=\"center\" border=\"0\">\r\n");
      out.write("\t   \t<tr>\t \t  \t\r\n");
      out.write("\t\t   <td><a href=\"#\" onclick=\"submitForm();\" class=\"aButton\"><img width=\"35\" height=\"35\" alt=\"Salva\" src=\"images/salva.png\" title=\"Salva\" border=\"0\"></a>\r\n");
      out.write("\t\t   <a href=\"#\" onclick=\"top.location.href = 'menu.htm'\" class=\"aButton\"><img width=\"40\" height=\"40\" alt=\"Annulla\" src=\"images/pr.jpg\" title=\"Annulla\" border=\"0\"></a>\t\t   \r\n");
      out.write("\t\t   </td>\r\n");
      out.write("\t    </tr>\r\n");
      out.write("   \t\t</table>\r\n");
      out.write(" \t\t\r\n");
      out.write(" </form>\r\n");
      out.write(" <br>\r\n");
      out.write(" <br>  \r\n");
      out.write(" <p class=\"errore\" align=\"center\">\r\n");
      out.write(" <b>");
if(request.getParameter("erroreFormato")!=null){ 
      out.write(" \r\n");
      out.write("\t ");
      out.print(request.getParameter("erroreFormato") );
      out.write("\t \r\n");
      out.write("\t\t");
 }
      out.write("</b>\r\n");
      out.write(" </p>\r\n");
      out.write(" \r\n");
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
