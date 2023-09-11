<%--
  Created by IntelliJ IDEA.
  User: elfek
  Date: 9/12/2023
  Time: 12:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task Two</title>
</head>
<body>
<h1 style="color: darkblue" > result calculate</h1><br>


<%!  int newMonth=0;
    int newDay=0;
    int newYear=0;
%>
<%
    String birthdate =request.getParameter("birthdate");
    String age=request.getParameter("age");
    //split and convert integer:

    String splitPirthdate[]=birthdate.split("-");
    String splitAge[]=age.split("-");

    int bYear= Integer.parseInt(splitPirthdate[0]);
    int bMonth= Integer.parseInt(splitPirthdate[1]);
    int bDay= Integer.parseInt(splitPirthdate[2]);

    int aYear= Integer.parseInt(splitAge[0]);
    int aMonth= Integer.parseInt(splitAge[1]);
    int aDay= Integer.parseInt(splitAge[2]);



    if (bMonth<aMonth && bDay<aDay)
    {
        newYear=aYear-bYear;
        newMonth=aMonth-bMonth;
        newDay=aDay-bDay;
    } else if (bMonth>aMonth && bDay>aDay) {

        newYear=(aYear-bYear)-1;
        newMonth=(bMonth-aMonth)-11;
        newDay=30-(bDay-aDay);
    } else if (bMonth<aMonth && bDay>aDay) {

        newYear=aYear-bYear;
        newMonth=(aMonth-bMonth)-1;
        newDay=30-(bDay-aDay);
    }else{

        newYear=(aYear-bYear)-1;
        newMonth=(bMonth-aMonth)-12;
        newDay=aDay-bDay;
    }
%>
<b>years: <%=newYear%></b><br><br>
<b>Months:<%=newMonth%></b><br><br>
<b>Days: <%=newDay%></b><br><br>

</body>
</html>
