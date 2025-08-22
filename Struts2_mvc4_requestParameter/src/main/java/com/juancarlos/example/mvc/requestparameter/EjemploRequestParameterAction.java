package com.juancarlos.example.mvc.requestparameter;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

@Namespace("/ejemplo")
public class EjemploRequestParameterAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private String mensaje;

    private String holaStringParam;
    private Integer holaIntegerParam;
    private String saludo;

    @Action(value = "hola-integer", results = {@Result(location = "/WEB-INF/views/ejemplo/resultado.jsp")})
    public String holaInteger() throws Exception {
        mensaje = "Que tal, se ha enviado el siguiente Integer Parametro GET: "
                + holaIntegerParam;
        return SUCCESS;
    }

    @Action(value = "hola-string", results = {@Result(location = "/WEB-INF/views/ejemplo/resultado.jsp")})
    public String holaString() throws Exception {
        mensaje = "Que tal, se ha enviado el siguiente String Parametro GET: "
                + holaStringParam;
        return SUCCESS;
    }

    @Action(value = "hola-string-integer", results = {@Result(location = "/WEB-INF/views/ejemplo/resultado.jsp")})
    public String holaStringInteger() throws Exception {
        mensaje = saludo + ": " + holaIntegerParam + " (de tipo Integer), ";
        mensaje += "Ademas del holaString: " + holaStringParam
                + " (de tipo String) ";
        return SUCCESS;
    }

    public void setHolaStringParam(String holaStringParam) {
        this.holaStringParam = holaStringParam;
    }

    public void setHolaIntegerParam(Integer holaIntegerParam) {
        this.holaIntegerParam = holaIntegerParam;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    // Métodos getters pasamos datos a la vista
    public String getMensaje () {
        return mensaje;
    }
}
