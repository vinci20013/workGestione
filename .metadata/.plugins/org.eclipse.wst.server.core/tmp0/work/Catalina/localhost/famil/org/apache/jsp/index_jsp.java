package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/stili.css\">\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div  align=\"center\" id=\"home\">\r\n");
      out.write("\r\n");
      out.write("<table class=\"tabella\" align=\"center\" border=\"0\">\r\n");
      out.write("<tr height=\"30px\">\r\n");
      out.write("\r\n");
      out.write("<td width=\"20px\">\r\n");
      out.write("\r\n");
      out.write("<img src=\"images/pass.png\" title=\"imm\" border=\"0\">\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td width=\"250px\">\r\n");
      out.write("<h4 style=\"color:#2a76e4\" >Gestione Familiare</h4>\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write(" <br><br><br>\r\n");
      out.write(" <table align=\"center\" border=\"0\">\r\n");
      out.write(" <tr>\r\n");
      out.write(" <td width=\"350px\">\r\n");
      out.write(" <form  method=\"post\" action=\"log.htm\"> \r\n");
      out.write("    <fieldset>    \t\t\t\r\n");
      out.write("    \t\t\t<br>\r\n");
      out.write("    \t\t\t<br>\t\r\n");
      out.write("    \t\t\t<br>\r\n");
      out.write("    \t\t\t    \t\t\t    \t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"username\" id=\"username\" class=\"username\" \r\n");
      out.write("\t\t\t\t\t onfocus=\"if(this.value=='Nome utente') this.value='';\" title=\"Inserisci il nome utente\" size=\"15\">\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<br>\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\" class=\"password\" \r\n");
      out.write("\t\t\t\t\t onfocus=\"if(this.value=='Password') this.value='';\" title=\"Inserisci la tua password\" size=\"15\"><br><br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\".\" class=\"log\">\r\n");
      out.write("\t\t\t\t<br><br><br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("   </form> \r\n");
      out.write(" </td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" \r\n");
      out.write(" </table>\t\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write(" <p class=\"errore\">\r\n");
      out.write(" <b>");
if(request.getParameter("erroreLogin")!=null){ 
      out.write(" \r\n");
      out.write("\t ");
      out.print(request.getParameter("erroreLogin") );
      out.write("\t \r\n");
      out.write("\t\t");
 }
      out.write("</b>\r\n");
      out.write(" </p>\r\n");
      out.write("\t \r\n");
      out.write("</div>\t\r\n");
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
