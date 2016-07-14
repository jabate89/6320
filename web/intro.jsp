<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/include/site/navbar.jsp" %>
        
        <div class="container">
            <h1>Congratulations on Taking the Initiative ${user.fname}</h1></br>
            <p>We will send a confirmation e-mail to ${user.email}</p>
            <c:if test="${user.fname == ''}">
                <p>You lack a name...</p>
            </c:if>
        </div>
    </body>
</html>
