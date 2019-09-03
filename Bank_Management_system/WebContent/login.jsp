<%@ include file="header.jsp"%>
<div class="container" style="margin-top:20px">
<div class="row">
<div class="col-12">

<div class="jumbotron">
  <h1 class="display-4">Hello, world!</h1>
  <p class="lead">This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>
  <hr class="my-4">
  <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
  <p class="lead">
    <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
  </p>
</div>
</div>
</div>
<div class="row">
<div class="col-3">
</div>
	<div class="col-5">
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
	</div>
	</div>
	</div>


<%@ include file="footer.jsp"%>