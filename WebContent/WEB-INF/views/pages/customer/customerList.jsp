<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div align='center'>
	<table border='1'>
		<tr>
			<th>No</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Address</th>
			<th>Action</th>
		</tr>
		<c:forEach var="customer" items="customerList" varStatus="status">
			<tr>
				<td>${status.index+1}</td>
				<td>${customer.customerName}</td>
				<td>${customer.customerContactNo}</td>
				<td>${customer.customerAddress}</td>
				<td>
					<a href="/c/editCustomer?id=${customer.customerId}">Edit</a>&nbsp;&nbsp;
					<a href="/c/deleteCustomer?id=${customer.customerId}">Delete</a>
				</td>
			</tr>
		</c:forEach>		
	</table>
</div>