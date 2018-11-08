$(document).ready(function(){
    var loading = $('<div id="loading" class="loading"></div>'
       +'<img id="loading_img" alt="loading"'
       +'src="/resources/images/loading-page.gif" />').appendTo(document.body).hide();

    $(window).ajaxStart(function(){
        loading.show();
    }).ajaxStop(function(){
        loading.hide();
    });
});