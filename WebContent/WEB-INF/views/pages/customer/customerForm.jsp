<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div>
	<div class="col-sm-offset-1">
		<h1>New/Edit Customer</h1>
	</div>
    
    <form:form action="${pageContext.request.contextPath}/c/saveCustomer" method="post" modelAttribute="customer" class="form-horizontal">
	    <div class="form-group">
	    	<label for="customerName" class="col-sm-1 control-label">Name</label>
	    	<div class="col-sm-2">
	    		<form:input class="form-control" placeHolder="Name" path="customerName" />
	    	</div>
	    </div>
	    <div class="form-group">
	    	<label for="customerAddress" class="col-sm-1 control-label">Address</label>
	    	<div class="col-sm-2">
	    		<form:input class="form-control" placeHolder="Address" path="customerAddress" />
	    	</div>
	    </div>
	    <div class="form-group">
	    	<label for="customerContactNo" class="col-sm-1 control-label">Phone</label>
	    	<div class="col-sm-2">
	    		<form:input class="form-control" placeHolder="Phone" path="customerContactNo" />
	    	</div>
	    </div>
	    <div class="form-group">
	    	<div class="col-sm-offset-1 col-sm-2">
	    		<input type="submit" style="width:100px;" value="Save" class="btn btn-primary" />
	    	</div>
	    </div>
   		<form:hidden path="customerId"/>
    </form:form>
</div>