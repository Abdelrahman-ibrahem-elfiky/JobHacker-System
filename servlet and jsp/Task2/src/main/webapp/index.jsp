<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Task Two</title>
</head>
<body>
<h1>Age Calculator</h1>
<br/>
<form action="Result.jsp">

    <label for="birthdate">Date of birth :</label>
    <input type="date" id="birthdate" name="birthdate"><br><br>

    <label for="age">Age at the date of:</label>
    <input type="date" id="age" name="age"><br><br>

    <input type="submit" value="calculate">
</form>
</body>
</html>