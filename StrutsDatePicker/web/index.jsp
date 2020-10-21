<%@ taglib prefix="s" uri="/struts-tags" %>  
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>  
<html>  
<head>  
<sx:head/>  
</head>  
<body>   
<s:form action="DateTimePicker" method="POST">  
<sx:datetimepicker name="todayDate" label="Format (yyyy-mm-dd)" displayFormat="yyyy-MM-dd"/>  
<sx:datetimepicker name="todayDate2" label="Format (dd-mm-yyyy)" displayFormat="dd-MMM-yyyy"/>  
<s:submit></s:submit>  
</s:form>  
</body>  
</html>  