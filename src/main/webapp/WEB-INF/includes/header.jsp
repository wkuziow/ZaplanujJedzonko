<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 11.02.2020
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<link href='<c:url value="/css/style.css"/>' rel="stylesheet" type="text/css">

<header class="page-header">
    <nav class="navbar navbar-expand-lg justify-content-around">
        <a href="/" class="navbar-brand main-logo">
            Zaplanuj <span>Jedzonko</span>
        </a>
        <ul class="nav nounderline text-uppercase">
            <security:authorize access="isAuthenticated()">

                <li class="nav-item ml-4">Witaj! ${currentUserFullName}</li>
                <li class="nav-item ml-4"><%@include file="/WEB-INF/views/home/logout.jsp" %> </li>
                <li class="nav-item ml-4">

                    <a class="nav-link color-header" href="/dashboard">Pulpit</a>

                </li>

            </security:authorize>

            <security:authorize access="hasRole('ROLE_ADMIN')">
                <li class="nav-item ml-4">Zalogowany Admin</li>
            </security:authorize>

            <security:authorize access="isAnonymous()">
                <li class="nav-item ml-4">
                    <a class="nav-link color-header" href="/login">logowanie</a>
                </li>
                <li class="nav-item ml-4">
                    <a class="nav-link color-header" href="/register">rejestracja</a>
                </li>
                <li class="nav-item ml-4">
                    <a class="nav-link disabled" href="/recipes">Przepisy</a>
                </li>
            </security:authorize>


            <li class="nav-item ml-4">
                <a class="nav-link" href="/about">o aplikacji</a>
            </li>

            <li class="nav-item ml-4">
                <a class="nav-link disabled" href="/contact">Kontakt</a>
            </li>
        </ul>
    </nav>
</header>
