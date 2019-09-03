<%@ include file="header.jsp"%>
<h1>Account Created</h1>
<% if(session.getAttribute("customer")!=null)
	{%>
	
	<h1>You are logged in</h1>
	   
<% } %>
<form method="post" action="BalanceController">
<label>Enter Money to Deposit</label>
	<div class="input-group mb-3">
		<input type="text" name="money" class="form-control"
			placeholder="Enter money" aria-label="Recipient's username"
			aria-describedby="basic-addon2">
<button type="submit" name="button" value="deposit" class="btn btn-primary">Deposit Money</button>
<button type="submit" name="button" value="withdraw" class="btn btn-primary">Withdraw Money</button>
</form>


<%@ include file="footer.jsp"%>

