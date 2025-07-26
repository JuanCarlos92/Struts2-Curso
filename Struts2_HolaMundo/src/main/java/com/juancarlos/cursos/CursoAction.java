package com.juancarlos.cursos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class CursoAction extends ActionSupport {

    private List<String> cursos;

    public static final String TITULO = "Algún título importante para la página";

    @Override
    public String execute() throws Exception {
        cursos = new ArrayList<String>();
        cursos.add("Struts 2");
        cursos.add("Spring 4");
        cursos.add("Hibernate 4");
        cursos.add("JPA 2");
        cursos.add("WELD CDI");
        cursos.add("EJB3");
        cursos.add("Java EE 7");

        return SUCCESS;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public String getTitulo() {
        return TITULO;
    }

    public Date getFecha() {
        return new Date();
    }

    private static final long serialVersionUID = 1L;

}
