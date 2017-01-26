<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div align="center">
    <h1>New/Edit Customer</h1>
    <form:form action="${pageContext.request.contextPath}/c/saveCustomer" method="post" modelAttribute="customer">
    <table>
        <form:hidden path="customerId"/>
        <tr>
            <td>Name:</td>
            <td><form:input path="customerName" /></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><form:input path="customerAddress" /></td>
        </tr>
        <tr>
            <td>Telephone:</td>
            <td><form:input path="customerContactNo" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Save"></td>
        </tr>
    </table>
    </form:form>
</div>