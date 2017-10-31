<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="utf-8" />
<!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1' /><![endif]-->
<meta name="description" content="My Mav,Mavericks,Mav, UTA My Mav, UTA mymav, UTA Mav, UTA Mavericks" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet"  media="all" type="text/css">
<link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet"  media="all" type="text/css">
<title>Mavericks</title>
</head>
<body>
	<nav class="navbar navbar-toggleable-md navbar-inverse bg-faded nav-bar-custom-header">
	  <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <a class="navbar-brand" href="#">
	    <img src="<c:url value="/resources/images/logo.jpg"/>" width="140px" alt="">
	  </a>
	</nav>
	<div class="container">
	  	<div class="row">
	  		<div class="col-sm-12 col-md-4 col-lg-4 offset-md-4 offset-lg-4">
				<div class="card">
					<div class="card-block">
						<h5 class="card-title">Login</h5>
						<div class="card-text">
							<form class="form-horizontal" action="login" method="post">
						    	<div class="row">
						    		<p class="col-sm-12  col-md-12 col-lg-12">${message}</p>
						    	</div>
						    		<div class="form-group">
							    		<div class="input-group">
							    			<span class="input-group-addon icon-color"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></span>
								          	<input id="userId" type="text" class="form-control" name="userId">
								    	</div>
							    	</div>
							    	<div class="form-group">
								    	<div class="input-group">
								    		<span class="input-group-addon icon-color"><i class="glyphicon glyphicon-pencil"></i></span>
								          	<input id="password" type="password"  class="form-control">
								    	</div>
							    	</div>
									<div class="form-group">
										<div class="col-sm-12 col-md-4 col-lg-4 offset-md-8 offset-lg-8">
											<button class="btn btn-outline-primary text-right" type="submit">Submit</button>
										</div>
									</div>
						    </form>
						</div>
					</div>
				</div>
			</div>
		    
	    </div>
	</div>
  	<jsp:include page="footer.jsp"></jsp:include>
<script type="text/javascript" src="<c:url value="/resources/js/api/jquery-3.1.1.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/api/bootstrap.min.js"/>"></script>
</body>
</html>
