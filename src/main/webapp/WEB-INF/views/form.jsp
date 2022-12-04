<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form:form action="staff/save" modelAttribute="staff">

    <form:input path="id"/>
    <form:input path="fullname"/>
    <button>Save</button>

</form:form>

<table border="1">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    <c:forEach  items="${staffs}" var ="st">
        <tr>
            <td>${st.id}</td>
            <td>${st.fullname}</td>
        </tr>
    </c:forEach>
</table>