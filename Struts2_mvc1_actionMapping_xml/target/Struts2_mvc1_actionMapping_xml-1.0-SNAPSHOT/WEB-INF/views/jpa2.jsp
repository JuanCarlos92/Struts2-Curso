<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title><s:text name="mensaje"/></title>
    <!-- Bootstrap -->
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1>
            Ejemplo vista para la acción <small>jpa2()</small>
        </h1>
    </div>

    <div class="alert alert-success" role="alert">
        <p>
            <s:property value="mensaje"/>
        </p>
    </div>
</div>
</body>
