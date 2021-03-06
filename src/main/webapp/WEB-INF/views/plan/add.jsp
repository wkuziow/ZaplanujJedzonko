<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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

<%@include file="../home/sidePanel.jsp" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form:form autocomplete="on" method="post"
            modelAttribute="plan" class="padding-small text-center">
    <div class="row border-bottom border-3 p-1 m-1">
        <div class="col noPadding">
            <h3 class="color-header text-uppercase">NOWY PLAN</h3>
        </div>
        <div class="col d-flex justify-content-end mb-2 noPadding">
            <button type="submit" class="btn btn-color rounded-0 pt-0 pb-0 pr-4 pl-4">Zapisz</button>
        </div>
    </div>

    <div class="schedules-content">

        <div class="form-group row">
            <label for="nameId" class="col-sm-2 label-size col-form-label">
                Nazwa planu
            </label>
            <div class="col-sm-10">
                <form:input type="text" path="name" id="nameId" name="name" placeholder="Nazwa planu"
                            required="true" class="form-control"/>
                <form:errors path="name" cssClass="error"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="descriptionId" class="col-sm-2 label-size col-form-label">
                Opis planu
            </label>
            <div class="col-sm-10">
                <form:input type="textarea" rows="6" path="description" id="descriptionId" name="description"
                            placeholder="Opis planu"
                            required="false" class="form-control"/>
                <form:errors path="description" cssClass="error"/>

            </div>
        </div>

    </div>
</form:form>

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


