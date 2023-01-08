$(document).ready(function() {
    $("#slider").bxSlider({
        auto: true,
        pause: 3000,
        maxSlides: 1,
        slideWidth: 500,
        slideMargin: 20,
        randomStart: true,
        moveSlides: 1,
        captions: true,
        pagerType: 'short',
        pagerCustom: '#id_pager'
    });
});