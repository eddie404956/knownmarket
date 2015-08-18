<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="addform" action="addmerchandise" enctype="multipart/form-data" method="post">
	name<input name="name" type="text"/>
	description<input name="description" type="text"/>
	isFriend<select name="isFriend" >
		<option label="yes" value="true"/>
		<option label="no" value="false"/>
	</select>
	price:<input name="price" type="text"/>
	price abidance:<input name="priceabidance" type="text"/>
	
	coupon code<input name="coupon" type="text"/>
	coupon deadline<input name="coupondeadline" type="text"/>
	coupon limit<input name="couponlimit" type="text"/>
	
	
	product<input name="product" type="file"/>
	product activecode<input name="activecode" type="text"/>
	
	<input value="submit" type="submit"/>
</form>

result:${merchandise }
</body>
</html>