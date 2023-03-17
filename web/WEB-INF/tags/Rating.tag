<%-- 
    Document   : newtag_file
    Created on : Mar 13, 2023, 9:11:25 PM
    Author     : quang
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@ attribute name="min" required="true" type="java.lang.Integer" %>
<%@ attribute name="max" required="true" type="java.lang.Integer" %>
<%@ attribute name="value" required="true" type="java.lang.Integer" %>
<%-- any content can be specified here e.g.: --%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:choose>
    <c:when test="${value < min || value > max}">
        <c:out value="Invalid value"/>
    </c:when>
    <c:otherwise>
        <c:forEach begin="${min}" end="${max}" step="1" varStatus="loop">
            <c:if test="${loop.index < value}">
                <img src="images/filled_star.png" alt="star on">
            </c:if>
            <c:if test="${loop.index > value}">
                <img src="images/empty_star.png" alt="star off">
            </c:if>
        </c:forEach>
    </c:otherwise>
</c:choose>
