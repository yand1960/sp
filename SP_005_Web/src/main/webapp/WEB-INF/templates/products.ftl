<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Products</title>
    </head>
    <body>
        <h1>Products MVC</h1>
        <table border="1">

            <!-- Специфический код движка шаблонов Free Marker: -->

            <#list products as p>
                <tr>
                    <td>${p.name}</td>
                    <td>${p.productNumber}</td>
                    <td>${p.listPrice}</td>
                </tr>
            </#list>

            <!--  _____________________   -->

        </table>

    </body>
</html>