 $(document).ready(function() {
 
                $('form').on('submit', function(e) {
                    // don't let the browser submit the form
                    e.preventDefault();
 
                    $.ajax({
                        url: 'logajax.jsp',
                        async: true,
                        cache: false,
                        type: 'POST',
                        data: $(this).serialize(),
                        dataType: 'html',
                        success: function(data) {
                            $('#resultado2').html(data);
 
                            if(data === 'Success!'){
                                window.location = 'index.jsp';
                            }
                        }
                    });
                });
 
            });