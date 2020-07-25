<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Zaplanuj Jedzonko</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
          crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Charmonman:400,700|Open+Sans:400,600,700&amp;subset=latin-ext"
          rel="stylesheet">
    <link href='<c:url value="/css/style.css"/>' rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
          integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
</head>

<body>

<%@include file="../../includes/header.jsp" %>

<section class="dashboard-section">
    <div class="container pt-4 pb-4">
        <div class="border-dashed view-height">
            <div class="container w-25">
                <!-- fix action, method -->
                <!-- add name attribute for all inputs -->
                <form:form autocomplete="off" method="post"
                           modelAttribute="user" class="padding-small text-center">
                    <h1 class="text-color-darker">Rejestracja</h1>
                    <label for="firstNameId">Imię</label>
                    <div class="form-group">
                        <form:input type="text" path="firstName" id="firstNameId" name="firstName" placeholder="imię"
                                    required="true" class="form-control"/>
                        <form:errors path="firstName" cssClass="error"/>
                    </div>

                    <div class="form-group">
                        <label for="lastNameId">Nazwisko: </label>
                        <form:input type="text" path="lastName" id="lastNameId" name="lastName" placeholder="nazwisko"
                                    required="true"/>
                        <form:errors path="lastName" cssClass="error"/>

                    </div>

                    <div class="form-group">
                        <label for="emailId">Email: </label>
                        <form:input type="email" path="email" id="emailId" name="email" placeholder="email"
                                    required="true"/>
                        <form:errors path="email" cssClass="error"/>
                    </div>


                    <div class="form-group">
                        <label for="passwordId">Hasło: </label>
                        <form:input type="password" path="password" id="passwordId"
                                    placeholder="hasło" required="true"/>
                        <form:errors path="password" cssClass="error"/>
                    </div>

                    <div class="form-group">
                        <label for="confirmPasswordId">Potwierdź hasło: </label>
                        <form:input type="password" path="confirmPassword" id="confirmPasswordId"
                                    placeholder="potwierdź hasło" required="true"/>
                        <form:errors path="" cssClass="error"/>

                    </div>

                    <div class="form-group form-group--buttons">
                            <%--            <a href="login.html" class="btn btn--without-border">Zaloguj się</a> --%>
                        <button class="btn" type="submit">Załóż konto</button>
                    </div>
                </form:form>

            </div>
        </div>
    </div>
</section>

<%@include file="../../includes/footer.jsp" %>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
</body>
</html>

