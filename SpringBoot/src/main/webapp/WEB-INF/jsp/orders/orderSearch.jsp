<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"/>

<!-- page header -->
<%--<section style="background-color: rosybrown">--%>
<%--    <div class="container">--%>
<%--        <div class="row pt-5 pb-5">--%>

<h1 class="text-center">Order Search Page</h1>

<%--        </div>--%>
<%--    </div>--%>
<%--</section>--%>

<!-- a search form -->

<section class="tableBackground" style="margin-top: -10px">

    <div class="container">

        <div class="row justify-content-center pt-5 pb-3">

            <div class="col-8 text-center">

                <form action="/orders/search">

                    <div class="mb-3">

                        <label for="search" class="form-label"><h4>Search Below</h4></label>
                        <input type="text" value="${search}" class="form-control" id="search" name="search"
                               placeholder="Enter search term"/>


                    </div>
                    <button type="submit" class="btn btn-primary">Search</button>

                </form>
            </div>
        </div>
    </div>
</section>


<section>

    <div class="container">
        <div class="row pt-5">
            <div class="col-12">

                <h2 class="text-center">Orders Found: (${orders.size()})</h2>

            </div>


        </div>
        <div class="row justify-content-center">
            <div class="col-auto">
                <table class="table table-responsive">
                    <tr>
                        <th>Order ID</th>
                        <th>Customer ID</th>
                        <th>Status</th>


                    </tr>

                    <c:forEach items="${orders}" var="order">

                        <tr onclick="window.location.href = '/order/info?id=${order.id}'" class="clickable-row">
                            <td>${order.id}</td>
                            <td>${order.customerID}</td>
                            <td>${order.status}</td>


                        </tr>
                    </c:forEach>

                </table>
            </div>


        </div>

    </div>


</section>

<jsp:include page="../include/footer.jsp"/>