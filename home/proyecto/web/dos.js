$(document).ready(function(){
$("#login").click(function(){
var email = $("#email").val();
var password = $("#password").val();
// Checking for blank fields.
if( email =='' || password ==''){
$('input[type="text"],input[type="password"]').css("border","2px solid red");
$('input[type="text"],input[type="password"]').css("box-shadow","0 0 3px red");
alert("Please fill all fields...!!!!!!");
}else {
$.post("login.jsp",{ email1: email, password1:password},
function(data) {
if(data=='login invalido') {
$('input[type="text"]').css({"border":"2px solid red","box-shadow":"0 0 3px red"});
$('input[type="password"]').css({"border":"2px solid #00F5FF","box-shadow":"0 0 5px #00F5FF"});
alert(data);
}else if(data=='felicidades'){
$('input[type="text"],input[type="password"]').css({"border":"2px solid red","box-shadow":"0 0 3px red"});
alert(data);
} else if(data=='Successfully'){
$("form")[0].reset();
$('input[type="text"],input[type="password"]').css({"border":"2px solid #00F5FF","box-shadow":"0 0 5px #00F5FF"});
alert(data);
} else{
alert(data);
}
});
}
});
});