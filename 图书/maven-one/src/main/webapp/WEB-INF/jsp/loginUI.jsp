<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="/resources/inc/inc.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
  $(document).click(function(){
	  $("#login").click(function(){
		  $.ajax({
			  url:"/login",
			  type:"POST",
			  dataType:"",
			  data:$("#myForm").serialize,
			  success:function(data){
				  if(data=1){
					  layer.alert("恭喜登录");
				  }else{
					  layer.alert("登录失败");
				  }
			  },
			  error:function(){
				  layer.alert("登录失败");
			  }
		  })
	  })
	  
  })
</script>
<title>Insert title here</title>
</head>
<body>
     <form class="form-horizontal" role="form"  id="myForm" action="login">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">登录用户</label>
    <div class="col-sm-5">
      <input type="text" class="form-control" id="inputEmail3" name="username">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
    <div class="col-sm-5">
      <input type="password" class="form-control" id="inputPassword3" name="password">
    </div>
  </div>
 
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="button" class="btn btn-default" id="login">登录</button>
      <button type="reset" class="btn btn-default">重置</button>
     
    </div>
    
    
      ${message};
     <button type="button" class="btn btn-default">注册</button>
  </div>
</form> 
</body>
</html>