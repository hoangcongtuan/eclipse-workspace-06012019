/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2018-12-20 15:52:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.bean.SinhVien;
import model.bean.Khoa;
import java.util.ArrayList;

public final class xoaSinhVien_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.bean.SinhVien");
    _jspx_imports_classes.add("model.bean.Khoa");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head lang=\"en\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Xóa sinh viên</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("    <script src=\"js/jquery-1.11.2.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	SinhVien sinhVien = (SinhVien)request.getAttribute("sinhVien");

      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h3>Xóa sinh viên: ");
      out.print(sinhVien.getHoTen() );
      out.write("</h3>\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("    <form action=\"XoaSinhVienServlet\" method=\"post\">\r\n");
      out.write("        <div class=\"row form-group\">\r\n");
      out.write("            <label class=\"col-lg-2\">Mã SV</label>\r\n");
      out.write("            <div class=\"col-lg-3\">\r\n");
      out.write("                <input type=\"text\" class=\" form-control\" name=\"msv\" readonly=\"readonly\" value=\"");
      out.print(sinhVien.getMsv());
      out.write("\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row form-group\">\r\n");
      out.write("            <label class=\"col-lg-2\">Họ tên</label>\r\n");
      out.write("            <div class=\"col-lg-3\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"hoten\" readonly=\"readonly\" value=\"");
      out.print(sinhVien.getHoTen());
      out.write("\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row form-group\">\r\n");
      out.write("            <label class=\"col-lg-2\">Giới tính</label>\r\n");
      out.write("            <div class=\"col-lg-3\">\r\n");
      out.write("                <input type=\"radio\" name=\"gioitinh\" value=\"1\" style=\"margin-right: 10px;\" readonly=\"readonly\" >Nam\r\n");
      out.write("                <input type=\"radio\" style=\"margin: 0px 10px 0px 30px;\" name=\"gioitinh\" value=\"0\" readonly=\"readonly\" >Nữ\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row form-group\">\r\n");
      out.write("            <label class=\"col-lg-2\">Khoa</label>\r\n");
      out.write("            <div class=\"col-lg-3\">\r\n");
      out.write("                <select class=\"form-control\" name=\"khoa\" readonly=\"readonly\">\r\n");
      out.write("                    ");

                    	ArrayList<Khoa> listKhoa = (ArrayList<Khoa>)request.getAttribute("listKhoa");
                    	for(Khoa khoa:listKhoa){
                    
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print(khoa.getMaKhoa());
      out.write('"');
      out.write('>');
      out.print(khoa.getTenKhoa() );
      out.write("</option>\r\n");
      out.write("                    ");

                    	}
                    
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row form-group\">\r\n");
      out.write("            <div class=\"col-lg-3 col-lg-offset-2\">\r\n");
      out.write("                <button class=\"btn btn-primary\" type=\"submit\" value=\"submit\" name=\"submit\">Xác nhận</button>\r\n");
      out.write("                <input class=\"btn btn-primary\" type=\"button\" value=\"Quay lại\" onclick=\"history.go(-1);\" />\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \t$(\"[name='gioitinh'][value='");
      out.print(sinhVien.getGioiTinh());
      out.write("']\").attr(\"checked\", true);\r\n");
      out.write("    \t$(\"[name='khoa']\").val(\"");
      out.print(sinhVien.getMaKhoa());
      out.write("\");\r\n");
      out.write("    </script>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
