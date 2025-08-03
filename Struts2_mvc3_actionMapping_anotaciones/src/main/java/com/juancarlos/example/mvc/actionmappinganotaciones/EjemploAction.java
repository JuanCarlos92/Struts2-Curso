package com.juancarlos.example.mvc.actionmappinganotaciones;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;


@Namespace("/holamundo")
public class EjemploAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private String mensaje;

    @Action(value = "holaMundo")
    public String holaMundo() throws Exception {
        mensaje = "Hola Mundo!";
        return SUCCESS;
    }

    @Action(value = "spring")
    public String spring() throws Exception {
        mensaje = "Hola Mundo Spring!";
        return SUCCESS;
    }

    @Action(value = "struts2", results = {@Result(location = "struts2.jsp")})
    public String struts2() throws Exception {
        mensaje = "Hola Mundo Struts2!";
        return SUCCESS;
    }

    @Action(value = "hibernate")
    public String hibernate() throws Exception {
        mensaje = "Hola Mundo Hibernate!";
        return SUCCESS;
    }

    @Action(value = "jsp2")
    public String jpa2() throws Exception {
        mensaje = "Hola Mundo JPA2!";
        return SUCCESS;
    }

    //METODOS GETTERS PASAMOS DATOS A LA VISTA
    public String getMensaje() {
        return mensaje;
    }


}
