<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>


<s:form>
    <s:select label="Hotel" list="hotels" listValue="name" listKey="id" name="hotel"/>
    <s:textfield label= "Reservation comment" key="comment" />
    <s:submit key="Save" method="handle" />
</s:form>
