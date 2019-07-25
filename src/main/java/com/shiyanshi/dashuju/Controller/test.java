//package com.shiyanshi.dashuju.Controller;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.rmi.RemoteException;
//
//@RestController
//@RequestMapping("/")
//public class test {
//    public void doGet(HttpServletRequest req, HttpServletResponse letResponse res) throws ServletException,RemoteException, IOException
//
//    { doPost(req, res); } public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
//    {
//        res.setContentType("text/javascript; charset=UTF-8");//jsonp其实回写的就是一段JavaScript代码  
//        // String functionName= req.getParameter("callback");//获得回调函数名字     
//        // PrintWriter out = res.getWriter();            
//        // out.print(String.formate("%s({'value': '001', 'text': 'show 001'})", functionName));   //    
//    }
//                  //jsonpCallback({'value': '001', 'text': 'show 001'}) 写到前端的结果     
//            // out.flush();             
//             // out.close();    }
//}
