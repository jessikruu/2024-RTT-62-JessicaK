<jsp:include page="include/header.jsp"/>


<h1>This is my first JSP page</h1>
<a href="/another-page">2nd page</a>

<h2>${message}</h2>


<table class="table">
    <tr>
        <td>
            id
        </td>
        <td>${productKey.id}</td>
    </tr>
    <tr>
        <td>Code</td>
        <td>${productKey.productCode}</td>
    </tr>
    <tr>
        <td>name</td>
        <td>${productKey.productName}</td>
    </tr>
    <tr>
        <td>description</td>
        <td>${productKey.productDescription}</td>
    </tr>


</table>


<jsp:include page="include/footer.jsp"/>


