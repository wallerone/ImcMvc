<%-- 
    Document   : index
    Created on : 14/06/2016, 12:21:06
    Author     : Wallace
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>Calculo IMC</title>

        <style>
            body {
                background-image: url("resources/img/fruta.png");
                padding-top: 50px;
                padding-bottom: 20px;
            }
        </style>

        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="jumbotron" >
            <div class="container">
                <h2>Calculo de IMC</h2>
                <form>
                    <p><h3>Peso<br><input name="peso" id="peso" type="number" step="any" class="btn btn-lg btn-warning">
                    </h3>   
                    <h3>Altura<br><input name="altura" id="altura" type="number" step="any" class="btn btn-lg btn-warning"></h3>
                    <h3>Sexo
                        <select style="width:193px;height:45px;" name="sexo" id="sexo" class="btn btn-lg btn-warning">
                            <option name="sexo1" value="1" id="sexo1">Masculino</option>
                            <option name="sexo2" value="2" id="sexo2">Feminino</option>
                        </select>
                    </h3>

                    <button class="btn btn-lg btn-block btn-info">Resultado IMC</button>
                    <b>Resultado: ${calculo}</b>

                </form>
            </div>
        </div>
    </body>
</html>
