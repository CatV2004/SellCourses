/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package murach.email;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.business.User;
@WebServlet(name = "EmailListServlet", urlPatterns = {"/emailList"})
public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest request,
                    HttpServletResponse response)
                    throws ServletException, IOException {

        String url = "/index.jsp";

        // get current action
        String action = request.getParameter ("action") ;
        if (action == null) {
        action = "join"; 
        }
        if (action.equals ("join") ) {
        url = "/index.jsp"; // the "join" page
        }
        else if (action. equals ("add") ) {
            // get parameters from the request
            String firstName = request.getParameter ("firstName") ;
            String lastName = request.getParameter ("lastName") ;
            String email = request.getParameter ("email") ;
            User user = new User (firstName,lastName,email) ;
            //UserDB.insert (user) ;
            String message;
            if(firstName == null || lastName == null || email == null ||
               firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()){
               message = "Please fill out all three text boxes.";
               url = "/index.jsp";
            }
            else{
                message ="";
                url= "/thanks.jsp";
                
            }
            request.setAttribute("user", user);
            request.setAttribute("message", message);
//            System.out.println("name" + user.getFirstName());
//            request.setAttribute("user", user);
//            url = "/thanks.jsp";
        }
            getServletContext ()
                .getRequestDispatcher(url)
                .forward (request, response) ;
    }
    @Override
    protected void doGet (HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {
        doPost(request, response) ;
    }
}