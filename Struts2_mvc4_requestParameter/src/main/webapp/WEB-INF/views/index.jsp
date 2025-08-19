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
    <div class="panel panel-default">
        <div class="panel-heading">
            Ejemplo: enviar Parámetros del Request HTTP GET
        </div>
        <div class="panel-body">
            <ul class="nav nav-pills nav-stacked">

                <!-- Ejemplo con Integer -->
                <li>
                    <s:url var="holaIntegerUrl" namespace="/ejemplo" action="hola-integer">
                        <s:param name="holaIntegerParam" value="%{'5'}" />
                    </s:url>
                    <s:a href="%{holaIntegerUrl}">Enviar holaIntegerParam=5</s:a>
                </li>

                <!-- Ejemplo con String -->
                <li>
                    <s:url var="holaStringUrl" namespace="/ejemplo" action="hola-string">
                        <s:param name="holaStringParam" value="%{'7'}" />
                    </s:url>
                    <s:a href="%{holaStringUrl}">Enviar holaStringParam=7</s:a>
                </li>

                <!-- Ejemplo con mezcla de parámetros -->
                <li>
                    <s:url var="holaStringIntegerUrl" namespace="/ejemplo" action="hola-string-integer">
                        <s:param name="holaStringParam">Hola soy un String</s:param>
                        <s:param name="holaIntegerParam">3</s:param>
                        <s:param name="saludo" value="%{'Que tal, hemos recibido un Mix de Parámetros GET'}" />
                    </s:url>
                    <s:a href="%{holaStringIntegerUrl}">Enviar un Mix de Parámetros GET</s:a>
                </li>

            </ul>
        </div>
    </div>
</div>
</body>
</html>
