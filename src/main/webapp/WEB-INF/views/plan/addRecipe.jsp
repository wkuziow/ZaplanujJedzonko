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


<div class="m-4 p-3 width-medium">
    <form:form autocomplete="on" method="post"
               modelAttribute="planItem">

        <div class="dashboard-content border-dashed p-3 m-4 view-height">
            <div class="row border-bottom border-3 p-1 m-1">
                <div class="col noPadding">
                    <h3 class="color-header text-uppercase">DODAJ PRZEPIS DO PLANU</h3>
                </div>
                <div class="col d-flex justify-content-end mb-2 noPadding">
                    <button type="submit" class="btn btn-success rounded-0 pt-0 pb-0 pr-4 pl-4">Zapisz</button>
                </div>
            </div>

            <div class="schedules-content">
                <form>
                    <div class="form-group row">
                        <label for="planId" class="col-sm-2 label-size col-form-label">
                            Wybierz plan
                        </label>
                        <div class="col-sm-3">


                            <select class="form-control" id="planId">
                                <c:forEach var="listOfPlans" items="${listOfPlans}">
                                    <option name="plan" value="${listOfPlans.id}">${listOfPlans.name}</option>
                                </c:forEach>

                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="mealNameId" class="col-sm-2 label-size col-form-label">
                            Nazwa posiłku
                        </label>
                        <div class="col-sm-10">
                            <form:input type="text" path="mealName" id="mealNameId" name="mealName"
                                        placeholder="Nazwa pposiłku"
                                         class="form-control"/>
                            <form:errors path="mealName" cssClass="error"/>

                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="mealTypeId" class="col-sm-2 label-size col-form-label">
                            Rodzaj posiłku
                        </label>
                        <div class="col-sm-2">

                            <form:select path="mealType"
                                         items="${mealTypeList}"
                                         itemLabel="${mealTypeList}"
                                         id="mealTypeId"
                                         class="custom-select">


                            </form:select>
                            <form:errors path="mealType" cssClass="error"/>

                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="recipie" class="col-sm-2 label-size col-form-label">
                            Przepis
                        </label>
                        <div class="col-sm-4">
                            <select class="form-control" id="recipie">
                                <option>Zapiekanka z ziemniakami i brukselką</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="day" class="col-sm-2 label-size col-form-label">
                            Dzień
                        </label>
                        <div class="col-sm-2">
                            <select class="form-control" id="day">
                                <option>poniedziałek</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                            </select>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </form:form>
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


