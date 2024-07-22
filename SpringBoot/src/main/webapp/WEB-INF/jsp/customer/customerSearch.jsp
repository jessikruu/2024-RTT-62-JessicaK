<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"/>

<!-- page header -->
<%--<section style="background-color: rosybrown">--%>
<%--    <div class="container">--%>
<%--        <div class="row pt-5 pb-5">--%>

<h1 class="text-center">Customer Search Page</h1>

<%--        </div>--%>
<%--    </div>--%>
<%--</section>--%>

<!-- a search form -->


<section>

    <div class="container">

        <div class="row justify-content-center pt-5 pb-3">

            <div class="col-8 text-center">

                <form action="/customer/search">

                    <div class="mb-3">

                        <label for="search" class="form-label"><h4>Search Below</h4></label>
                        <input type="text" value="${search}" class="form-control" id="search" name="search"
                               placeholder="Enter search term"/>


                    </div>
                    <button type="submit" class="btn btn-primary custom-primary custom-primary:hover">&#128269; Search
                    </button>

                </form>
            </div>
        </div>
    </div>
</section>


<section>

    <div class="container">
        <div class="row pt-5">
            <div class="col-12">

                <h2 class="text-center">Customers Found: (${customers.size()})</h2>

            </div>


        </div>
        <div class="row justify-content-center">
            <div class="col-auto">
                <table class="table table-responsive">
                    <tr>
                        <th>Customer ID</th>
                        <th>Customer Name</th>
                        <th>Contact Name</th>


                    </tr>

                    <c:forEach items="${customers}" var="customer">

                        <tr onclick="window.location.href = '/customer/info?id=${customer.id}'" class="clickable-row">
                            <td>${customer.id}</td>
                            <td>${customer.customerName}</td>
                            <td>${customer.contactFirstName} ${customer.contactLastName}</td>

                        </tr>
                    </c:forEach>

                </table>
            </div>


        </div>

    </div>


</section>
<jsp:include page="../include/footer.jsp"/>