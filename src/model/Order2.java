package model;


import java.io.*;
import java.util.*;
 
import javax.jdo.*;
import javax.servlet.http.*;
 
@SuppressWarnings("serial")
public class Order2 extends HttpServlet {
    public void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        String param1 = req.getParameter("itemId");
        PrintWriter out = resp.getWriter();
        List<Items> Items = null;
        if (param1 == null || param1 ==""){
            String query = "select from " + Items.class.getName();
            try {
                Items = (List<Items>)manager.newQuery(query).execute();
            } catch(JDOObjectNotFoundException e){}
        } else {
            try {
                Items data = (Items)manager.getObjectById(Items.class,Long.parseLong(param1));
                Items = new ArrayList();
                Items.add(data);
            } catch(JDOObjectNotFoundException e){}
        }
        String res = "[";
        if (Items != null){
            for(Items data:Items){
                res += "{itemId:" + data.getItemId() + ",itemName:'" + data.getItemName() + "',price:'" +
                    data.getPrice() + ",Num,:'" + data.getNum()+  "',date:'" + data.getDatetime() + "'},";
            }
        }
        res += "]";
        out.println(res);
        manager.close();
    }
}