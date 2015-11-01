
function realizaProceso(valorCaja1, valorCaja2){
        var parametros = {
               "login" : valorCaja1,
                "passworD" : valorCaja2
        };
        $.ajax({
                data:  parametros,
                url:   'logajax.jsp',
                type:  'post',
                beforeSend: function () {
                        $("#resultado2").html("Procesando, espere por favor...");
                },
                success:  function (response) {
                      $("#resultado2").html(response);
                }
        });
}