<jsp:include page="../include/header.jsp"/>
<link rel="stylesheet" href="/pub/css/global.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<h1>Order Info</h1>


<div class="container">
    <div class="row justify-content-center">

        <div class="col-auto">
            <table class="table table-responsive" style="width: 750pt">
                <tr>
                    <td style="font-weight: bolder;">Order ID:</td>
                    <td>${orderKey.id}</td>
                </tr>
                <tr>
                    <td style="font-weight: bolder;">Customer ID:</td>
                    <td>${orderKey.customerID}</td>
                </tr>
                <tr>
                    <td style="font-weight: bolder;">Order Date:</td>
                    <td>${orderKey.orderDate}</td>
                </tr>
                <tr>
                    <td style="font-weight: bolder;">Required Date:</td>
                    <td>${orderKey.requiredDate}</td>
                </tr>
                <tr>
                    <td style="font-weight: bolder;">Shipped Date:</td>
                    <td>${orderKey.shippedDate}</td>
                </tr>
                <tr>
                    <td style="font-weight: bolder;">Status:</td>
                    <td>${orderKey.status}</td>
                </tr>
                <tr>
                    <td style="font-weight: bolder;">Comments:</td>
                    <td>${orderKey.comments}</td>
                </tr>


            </table>
        </div>
    </div>
</div>


<div class="container">

    <p>
        <a class="btn btn-primary custom-primary custom-primary:hover" data-bs-toggle="collapse" href="#collapseExample"
           role="button" aria-expanded="false"
           aria-controls="collapseExample">
            Order Details
        </a>
    </p>
    <div class="collapse" id="collapseExample">
        <div class="card card-body body">

            <div class="row pt-5">
                <div class="col-12">
                    <h2 class="text-center">Order History</h2>
                </div>
            </div>
            <div class="row pt-3 justify-content-center">
                <div class="col-4">
                    <table class="table">
                        <tr>
                            <th>Product ID:</th>
                            <th>Product Name:</th>
                            <th>Quantity Ordered:</th>
                            <th>Price Each:</th>
                            <th>Line Item Total:</th>

                        </tr>
                        <c:forEach items="${orders}" var="order">
                            <tr onclick="window.location.href = '/orders/info?id=${order.id}'"
                                class="clickable-row">
                                <td>${orderdetails.quantityOrdered}</td>
                                <td>${order.status}</td>
                                <td>${order.status}</td>
                                <td>${order.status}</td>
                                <td>${order.status}</td>

                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../include/footer.jsp"/>