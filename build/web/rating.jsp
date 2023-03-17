<%-- 
    Document   : rating
    Created on : Mar 11, 2023, 10:32:51 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ taglib prefix="mytag" tagdir="/WEB-INF/tags" %>
  <%--<%@ taglib  tagdir="WEB-INF/tlds/newtag_library.tld" prefix="quang" %>--%>
<!DOCTYPE html>
<html>
    <%! int m = 5; %>


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <mytag:Rating min="0" max="5" value="1" />
    </body>
</html>
