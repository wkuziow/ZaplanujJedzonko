<%--
  Created by IntelliJ IDEA.
  User: wojtek
  Date: 14.03.2020
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form method="post">
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
            <label class="col-sm-2 label-size col-form-label">
                Nazwa planu
            </label>
            <div class="col-sm-10">
                <input class="form-control" name="name" placeholder="Nazwa planu">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 label-size col-form-label">
                Opis planu
            </label>
            <div class="col-sm-10">
                                <textarea class="form-control" rows="5" name="description"
                                          placeholder="Opis planu"></textarea>
            </div>
        </div>

    </div>
</form>