<#macro nav pageName>
    <div class="container-fluid mt-3 " id="nav">
        <nav class="navbar navbar-expand-lg navbar-light">
            <a class="navbar-brand" href="/" id="logo"></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse mx-auto" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link <#if pageName == "m">active</#if>" href="/">Главная<span class="sr-only">(current)</span></a>
                    <a class="nav-item nav-link <#if pageName == "o">active</#if>" href="/order">Расчет заказа</a>
                    <a class="nav-item nav-link <#if pageName == "p">active</#if>" href="/products">Продукция</a>
                    <a class="nav-item nav-link <#if pageName == "s">active</#if>" href="/standarts">Стандарты</a>
                    <a class="nav-item nav-link <#if pageName == "c">active</#if>" href="/contacts">Контакты</a>
                    <a class="nav-item nav-link disabled" href="#">UserList</a>
                </div>
            </div>
        </nav>
    </div>
</#macro>