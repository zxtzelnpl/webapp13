console.log("user_one");

(function ($) {
    var box = $("#ajax1");
    var url = box.find(".url").html();
    var method = box.find(".method").html();
    box.find("button").click(function () {
        fetch(url)
            .then(function (res) {
                return res.json()
            })
            .then(function (json) {
                console.log(json)
            })
    })
}(jQuery));

(function ($) {
    var box = $("#ajax2");
    var url = box.find(".url").html();
    var method = box.find(".method").html();
    box.find("button").click(function () {
        fetch(url)
            .then(function (res) {
                return res.json()
            })
            .then(function (json) {
                console.log(json)
            })
    })
}(jQuery));

(function ($) {
    var box = $("#ajax3");
    var url = box.find(".url").html();
    var method = box.find(".method").html();
    var contentType = box.find(".content-type").html();
    box.find("button").click(function () {
        fetch(url,{
            method:method,
            headers: {
                'content-type': contentType
            },
            body: 'name=ajax3&pwd=ajax3'
        })
            .then(function (res) {
                return res.json()
            })
            .then(function (json) {
                console.log(json)
            })
    })
}(jQuery));

(function ($) {
    var box = $("#ajax4");
    var url = box.find(".url").html();
    var method = box.find(".method").html();
    var contentType = box.find(".content-type").html();
    var data = {
        userName: 'ajax4',
        userPassword:'ajax4'
    };
    box.find("button").click(function () {
        fetch(url,{
            method:method,
            headers: {
                'content-type': contentType
            },
            body: JSON.stringify(data)
        })
            .then(function (res) {
                return res.json()
            })
            .then(function (json) {
                console.log(json)
            })
    })
}(jQuery));

$("#submit_get").click(function(){
    $("#form_get").submit();
});

$("#submit_post").click(function(){
    $("#form_post").submit();
});