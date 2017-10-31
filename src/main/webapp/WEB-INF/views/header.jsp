<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-toggleable-md navbar-inverse bg-faded nav-bar-custom-header">
  <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="home">
    <img src="<c:url value="/resources/images/logo.jpg"/>" width="140px" alt="">
  </a>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav" style="margin-right: auto; !important">
      <li class="nav-item active">
        <a class="nav-link" href="home">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="directory">Directory</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="message">Message</a>
      </li>
    </ul>
    <div class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="notificationDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: #fff">
          <span class="glyphicon glyphicon-bell" aria-hidden="true"></span>
        </a>
        <div class="dropdown-menu" aria-labelledby="notificationDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </div>
      <div class="nav-item dropdown">
      	<a class="nav-link dropdown-toggle" href="#" id="userDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: #fff">
          <span class="glyphicon glyphicon-user" aria-hidden="true"></span> ${sessionScope.user.firstName} ${sessionScope.user.lastName}
       	</a>
       	<div class="dropdown-menu" aria-labelledby="userDropdown">
          <a class="dropdown-item" href="#">Logout</a>
        </div>
       </div>
  </div>
</nav>