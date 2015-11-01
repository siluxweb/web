<%-- 
    Document   : login
    Created on : 06-oct-2015, 21:42:14
    Author     : macaco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <title>Login</title>
    <!-- BOOTSTRAP CORE STYLE  -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME ICONS  -->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link href="assets/css/style.css" rel="stylesheet" />
     <!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <% 
session.invalidate();
%>
    <header>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <strong>Email: </strong>silux@ufps.edu.co
                    &nbsp;&nbsp;
                    <strong> </strong>

            </div>
        </div>
    </header>
    <!-- HEADER END-->
    <div class="navbar navbar-inverse set-radius-zero">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">

                    <img src="http://mixure.net/Themes/Mixure%20V2/images/logo.png" />
                </a>

            </div>

            <div class="left-div">
                <i class="fa fa-user-plus login-icon" ></i>
        </div>
            </div>
        </div>
    <!-- LOGO HEADER END-->
   
    <!-- MENU SECTION END-->
    <div class="content-wrapper">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h4 class="page-head-line">Entrar </h4>

                </div>

            </div>
            <form  id="frmlogin" method="POST" action="index.jsp" >
                <div class="row">
                <div class="col-md-6">
                   <h4> Login with facebook <strong> / </strong>Google :</h4>
                    <br />
                    <a href="index.html" class="btn btn-social btn-facebook">
                            <i class="fa fa-facebook"></i>&nbsp; Facebook Account</a>
                    &nbsp;OR&nbsp;
                    <a href="index.html" class="btn btn-social btn-google">
                            <i class="fa fa-google-plus"></i>&nbsp; Google Account</a>
                    <hr />
                     <h4> O Logueese normal <strong>User Silux  :</strong></h4>
                    <br />
                     <label>Usuario </label>
                        <input type="text" class="form-control" id="user" />
                        <label>Contraseña :  </label>
                        <input  type="password" class="form-control" id="password"   />
                        <hr />
                        <input type="button" href="javascript:;" onclick="realizaProceso($('#user').val(), $('#password').val());return false;" value="Calcula"/>
                        
                         <input type="submit"class="btn btn-info" value="Entrar"/>
<div id="resultado2"></div>
                </div>
                    
            </form>
            
                <div class="col-md-6">
                    <div class="alert alert-info">
                        Esto es una cuenta silux
                        <br />
                         <strong>Cuenta silux:</strong>
                        <ul>
                            <li>
                               Bievenido
                            </li>
                            <li>
 Bievenido                            </li>
                            <li>
 Bievenido                            </li>
                            <li>
 Bievenido                            </li>
                        </ul>
                       
                    </div>
                    <div class="alert alert-success">
                         <strong> Instrucciones</strong>
                        <ul>
                            <li>
Bienvenido                            </li>
                            <li>
Bivenido                            </li>
                            <li>
Bievenido                            </li>
                            <li>
Bievenido                            </li>
                        </ul>
                       
                    </div>
                </div>

            </div>
        </div>
    </div>
    <!-- CONTENT-WRAPPER SECTION END-->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    &copy; 2015 Silux | By : <a href="http://www.ufps.edu.co" target="_blank">Ufps</a>
                </div>

            </div>
        </div>
    </footer>
    <!-- FOOTER SECTION END-->
    <!-- JAVASCRIPT AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
    <!-- CORE JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.11.1.js"></script>
    <!-- BOOTSTRAP SCRIPTS  -->
    <script src="fun1.js"></script>
    <script src="assets/js/bootstrap.js"></script>
</body>
</html>

