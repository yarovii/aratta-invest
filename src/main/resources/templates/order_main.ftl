<#import "parts/common.ftl" as co>

<@co.page "o">

    <div class="card-deck">
        <div class="card" style="overflow:hidden; min-width: 300px">
            <h5 class="card-header">Круглая форма</h5>
            <form action="/order/validate_round" method="post">
                <div class="card-horizontal">
                    <div class="img-square-wrapper">
                        <img class="card-img-top mt-1" src="/img/round_order_page.jpg" alt="Card image cap" id="img_order_page">
                    </div>
                    <div class="card-body">
                        <div class="form-group row">
                            <label class="col-sm-2 col-form-label">D</label>
                            <div class="col">
                                <input type="number" class="form-control" id="sizeD" placeholder="">
                            </div>
                        </div>
                        <div class="form-group row mt-2">
                            <label class="col-sm-2 col-form-label">*d</label>
                            <div class="col">
                                <input type="number" class="form-control" id="sizeSmD" placeholder="">
                            </div>
                        </div>
                        <div class="form-group row mt-2">
                            <label class="col-sm-2 col-form-label">L</label>
                            <div class="col">
                                <input type="number" class="form-control" id="sizeL" placeholder="">
                            </div>
                        </div>
<#--                        <input type="hidden" name="_csrf" value="${_csrf.token}" />-->
                        <button type="submit" class="btn btn-primary mt-2">Расчет</button>
                    </div>
                </div>
            </form>
        </div>
        <div class="card" style="overflow:hidden; min-width: 300px">
            <h5 class="card-header">Квадратная форма</h5>
            <form action="/order/validate_rect" method="post">
                <div class="card-horizontal">
                    <div class="img-square-wrapper">
                        <img class="card-img-top mt-1" src="/img/rect_order_page.jpg" alt="Card image cap" id="img_order_page">
                    </div>
                    <div class="card-body">
                        <div class="form-group row">
                            <label class="col-sm-2 col-form-label">H</label>
                            <div class="col">
                                <input type="number" class="form-control" id="sizeH" placeholder="">
                            </div>
                        </div>
                        <div class="form-group row mt-2">
                            <label class="col-sm-2 col-form-label">B</label>
                            <div class="col">
                                <input type="number" class="form-control" id="sizeB" placeholder="">
                            </div>
                        </div>
                        <div class="form-group row mt-2">
                            <label class="col-sm-2 col-form-label">L</label>
                            <div class="col">
                                <input type="number" class="form-control" id="sizeL" placeholder="">
                            </div>
                        </div>
<#--                        <input type="hidden" name="_csrf" value="${_csrf.token}" />-->
                        <button type="submit" class="btn btn-primary mt-2">Расчет</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</@co.page>
