<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="/ssm/js/jquery-3.2.1.min.js"></script>
</head>
<body>

     <script>
         var user = {'loginAct':admin,'name':'徐非凡','loginPwd':'123456'}

         var userJosn = JSON.stringify(user);
        /* alert(typeof cityJson)
         alert(cityJson);*/
        $.ajax({
             url : '/ssm/jsonToObject02',
             data : userJosn,
             type : 'post',
             contentType : "application/json",//以json串的形式传到后台
             dataType : 'json',
             success : function (data) {
                 for(var i = 0 ; i < data.length; i++){
                     $('#province').append("<option>"+data[i].pid+"</option>");
                 }
             }
         });
     </script>
</body>
</html>
