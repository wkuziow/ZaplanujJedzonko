<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 20.02.2020
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Zaplanuj Jedzonko</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
          crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Charmonman:400,700|Open+Sans:400,600,700&amp;subset=latin-ext"
          rel="stylesheet">
    <style><%@include file="/css/style.css"%></style>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
</head>

<body>
<%@ include file="/WEB-INF/includes/header.jsp" %>

<section class="dashboard-section">
    <%@include file="WEB-INF/view/sidePanel.jsp"%>

        <div class="m-4 p-3 width-medium">
            <div class="dashboard-content border-dashed p-3 m-4 view-height">
                <div class="row border-bottom border-3 p-1 m-1">
                    <div class="col noPadding">
                        <h3 class="color-header text-uppercase">LISTA PLANÓW</h3>
                    </div>
                    <div class="col d-flex justify-content-end mb-2 noPadding">
                        <a href="app-add-schedules.html" class="btn btn-success rounded-0 pt-0 pb-0 pr-4 pl-4">Dodaj plan</a>
                    </div>
                </div>

                <div class="schedules-content">
                    <table class="table border-bottom">
                        <thead>
                        <tr class="d-flex">
                            <th class="col-1">ID</th>
                            <th class="col-2">NAZWA</th>
                            <th class="col-7">OPIS</th>
                            <th class="col-2 center">AKCJE</th>
                        </tr>
                        </thead>
                        <tbody class="text-color-lighter">
                        <tr class="d-flex">
                            <td class="col-1">1</td>
                            <td class="col-2">Plan jarski na bezmięsny tydzień</td>
                            <td class="col-7">
                                Pojęcie kuchnia wegetariańska określa pożywienie, które ani nie zawiera mięsa, ani nie zostało przygotowane na bazie pochodzącej z mięsa (np. na rosole drobiowym). Laktoowowegetarianie (najczęściej spotykany typ wegetarian w zachodnim świecie) spożywają nabiał, laktowegetarianie wykluczają jaja, ale nie inne produkty nabiałowe.
                            </td>
                            <td class="col-2 d-flex align-items-center justify-content-center flex-wrap"><a href="#" class="btn btn-danger rounded-0 text-light m-1">Usuń</a>
                                <a href="/app-details-schedules.html" class="btn btn-info rounded-0 text-light m-1">Szczegóły</a>
                                <a href="/app-edit-schedules.html" class="btn btn-warning rounded-0 text-light m-1">Edytuj</a>
                            </td>
                        </tr>
                        <tr class="d-flex">
                            <td class="col-1">2</td>
                            <td class="col-2">Plan jarski na bezmięsny tydzień</td>
                            <td class="col-7">
                                Pojęcie kuchnia wegetariańska określa pożywienie, które ani nie zawiera mięsa, ani nie zostało przygotowane na bazie pochodzącej z mięsa (np. na rosole drobiowym). Laktoowowegetarianie (najczęściej spotykany typ wegetarian w zachodnim świecie) spożywają nabiał, laktowegetarianie wykluczają jaja, ale nie inne produkty nabiałowe.
                            </td>
                            <td class="col-2 d-flex align-items-center justify-content-center flex-wrap"><a href="#" class="btn btn-danger rounded-0 text-light m-1">Usuń</a>
                                <a href="/app-details-schedules.html" class="btn btn-info rounded-0 text-light m-1">Szczegóły</a>
                                <a href="/app-edit-schedules.html" class="btn btn-warning rounded-0 text-light m-1">Edytuj</a>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
</body>
</html>