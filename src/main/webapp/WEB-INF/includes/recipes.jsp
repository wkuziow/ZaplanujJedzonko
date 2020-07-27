<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 11.02.2020
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<section>
    <div class="row padding-small">
        <i class="fas fa-users icon-users"></i>
        <h1>Przepisy naszych użytkowników:</h1>
        <hr>
        <div class="orange-line w-100"></div>
    </div>
</section>

<section class="mr-4 ml-4">

    <table class="table">
        <thead>
        <tr class="d-flex text-color-darker">
            <th scope="col" class="col-1">ID</th>
            <th scope="col" class="col-5">NAZWA</th>
            <th scope="col" class="col-5">OPIS</th>
            <th scope="col" class="col-1">AKCJE</th>
        </tr>
        </thead>
        <tbody class="text-color-lighter">
        <c:forEach items="${recipeList}" var="recipeAllList">

            <tr class="d-flex">
                <th scope="row" class="col-1"><c:out value="${recipeAllList.id}"/></th>
                <td class="col-5">
                        ${recipeAllList.name}
                </td>
                <td class="col-5">${recipeAllList.description}</td>
                <td class="col-1">
                    <input type="hidden" name="recipeDetailId" value="${recipeAllList.id}"><button type="submit">
                    <a href="/recipes/details" class="btn btn-info rounded-0 text-light">Szczegóły</a></button></td>
            </tr>
        </c:forEach>


        </tbody>
    </table>
</section>


