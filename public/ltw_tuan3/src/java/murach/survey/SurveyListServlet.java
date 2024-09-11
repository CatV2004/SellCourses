/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.survey;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.business.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@WebServlet(name = "SurveyListServlet", urlPatterns = {"/surveyList"})
public class SurveyListServlet extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest request,
                    HttpServletResponse response)
                    throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter ("action") ;
        if (action == null) {
        action = "join"; 
        }
        if (action.equals ("join") ) {
        url = "/index.html"; // the "join" page
        }
        else if (action. equals ("add") ) {
            // get parameters from the request
            String firstName = request.getParameter ("firstName") ;
            String lastName = request.getParameter ("lastName") ;
            String email = request.getParameter ("email") ;
            //String dateBirth = request.getParameter("dateBirth");
            String dateOfBirth = request.getParameter("dateBirth");
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd"); 
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");      
            String formattedDate = dateOfBirth;
            try 
            {
                Date date = inputFormat.parse(dateOfBirth);
                formattedDate = outputFormat.format(date);       
            } 
            catch (ParseException e) 
            {
                e.printStackTrace();  
            }
            String comboBox = request.getParameter("comboBox");  
            //String checkBox = request.getParameter("checkBox");
            // Nhận tất cả các giá trị checkbox
            String[] checkBoxes = request.getParameterValues("checkBox");
            // Khởi tạo một chuỗi để chứa tất cả các giá trị checkbox đã chọn
            StringBuilder checkBoxSelections = new StringBuilder();

            if (checkBoxes != null) {
                for (String checkBox : checkBoxes) {
                    checkBoxSelections.append(checkBox).append("<br>");
                }
            } else {
                checkBoxSelections.append("No selections made");
            }
            String contact = request.getParameter("contact");
            User user = new User (firstName,lastName,email,formattedDate,comboBox,checkBoxSelections.toString(),contact) ;
            //UserDB.insert (user) ;
            request.setAttribute("user", user);
            url = "/thanks.jsp";
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
