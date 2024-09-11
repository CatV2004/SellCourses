<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>di dz</title>
    <link rel="stylesheet" href="main.css" type="text/css"/>
</head>
<body>
    <h1>Thanks for joining our email list</h1>
    <p>Here is the information that you entered :</p>
    <div>
        <label><strong>Email :</strong></label> <br>
        <span>${user.email}</span> <br>
        <label><strong>First Name :</strong></label> <br>
        <span>${user.firstName}</span> <br>
        <label><strong>Last Name :</strong></label> <br>
        <span>${user.lastName}</span> <br>
        <label><strong>Date of Birth :</strong></label> <br>
        <span>${user.dateBirth}</span> <br>
        <label><strong>I'm know you through :</strong></label> <br>
        <span>${user.comboBox}</span> <br>
        <label><strong>Announcements Option :</strong></label> <br>
        <span>${user.checkBox}</span> <br>
        <label><strong>Contact Option :</strong></label> <br>
        <span>${user.contact}</span> <br>
        <p>To enter another email address, click on the Back
            button in your browser or the Return button shown
            below .</p>
        <form action="" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>
    </div>
    
</body>
</html>