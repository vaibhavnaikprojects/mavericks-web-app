<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<meta charset="utf-8" />
<!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1' /><![endif]-->
<meta name="description" content="My Mav,Mavericks,Mav, UTA My Mav, UTA mymav, UTA Mav, UTA Mavericks" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="author" content="Vaibhav Naik">
<title>Mavericks : Home</title>
<link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet"  media="all" type="text/css">
<link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet"  media="all" type="text/css">
<link href="<c:url value="/resources/css/calendar.css"/>" rel="stylesheet"  media="all" type="text/css">
<link href="<c:url value="/resources/css/tether.min.css"/>" rel="stylesheet"  media="all" type="text/css">
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container-fluid" style="margin-bottom: 50px">
		<div class="row">
			<div class="col-sm-12 col-md-3 col-lg-3">
				<div class="card">
					<div class="card-block">
						<h5 class="card-title">${user.firstName} ${user.lastName}<a href="#" style="font-size: 10px;"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Edit</a></h5>
						<h6 class="card-subtitle mb-2 text-muted">${user.emailId}</h6>
						<h6 class="card-subtitle mb-2 text-muted">${user.userType}</h6>
					    <div class="card-text">
					    	<p></p> 
					    	<p></p>
					    </div>				    
					</div>
				</div>
				<div class="card margin-top-10">
					<div class="card-block">
						<h5 class="card-title">Admissions <a href="#" style="font-size: 10px;"><span class="glyphicon glyphicon-link" aria-hidden="true"></span> See Details</a></h5>
					    <div class="card-text">
					    	<div class="row">
						    	<div class="col-sm-12 col-md-6 col-lg-6">Application Term</div>
						    	<div class="col-sm-12 col-md-6 col-lg-6">${user.admitTerm}</div>
					    	</div>
					    	<div class="row">
						    	<div class="col-sm-12 col-md-6 col-lg-6">Academic Career</div>
						    	<div class="col-sm-12 col-md-6 col-lg-6">${user.acadCareerType}</div>
					    	</div>
					    	<div class="row">
						    	<div class="col-sm-12 col-md-6 col-lg-6">Academic Program</div>
						    	<div class="col-sm-12 col-md-6 col-lg-6">${user.major}</div>
					    	</div>
					    	<div class="row">
						    	<div class="col-sm-12 col-md-6 col-lg-6">Application ID</div>
						    	<div class="col-sm-12 col-md-6 col-lg-6">${user.applicationId}</div>
					    	</div>
					    	<div class="row">
						    	<div class="col-sm-12 col-md-6 col-lg-6">Application Date</div>
						    	<div class="col-sm-12 col-md-6 col-lg-6">12/27/2016</div>
					    	</div>
					    </div>
					</div>
				</div>
				<div class="card margin-top-10">
					<div class="card-block">
						<h5 class="card-title">Useful Links</h5>
						<h6 class="card-subtitle mb-2 text-muted">Student Accounts</h6>
					    <div class="card-text">
					    	<div class="row">
						    	<div class="col-sm-12 col-md-12 col-lg-12"><a href="https://www.uta.edu/uta/tuition.php" target="_blank" class="card-link">Tuition, Fees and Charges Info</a></div>
					    	</div>
					    	<div class="row">
						    	<div class="col-sm-12 col-md-12 col-lg-12"><a href="https://www.uta.edu/business-affairs/sfs/important-tax-info.php" target="_blank" class="card-link">1098-T Tax Information</a></div>
					    	</div>
					    	<div class="row">
						    	<div class="col-sm-12 col-md-12 col-lg-12"><a href="https://www.uta.edu/business-affairs/sfs/make-payment.php" target="_blank" class="card-link">Payment Options</a></div>
					    	</div>
					    </div>
					    <h6 class="card-subtitle mb-2 text-muted" style="padding-top: 10px;">Academic Services Links</h6>
					    <div class="card-text">
					    	<div class="row">
						    	<div class="col-sm-12 col-md-12 col-lg-12"><a href="https://www.credentials-inc.com/CGI-BIN/dvcgitp.pgm" target="_blank" class="card-link">Request Official Transcript</a></div>
					    	</div>
					    	<div class="row">
						    	<div class="col-sm-12 col-md-12 col-lg-12"><a href="https://www.uta.edu/admissions/" target="_blank" class="card-link">Admissions</a></div>
					    	</div>
					    	<div class="row">
					    		<div class="col-sm-12 col-md-12 col-lg-12"><a href="http://www.uta.edu/gradstudies/" target="_blank" class="card-link">Office of Graduate Studies</a></div>
					    	</div>
					    </div>
					</div>
				</div>
			</div>
			<div class="col-sm-12 col-md-6 col-lg-6"  style="padding: 0px;">
				<div class="card">
					<div class="card-block" style="padding-bottom: 0px;"><h5 class="card-title">Calendar</h5>
					<div class="card-text">
						<div id="calendar"></div>
					</div>
					</div>
				</div>
			</div>
			<div class="col-sm-12 col-md-3 col-lg-3">
				<div class="card" style="height: 240px;">
					<div class="card-block" style="padding-bottom: 0px;"><h5 class="card-title">To Do List <a href="#" style="font-size: 10px;"><span class="glyphicon glyphicon-link" aria-hidden="true"></span> See Details</a></h5></div>
					<ul class="list-group" style="font-size: 12px;overflow-y:auto">
						<li class="list-group-item">Cras justo odio</li>
					</ul>
				</div>
				<div class="card margin-top-10"  style="height: 240px;">
				<div class="card-block" style="padding-bottom: 0px;"><h5 class="card-title">Holds <a href="#" style="font-size: 10px;"><span class="glyphicon glyphicon-link" aria-hidden="true"></span> See Details</a></h5></div>
					<ul class="list-group" style="font-size: 12px;overflow-y:auto">
						<li class="list-group-item">Cras justo odio</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
<script type="text/javascript">
	var mavId='${user.mavId}';
</script>
<script type="text/javascript" src="<c:url value="/resources/js/api/jquery-3.1.1.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/api/tether.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/api/bootstrap.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/api/calendar.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/validations/homeValidations.js"/>"></script>
</body>
</html>
