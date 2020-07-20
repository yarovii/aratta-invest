<#import "navbar.ftl" as n>
<#macro page pageName>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Aratta Invest</title>
        <base href="/" />
        <link rel="stylesheet" href="css/bootstrap.min.css" >
<#--        <link rel="stylesheet" type="text/css" href="${/css/style.css}" />-->
        <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <@n.nav "${pageName}"/>
    <div class="container mt-4 pb-4">
        <#nested>
    </div>

    <script type="text/javascript" src="js/jquery-3.3.1.slim.min.js.css"></script>
    <script type="text/javascript" src="js/popper.min.js.css"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    </body>
</html>
</#macro>