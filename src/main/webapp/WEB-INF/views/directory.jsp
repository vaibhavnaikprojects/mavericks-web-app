<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<meta charset="utf-8" />
<!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1' /><![endif]-->
<meta name="description" content="My Mav,Mavericks,Mav, UTA My Mav, UTA mymav, UTA Mav, UTA Mavericks" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="author" content="Vaibhav Naik">
<link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet"  media="all" type="text/css">
<link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet"  media="all" type="text/css">
<link href="<c:url value="/resources/css/tether.min.css"/>" rel="stylesheet"  media="all" type="text/css">
<title>Mavericks : Directory</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container-fluid">
	<div class="row">
		<div class="col-sm-12 col-md-3 col-lg-3">
			<div class="card">
					<div class="card-block">
						<h5 class="card-title">${user.userName} <a href="#" style="font-size: 10px;"><span class="glyphicon glyphicon-link" aria-hidden="true"></span> See Details</a></h5>
						<h6 class="card-subtitle mb-2 text-muted">${user.courseType}: ${user.firstMajor}</h6>
						<h6 class="card-subtitle mb-2 text-muted">${user.batch}</h6>
					    <div class="card-text">
					    	<p></p> 
					    	<p></p>
					    </div>				    
					</div>
				</div>
		<div class="card margin-top-10">
			<div class="card-block" style="padding-bottom: 0px;"><h5 class="card-title">Filters</h5></div>
			<ul id="directoryCollection" class="list-group">
				<li id="dirName"  class="list-group-item list-group-item-action justify-content-between">
					Name <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				</li>
				<li id="dirCounselor" class="list-group-item list-group-item-action justify-content-between">
					Counselor <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				</li>
				<li id="dirStaff" class="list-group-item list-group-item-action justify-content-between">
					Staff <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				</li>
				<li id="dirMajor" class="list-group-item list-group-item-action justify-content-between">
					Major <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				</li>
				<li id="dirHometown" class="list-group-item list-group-item-action justify-content-between">
					Hometown <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>  
				</li>
				<li id="dirResidence" class="list-group-item list-group-item-action justify-content-between">
					Residence <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				</li>
			</ul>
			</div>
		</div>
		<div class="col-sm-12 col-md-6 col-lg-6" style="padding-left: 0px;padding-right: 0px;">
			<div class="card" style="height: 85%">
				<div class="card-block">
				<div id="searchDiv" style="display: none">
					<div class="input-group">
						<span class="input-group-addon icon-color"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></span>
						<input id="searchDirectory" type="text" class="form-control" name="searchDirectory" placeholder="Type to search">
						<span id="searchClearButton" class="input-group-addon icon-color" style="display: none;"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></span>
					</div>
				</div>
				<div id="searchStarterMessage" style="position: absolute;top: 50%;left: 28%">
		  			<h5 class="valign center-align">Select filter to search in the directory</h5>
				</div>
				<div id="searchResults">
					<div class="row">
						<div class="col-sm-12 col-md-4 col-lg-4 padding-left-right-5">
							<div class="card margin-top-10">
								<div class="card-block">
								    <h5 class="card-title">${user.userName}</h5>
								    <h6 class="card-subtitle mb-2 text-muted">${user.courseType}: ${user.firstMajor}</h6>
								    <a href="#" class="card-link text-right">Profile</a>
								    <a href="#" class="card-link text-right">Message</a>
							  	</div>
							</div>
						</div>
						<div class="col-sm-12 col-md-4 col-lg-4 padding-left-right-5">
							<div class="card margin-top-10">
								<div class="card-block">
								    <h5 class="card-title">${user.userName}</h5>
								    <h6 class="card-subtitle mb-2 text-muted">${user.courseType}: ${user.firstMajor}</h6>
								    <a href="#" class="card-link text-right">Profile</a>
								    <a href="#" class="card-link text-right">Message</a>
							  	</div>
							</div>
						</div>
						<div class="col-sm-12 col-md-4 col-lg-4 padding-left-right-5">
							<div class="card margin-top-10">
								<div class="card-block">
								    <h5 class="card-title">${user.userName}</h5>
								    <h6 class="card-subtitle mb-2 text-muted">${user.courseType}: ${user.firstMajor}</h6>
								    <a href="#" class="card-link text-right">Profile</a>
								    <a href="#" class="card-link text-right">Message</a>
							  	</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			</div>
		</div>
		<div class="col-sm-12 col-md-3 col-lg-3">
			<div class="card" style="height: 85%">
			</div>
		</div>
	</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
<script type="text/javascript" src="<c:url value="/resources/js/api/jquery-3.1.1.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/api/tether.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/api/bootstrap.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/validations/directoryValidations.js"/>"></script>
</body>
</html>