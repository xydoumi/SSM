var postData = function () {
    var goodsList = [
        {
            "name": "香烟",
            "value": 200
        },
        {
            "name": "茶叶",
            "value": 100
        }
    ];
    $.ajax({
            "url": "./goods",
            "type": "POST",
            "dataType": "json",
            "contentType": "application/json; charset=UTF-8",
            "data": JSON.stringify(goodsList),
            success: function (data) {
                alert(data.message);
            }
        }
    );
}

var bindInput = function(){
    var $input = document.getElementsByTagName('input')[0];
    $input.onclick = postData;
}

bindInput();
