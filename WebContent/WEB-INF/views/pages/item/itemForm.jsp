<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="${pageContext.request.contextPath}/c/saveItem" method="post" modelAttribute="item" class="form-horizontal">
	<div class="form-control">
		<div class="form-group">
	    	<label for="itemCode" class="col-sm-2 control-label">Code</label>
	    	<div class="col-sm-3">
	    		<form:input class="form-control" placeHolder="Code" path="itemCode" />
	    	</div>
	    </div>
	    <div class="form-group">
	    	<label for="itemName" class="col-sm-2 control-label">Name</label>
	    	<div class="col-sm-3">
	    		<form:input class="form-control" placeHolder="Name" path="itemName" />
	    	</div>
	    </div>
	    <div class="form-group">
	    	<label for="itemDescription" class="col-sm-2 control-label">Description</label>
	    	<div class="col-sm-3">
	    		<form:input class="form-control" placeHolder="Description" path="itemDescription" />
	    	</div>
	    </div>
	    <div class="form-group">
	    	<label for="retailPrice" class="col-sm-2 control-label">Price</label>
	    	<div class="col-sm-3">
	    		<form:input class="form-control" placeHolder="Price" path="retailPrice" />
	    	</div>
	    </div>
	    <div class="form-group">
	    	<label for="itemWeight" class="col-sm-2 control-label">Weight</label>
	    	<div class="col-sm-3">
	    		<form:input class="form-control" placeHolder="Weight" path="itemWeight" />
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