<%@tag description="Displays a dataset as a set of layers in the menu. The dataset must be hosted on this server." pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/WEB-INF/taglib/wms/MenuMaker" prefix="menu"%>
<%@attribute name="dataset" required="true" type="uk.ac.rdg.resc.ncwms.wms.Dataset" description="The dataset object to display"%>
<%@attribute name="label" description="Optional: can be used to override the title of the dataset"%>

<c:set var="title" value="${dataset.title}"/>
<c:if test="${not empty label}">
    <c:set var="title" value="${label}"/>
</c:if>
<c:if test="${empty dataset}">
    <menu:folder label="Dataset does not exist" plottable="${false}"/>
</c:if>
<c:if test="${dataset.ready}">
    <menu:folder label="${title}" plottable="${false}">
        <c:forEach items="${dataset.featureCollection.features}" var="feature">
            <menu:rangemetadata metadata="${feature.coverage.rangeMetadata}" dataset="${dataset}" featureId="${feature.id}"/>
        </c:forEach>
    </menu:folder>
</c:if>
<c:if test="${dataset.loading}">
    <menu:folder label="${title} (loading)" plottable="${false}"/>
</c:if>
<c:if test="${dataset.error}">
    <menu:folder label="${title} (error)" plottable="${false}"/>
</c:if>