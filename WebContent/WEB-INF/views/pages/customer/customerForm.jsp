<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

  	<div class="col-sm-offset-2">
		<h1>New/Edit Customer</h1>
	</div>
    <form:form action="${pageContext.request.contextPath}/c/saveCustomer" method="post" modelAttribute="customer" class="form-horizontal">
	    <div class="form-group">
	    	<label for="customerName" class="col-sm-2 control-label">Name</label>
	    	<div class="col-sm-3">
	    		<form:input class="form-control" placeHolder="Name" path="customerName" />
	    	</div>
	    </div>
	    <div class="form-group">
	    	<label for="customerAddress" class="col-sm-2 control-label">Address</label>
	    	<div class="col-sm-3">
	    		<form:input class="form-control" placeHolder="Address" path="customerAddress" />
	    	</div>
	    </div>
	    <div class="form-group">
	    	<label for="customerContactNo" class="col-sm-2 control-label">Phone</label>
	    	<div class="col-sm-3">
	    		<form:input class="form-control" placeHolder="Phone" path="customerContactNo" />
	    	</div>
	    </div>
	    <div class="form-group">
	    	<div class="col-sm-offset-2 col-sm-2">
	    		<input type="submit" style="width:100px;" value="Save" class="btn btn-primary" />
	    	</div>
	    </div>
   		<form:hidden path="customerId"/>
    </form:form>
