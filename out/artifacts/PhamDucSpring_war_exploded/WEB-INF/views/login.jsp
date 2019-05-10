<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>


        <title>Login</title>
    </head>
</head>
<body>
<div class="main">
    <p class="sign" align="center">Sign in</p>
    <form class="form1" action='<spring:url value="/signin"/>' method="post">
        <input class="un " name="userid" type="text" align="center" placeholder="Username">
        <input class="pass"  name="passwd" type="password" align="center" placeholder="Password">
        <button class="submit" type="submit">Login</button>
        <p class="forgot" align="center"><a href="#">Forgot Password?</p>
    </form>


</div>

<%--
            <form  class="form1" action='<spring:url value="/signin"/>' method="post">
                <h2>Login</h2>
                <hr/>
                <h4>Login Form</h4>
                <table>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="userid"></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="passwd"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td style="text-align: center; "><button type="submit">Login</button></td>
                    </tr>
                </table>
            </form>--%>
            <br/>
            <c:if test="${not empty sessionScope.message}">
                <span style="color:green"><c:out value="${sessionScope.message}"/></span>
                <c:remove var="message" scope="session" />
            </c:if>


</body>
</html>

<style>
    body {
        background-color: #F3EBF6;
        font-family: 'Ubuntu', sans-serif;
    }

    .main {
        background-color: #FFFFFF;
        width: 400px;
        height: 400px;
        margin: 7em auto;
        border-radius: 1.5em;
        box-shadow: 0px 11px 35px 2px rgba(0, 0, 0, 0.14);
    }

    .sign {
        padding-top: 40px;
        color: #4CAF50;
        font-family: 'Ubuntu', sans-serif;
        font-weight: bold;
        font-size: 23px;
    }

    .un {
        width: 76%;
        color: rgb(38, 50, 56);
        font-weight: 700;
        font-size: 14px;
        letter-spacing: 1px;
        background: rgba(136, 126, 126, 0.04);
        padding: 10px 20px;
        border: none;
        border-radius: 20px;
        outline: none;
        box-sizing: border-box;
        border: 2px solid rgba(0, 0, 0, 0.02);
        margin-bottom: 50px;
        margin-left: 46px;
        text-align: center;
        margin-bottom: 27px;
        font-family: 'Ubuntu', sans-serif;
    }

    form.form1 {
        padding-top: 40px;
    }

    .pass {
        width: 76%;
        color: rgb(38, 50, 56);
        font-weight: 700;
        font-size: 14px;
        letter-spacing: 1px;
        background: rgba(136, 126, 126, 0.04);
        padding: 10px 20px;
        border: none;
        border-radius: 20px;
        outline: none;
        box-sizing: border-box;
        border: 2px solid rgba(0, 0, 0, 0.02);
        margin-bottom: 50px;
        margin-left: 46px;
        text-align: center;
        margin-bottom: 27px;
        font-family: 'Ubuntu', sans-serif;
    }


    .un:focus, .pass:focus {
        border: 2px solid rgba(0, 0, 0, 0.18) !important;

    }

    .submit {
        cursor: pointer;
        border-radius: 5em;
        color: #fff;
        background: #4CAF50;
        border: 0;
        padding-left: 40px;
        padding-right: 40px;
        padding-bottom: 10px;
        padding-top: 10px;
        font-family: 'Ubuntu', sans-serif;
        margin-left: 35%;
        font-size: 13px;
        box-shadow: 0 0 20px 1px rgba(0, 0, 0, 0.04);
    }

    .forgot {
        text-shadow: 0px 0px 3px rgba(117, 117, 117, 0.12);
        color: #E1BEE7;
        padding-top: 15px;
    }

    a {
        text-shadow: 0px 0px 3px rgba(117, 117, 117, 0.12);
        color: #E1BEE7;
        text-decoration: none
    }

    @media (max-width: 600px) {
        .main {
            border-radius: 0px;
        }


</style>
