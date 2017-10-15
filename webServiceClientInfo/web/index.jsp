<%-- 
    Document   : ClientJSP
    Created on : 14/10/2017, 10:17:29 PM
    Author     : Estudiantes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
    try {
        org.me.webserviceinfo.Calculadora_Service service = new org.me.webserviceinfo.Calculadora_Service();
        org.me.webserviceinfo.Calculadora port = service.getCalculadoraPort();
         // TODO initialize WS operation arguments here
        int i = 7;
        int j = 6;
        // TODO process result here
        int result = port.suma(i, j);
        out.println("Result = "+result);
    } catch (Exception ex) {
        // TODO handle custom exceptions here
    }
    %>
    </body>
</html>
