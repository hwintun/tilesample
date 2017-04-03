<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="${pageContext.request.contextPath}/c/saveItem" method="post" modelAttribute="item" class="form-horizontal">
	<div class="form-control">
		<div class="form-group">
	    	<label for="itemCode" class="col-sm-2 control-label">Item Code</label>
	    	<div class="col-sm-3">
	    		<form:input class="form-control" placeHolder="Code" path=""itemCode"" />
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
   		<form:hidden path="itemId"/>
	</div>
</form:form>