<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <title>struts2_mvc4_requestParameter</title>
    <!-- Bootstrap -->
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1>
            Ejemplo: enviar Parámetros del Request <small>HTTP GET</small>
        </h1>
    </div>

    <div class="alert alert-success" role="alert">
        <p>
            <s:property value="mensaje"/>
        </p>
    </div>

    <s:url var="volver" action="index" namespace="/"/>
    <s:a class="btn btn-primary" href="%{volver}">Volver</s:a>
</div>
</body>
</html>