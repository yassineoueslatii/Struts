<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:url namespace="/" action="produits" var="lien1"></s:url>
<s:a  href="%{lien1}">Produits</s:a>
</body>
</html>