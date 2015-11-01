<%-- 
    Document   : logajax
    Created on : 27-oct-2015, 18:29:29
    Author     : macaco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:useBean id="usuario" scope="session" class="co.ufps.edu.dto.Usuario"/>
    
    <jsp:setProperty property="*" name="usuario"/>
    
    <jsp:useBean id="inicio" scope="session" class="co.ufps.edu.negocio.validarsesion"/>
    
        
<%

    String user=request.getParameter("login");
    
    String clave=request.getParameter("passworD");
    usuario=inicio.verificarLogin(usuario);
if(usuario!=null){

  out.print("Success!");
   
}

else{
    
   out.print("ERROR" + user +" - "+clave); 
 
}
%>






