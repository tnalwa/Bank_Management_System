<%@ include file="header.jsp"%>
<div class="container" style="margin-top:15px">
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
		<div class="col-6">
			<form method="post" action="Controller">
				<label>Name</label>
				<div class="input-group mb-3">
					<input type="text" name="name" class="form-control"
						placeholder="Recipient's username"
						aria-label="Recipient's username" aria-describedby="basic-addon2">

				</div>
				<label>Username</label>
				<div class="input-group mb-3">
					<input type="text" name="username" class="form-control"
						placeholder="Recipient's username"
						aria-label="Recipient's username" aria-describedby="basic-addon2">

				</div>

				<div class="form-group">

					<label for="exampleInputEmail1">Email address</label> <input
						type="email" name="email" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp"
						placeholder="Enter email"> <small id="emailHelp"
						class="form-text text-muted">We'll never share your email
						with anyone else.</small>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Password</label> <input
						type="password" name="password" class="form-control"
						id="exampleInputPassword1" placeholder="Password">
				</div>

				<div class="form-group">
					<label for="exampleInputPassword1">Phone No</label> <input
						type="text" name="phoneno" class="form-control"
						id="exampleInputPassword1" placeholder="PhoneNo">
				</div>
				<label>Address</label>

				<div class="md-form">
					<textarea id="form7" name="address"
						class="md-textarea form-control" rows="3"></textarea>
				</div>

				<div class="form-group">
					<br> <label for="exampleFormControlSelect1">Select
						Branch :</label> <select class="form-control" name="bname"
						id="exampleFormControlSelect1">
						<option value="delhi">Rajouri Garden, Delhi</option>
						<option value="surajpur">Greater Noida, Surajpur</option>
						<option value="faridabad">Sector-11,Faridabad</option>
						<option value="gurgaon">Vasant Kunj, Delhi</option>

					</select>
				</div>

				<div class="radio">
					<br> <label>Account Type :</label> <label><input
						name="type" type="radio" value="savings" checked>Savings</label> <label><input
						type="radio" name="type" value="current">Current</label>
				</div>
				<br>

				<button type="submit" class="btn btn-primary">Create
					Account</button>
					<br>
					<br>
			</form>

		</div>
		</div>
		</div>

		<%@ include file="footer.jsp"%>