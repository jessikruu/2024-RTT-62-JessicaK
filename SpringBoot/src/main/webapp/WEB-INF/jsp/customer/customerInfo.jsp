<jsp:include page="../include/header.jsp"/>
<link rel="stylesheet" href="/pub/css/global.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<h1>Customer Info</h1>

<body class="bottom-of-page">

<div class="tableBackground">
    <p>${customerKey.customerName} </p>
    <div class="container">
        <div class="row justify-content-center">

            <div class="col-auto">
                <table class="table table-responsive" style="width: 750pt">
                    <tr>
                        <td style="font-weight: bolder;">Customer ID:</td>
                        <td>${customerKey.id}</td>
                    </tr>
                    <tr>
                        <td style="font-weight: bolder;">Sales Rep:</td>
                        <td>${customerKey.employee.firstName} ${customerKey.employee.lastName}</td>
                    </tr>
                    <tr>
                        <td style="font-weight: bolder;">Customer Name:</td>
                        <td>${customerKey.customerName}</td>
                    </tr>
                    <tr>
                        <td style="font-weight: bolder;">Contact Name:</td>
                        <td>${customerKey.contactFirstName} ${customerKey.contactLastName}</td>
                    </tr>
                    <tr>
                        <td style="font-weight: bolder;">Phone Number:</td>
                        <td>${customerKey.phone}</td>
                    </tr>
                    <tr>
                        <td style="font-weight: bolder;">Address:</td>
                        <td>${customerKey.address1} <br> ${customerKey.address2} <br>
                            ${customerKey.city}, ${customerKey.state} ${customerKey.zipCode}<br>
                            ${customerKey.country}</td>
                    </tr>
                    <tr>
                        <td style="font-weight: bolder;">Credit Limit:</td>
                        <td>$${customerKey.creditLimit}</td>
                    </tr>
                    <tr>
                        <td style="font-weight: bolder;">Orders:</td>
                        <td onclick="window.location.href = '/orders/search?search=${customerKey.id}'"
                            class="clickable-row">Orders
                        </td>
                    </tr>


                </table>
            </div>
        </div>

    </div>

</div>

<div class="container">

    <p>
        <a class="btn btn-primary custom-primary custom-primary:hover" data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false"
           aria-controls="collapseExample">
            Orders Found (${orders.size()})
        </a>
    </p>
    <div class="collapse" id="collapseExample">
        <div class="card card-body">

            <div class="row pt-5">
                <div class="col-12">
                    <h2 class="text-center">Order History</h2>
                </div>
            </div>
            <div class="row pt-3 justify-content-center">
                <div class="col-4">
                    <table class="table">
                        <tr>
                            <th>Order ID:</th>
                            <th>Status:</th>

                        </tr>
                        <c:forEach items="${orders}" var="order">
                            <tr onclick="window.location.href = '/orders/info?id=${order.id}'"
                                class="clickable-row">
                                <td>${order.id}</td>
                                <td>${order.status}</td>

                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<jsp:include page="../include/footer.jsp"/>