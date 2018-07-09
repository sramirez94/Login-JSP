<%-- 
    Document   : validardatos
    Created on : 26/06/2018, 07:01:06 PM
    Author     : Salvador RL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="css/lockopen.ico">
        <title>Validación de contraseña</title>
    </head>
    <% controlador.admin p = new controlador.admin();
    p.setUsuario(request.getParameter("usuario"));
    p.setcontrasena(request.getParameter("contrasena"));
    String res = p.insertar3();
    if (res.equals("-1")){
        out.println("Has entrado con éxito");
        %>
        <a href="http://www.google.com.mx"> entrar </a>
        <%
    }
    else if (res.equals("1")){
        out.print("Fallo de autenticación");
    } else {
        out.print("algo pasa");
    }
    %>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
