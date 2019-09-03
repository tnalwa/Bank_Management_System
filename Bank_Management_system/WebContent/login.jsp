<%@ include file="header.jsp"%>
<form method="post" action="LoginController">
<label>Username</label>
	<div class="input-group mb-3">
		<input type="text" name="username" class="form-control"
			placeholder="Recipient's username" aria-label="Recipient's username"
			aria-describedby="basic-addon2">

	</div>
	
	<div class="form-group">
		<label for="exampleInputPassword1">Password</label> <input
			type="password" name="password" class="form-control"
			id="exampleInputPassword1" placeholder="Password">
	</div>
	
	<button type="submit" class="btn btn-primary">Login</button>
	
</form>

<%@ include file="footer.jsp"%>