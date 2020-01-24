package hu.evo.training.pmamico.web;


import hu.evo.training.pmamico.client.EJBClient1;
import hu.evo.training.pmamico.client.EJBClient2;
import hu.evo.training.pmamico.ejb.ILocalExample;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet {

    @Inject
    EJBClient1 ejbClient1;

    @Inject
    EJBClient2 ejbClient2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String html = "";
        PrintWriter pw = resp.getWriter();
        pw.append(HtmlWriter.h(1, "SessionBean teszt"));

        pw.append(HtmlWriter.h(2, "Client 1"));

        ejbClient1.getStateful().setName("Client 1");
        ejbClient1.getStateless().setName("Client 1");
        pw.append(HtmlWriter.line(ejbClient1.getStateful().sayHello()));
        pw.append(HtmlWriter.line(ejbClient1.getStateless().sayHello()));

        pw.append(HtmlWriter.h(2, "Client 2"));
        ejbClient2.getStateful().setName("Client 2");
        ejbClient2.getStateless().setName("Client 2");
        pw.append(HtmlWriter.line(ejbClient2.getStateful().sayHello()));
        pw.append(HtmlWriter.line(ejbClient2.getStateless().sayHello()));

        pw.append(HtmlWriter.h(2, "Client 1"));
        pw.append(HtmlWriter.line(ejbClient1.getStateful().sayHello()));
        pw.append(HtmlWriter.line(ejbClient1.getStateless().sayHello()));

        pw.append(HtmlWriter.h(2, "Client 2"));
        pw.append(HtmlWriter.line(ejbClient2.getStateful().sayHello()));
        pw.append(HtmlWriter.line(ejbClient2.getStateless().sayHello()));

        pw.flush();

        pw.close();
    }
}
