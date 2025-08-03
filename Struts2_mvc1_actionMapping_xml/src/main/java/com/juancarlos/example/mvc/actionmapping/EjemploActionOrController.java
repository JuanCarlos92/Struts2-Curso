package com.juancarlos.example.mvc.actionmapping;

import com.opensymphony.xwork2.ActionSupport;

public class EjemploActionOrController extends ActionSupport {

    private  static final long serialVersionUID = 1L;
    private String mensaje;

    //Mapeada a la URL /holaMundo
    //Retorna un tipo String succes con el nombre del resultado
    //El resultado (result) define la vista jsp
    public String holaMundo() throws Exception{
        mensaje = "Hola Mundo!";
        return SUCCESS;
    }

    //Mapeada a la URL /holaMundo/struts2
    //Retorna un tipo String succes con el nombre del resultado
    //El resultado (result) define la vista jsp
    public String struts2() throws Exception{
        mensaje = "Hola Mundo Struts2!";
        return SUCCESS;
    }

    //Mapeada a la URL /holaMundo/hibernate
    //Retorna un tipo String succes con el nombre del resultado
    //El resultado (result) define la vista jsp
    public String hibernate() throws Exception{
        mensaje = "Hola Mundo Hibernate!";
        return SUCCESS;
    }

    //Mapeada a la URL /holaMundo/jpa2
    //Retorna un tipo String succes con el nombre del resultado
    //El resultado (result) define la vista jsp
    public String jpa2() throws Exception{
        mensaje = "Hola Mundo JPA2!";
        return SUCCESS;
    }

    //METODOS GETTERS PASAMOS DATOS A LA VISTA
    public String getMensaje() {
        return mensaje;
    }


}
