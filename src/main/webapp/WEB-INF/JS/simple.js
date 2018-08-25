$(function () {

    window.alert("Hello");

    let widoczek = $("#widoczek");
    widoczek.append("<div>Hello");


    showParent();

});


function showParent() {

    $.ajax({

        url: "http://localhost:8080/parent",
        data: {} ,
        type: "GET" ,
        dataType: "json",
        success: displayParent
        });

    function displayParent(parentOfBase) {

        var parent = $("#parent");
        parent.empty();


        var elemParent = $("<p>");
        elemParent.append(parentOfBase.id);
        elemParent.append(parentOfBase.name);
        //elemParent.append(parentOfBase.age);


        parent.append(elemParent);

    }

}