<%--
  Created by IntelliJ IDEA.
  User: phuc.tc
  Date: 5/7/2019
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="resources/css/site.css" />
    <script src="resources/js/site.js"></script>

    <title>Home</title>
  </head>
  <body>
  <%--<h4>${message}</h4>--%>
  <header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light" style="background-color : #4CAF50 !important;">
      <!-- Brand -->
      <a class="navbar-brand" href="#">Home</a>

      <!-- Toggler/collapsibe Button -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
      </button>

      <!-- Navbar links -->
      <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" href="#"><span class="glyphicon glyphicon-user">Sign Up</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href='<spring:url value="/signout"/>'>Logout</a>
          </li>

        </ul>
      </div>
    </nav>
  </header>

  <div class="container">
    <main role="main" class="pb-3">
      <div style=" width: 50%;
  margin: 0 auto;">
        <h1>Hospital system</h1>
        <h1>List of patients</h1>
        <div id='list'></div>
<%--button open dialog visit--%>


        <div id="id01" class="modal">

          <form class="modal-content animate" action="/action_page.php">
            <div class="imgcontainer">
              <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
              <img src="/resources/images/writing.png" alt="Avatar" class="">
            </div>

            <div id="listVisit" class="container">
              <label for="uname"><b>Username</b></label>

            </div>

            <div class="container" style="background-color:#f1f1f1">
              <button class="buttonDialog" type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>

            </div>
          </form>
        </div>


        <%----%>

        <%--button open dialog Diagnose--%>


        <div id="id02" class="modal">

          <form class="modal-content animate" action="/action_page.php">
            <div class="imgcontainer">
              <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
              <img src="/resources/images/prescription.png" alt="Avatar" class="">
            </div>
<%--date & time--%>
            <input type="hidden" name="date" id="todayDate"/>
            <input type="hidden" name="time" id="todayTime"/>
            <div class="container">
              <label ><b>B?nh nhân</b></label>
              <label id="namePatient"><b>B?nh nhân</b></label>

            </br>
              <label ><b>DiseaseCode :</b></label>
              <div  class="container" style="display: flex;">
                <input type="text" placeholder="Enter DiseaseCode" name="psw" required>
                <button class="buttonDialog" type="button" onclick="" class="cancelbtn">Search</button>

              </div>
              <label  id="nameDiseaseName"><b>DiseaseName :</b></label>

            </div>
            <div class="container" style="background-color:#f1f1f1 ;display: flex;">
              <button class="buttonDialog" type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn">Submit</button>

              <button class="buttonDialog" type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn">Cancel</button>

            </div>
          </form>
        </div>


        <%----%>




        <%--<h1>Manage patients</h1>--%>
        <%--<label for="">Name</label>: <input type="text" id="name"/>--%>
        <%--<button onclick="doSave()">Save</button>--%>

      </div>
    </main>


  </div>

  <footer class="border-top footer text-center">
    <span >&copy; 2019 - WebApplication3 - Privacy</span>
  </footer>



  </body>
</html>
