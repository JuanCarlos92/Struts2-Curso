<%--
  Created by IntelliJ IDEA.
  User: juanc
  Date: 25/07/2025
  Time: 0:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html lang="es">
<head>
    <meta charset="utf-8">
    <title><s:property value="titulo"/></title>
    <!-- Bootstrap-->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
    <div class="page-header">
        <h1>
            <s:property value="titulo"/>
            <s:property value="fecha"/>
            <s:date name="fecha" format="dd-MM-yyyy"/>
        </h1>
    </div>
    <table class="table table-striped table-hover"
           style="width:400px; text-align: left">
        <thead>
        <tr>
            <th>Nombre</th>
        </tr>
        </thead>
        <tbody>
        <s:iterator value="cursos">
            <tr>
                <td><s:property/></td>
            </tr>
        </s:iterator>
        </tbody>
    </table>
</div>

</body>
</html>
