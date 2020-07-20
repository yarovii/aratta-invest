<#import "parts/common.ftl" as co>

<@co.page "o">
    This is allowance ${detailType}
    <label class="col-sm-2 col-form-label">${detail.getType().getNameRus()}</label>
    <div class="img-square-wrapper">
        <img class="img_specification_page" src="/img/${detailType}.jpg" alt="detail_specification">
    </div>
</@co.page>

