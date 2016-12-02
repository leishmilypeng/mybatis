<%--
  Created by IntelliJ IDEA.
  User: CPR161
  Date: 2016-12-02
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <title>首页</title>
</head>
<script src="${ctx}/resources/jquery/jquery-1.7.2.min.js" type="text/javascript"></script>
<body>
    <input type="button" id="ajaxTest" value="ajax请求">

</body>

<script type="text/javascript" >

    $(document).off("click", '#ajaxTest');
    $(document).on("click", '#ajaxTest', function(){
        $.ajax({
            type: 'post',
            url: '${ctx}/login/getLoginInfo.do',
            dataType: 'json',
            data: {
                userName: "leipeng"
            },
            success:function(result){
                Window.openDialog("success");
            }
        })
    })

</script>
</html>
