<%--getServletContext().getRequestDispatcher("/appRecipeList.jsp").forward(request, response);
  Created by IntelliJ IDEA.
  User: piotr
  Date: 12.02.2020
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<section class="mr-4 ml-4">
    <div class="row pt-4 pb-2">
        <i class="fas fa-users icon-users"></i>
        <h1>Przepisy naszych użytkowników:</h1>
        <hr>
        <div class="orange-line w-100"></div>
    </div>
</section>

<section class="width-medium text-color-darker">
    <div class="pb-2">
        <div class="border-dashed view-height w-100">
            <div class="mt-4 ml-4 mr-4">
                <div class="row border-bottom border-3">
                    <div class="col"><h3 class="color-header text-uppercase">Szczegóły przepisu</h3></div>
                    <div class="col d-flex justify-content-end mb-2"><a href="/app/recipe/list" class="btn btn-color rounded-0 pt-0 pb-0 pr-4 pl-4">Powrót</a></div>
                </div>

                <table class="table borderless">
                    <tbody>
                    <tr class="d-flex">
                        <th scope="row" class="col-2">Nazwa Przepisu</th>
                        <td class="col-7">
                            ${recipeDet.name}
                        </td>
                    </tr>
                    <tr class="d-flex">
                        <th scope="row" class="col-2">Opis przepisu</th>
                        <td class="col-7">${recipeDet.description}</td>
                    </tr>
                    <tr class="d-flex">
                        <th scope="row" class="col-2">Przygotowanie (minuty)</th>
                        <td class="col-7">
                            ${recipeDet.preparationTime}
                        </td>
                    </tr>
                    </tbody>
                </table>

                <div class="row d-flex">
                    <div class="col-5 border-bottom border-3"><h3 class="text-uppercase">Sposób przygotowania</h3></div>
                    <div class="col-2"></div>
                    <div class="col-5 border-bottom border-3"><h3 class="text-uppercase">Składniki</h3></div>
                </div>
                <div class="row d-flex">
                    <div class="col-5 p-4">
                        <p>${recipeDet.preparation}</p>
                    </div>
                    <div class="col-2"></div>
                    <ul class="col-5 p-4 list-unstyled">
                        <li>${recipeDet.ingredients}</li>

                    </ul>
                </div>
            </div>
        </div>
    </div>
</section>