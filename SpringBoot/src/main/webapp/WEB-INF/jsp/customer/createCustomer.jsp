<jsp:include page="../include/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- page header -->
<c:if test="${empty form.customerId}">
<h1 class="text-center">Create Customer</h1>
</c:if>
<c:if test="${not empty form.customerId}">
    <h1 class="text-center">Edit Customer</h1>
</c:if>

<body class="bottom-of-page">


<section>

    <div class="container">
        <div class="row pt-5">

            <div class="col-12">

                <form class="form-container row g-3" action="/customer/createSubmit">

                    <input type="hidden" name="customerId" value="${form.customerId}">


                    <!-- customerName input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="customerNameID" class="col-form-label">Customer Name:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="customerNameID" name="customerName" class="form-control <c:if test="${bindingResult.hasFieldErrors('customerName')}">is-invalid</c:if>"
                                   value="${form.customerName}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('customerName')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('customerName')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>



                    <!-- contactLastName input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="contactFirstNameID" class="col-form-label">Contact First Name:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="contactFirstNameID" name="contactFirstName" class="form-control <c:if test="${bindingResult.hasFieldErrors('contactFirstName')}">is-invalid</c:if>"
                                   value="${form.contactFirstName}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('contactFirstName')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('contactFirstName')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <!-- contactLastName input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="contactLastNameID" class="col-form-label">Contact Last Name:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="contactLastNameID" name="contactLastName" class="form-control <c:if test="${bindingResult.hasFieldErrors('contactLastName')}">is-invalid</c:if>"
                                   value="${form.contactLastName}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('contactLastName')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('contactLastName')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <!-- phone input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="phoneID" class="col-form-label">Phone Number:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="phoneID" name="phone" class="form-control <c:if test="${bindingResult.hasFieldErrors('phone')}">is-invalid</c:if>"
                                   value="${form.phone}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('phone')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('phone')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <!-- address1 input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="address1ID" class="col-form-label">Address Line 1:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="address1ID" name="address1" class="form-control <c:if test="${bindingResult.hasFieldErrors('address1')}">is-invalid</c:if>"
                                   value="${form.address1}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('address1')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('address1')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>


                    <!-- address2 input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="address2ID" class="col-form-label">Address Line 2:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="address2ID" name="address2" class="form-control <c:if test="${bindingResult.hasFieldErrors('address2')}">is-invalid</c:if>"
                                   value="${form.address2}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('address2')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('address2')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <!-- city input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="cityID" class="col-form-label">City:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="cityID" name="city" class="form-control <c:if test="${bindingResult.hasFieldErrors('city')}">is-invalid</c:if>"
                                   value="${form.city}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('city')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('city')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <!-- state input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="stateID" class="col-form-label">State:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="stateID" name="state" class="form-control <c:if test="${bindingResult.hasFieldErrors('state')}">is-invalid</c:if>"
                                   value="${form.state}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('state')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('state')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <!-- zipCode input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="zipCodeID" class="col-form-label">Zip Code:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="zipCodeID" name="zipCode" class="form-control <c:if test="${bindingResult.hasFieldErrors('zipCode')}">is-invalid</c:if>"
                                   value="${form.zipCode}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('zipCode')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('zipCode')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <!-- country input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="countryID" class="col-form-label">Country:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="countryID" name="country" class="form-control <c:if test="${bindingResult.hasFieldErrors('country')}">is-invalid</c:if>"
                                   value="${form.country}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('country')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('country')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <!-- creditLimit input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="creditLimitID" class="col-form-label">Credit Limit:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="creditLimitID" name="creditLimit" class="form-control <c:if test="${bindingResult.hasFieldErrors('creditLimit')}">is-invalid</c:if>"
                                   value="${form.creditLimit}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('creditLimit')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('creditLimit')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

<%--                    employee dropdown--%>


                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2 p-2">
                            <label for="salesRepEmployeeIDID" class="col-form-label">Sales Rep:</label>
                        </div>
                        <div class="col-4">
                            <select id="salesRepEmployeeIDID" name="salesRepEmployeeID" class="form-control">
                                <c:forEach items="${reportsToEmployees}" var="employee">
                                    <option
                                            value="${employee.id}"
                                            <c:if test="${employee.id eq form.salesRepEmployeeID}">selected</c:if>
                                    >
                                            ${employee.firstName} ${employee.lastName}</option>
                                </c:forEach>
                            </select>

                        </div>
                    </div>





                    <div class="row justify-content-center">

                        <div class="col-auto">

                            <button type="submit" class="btn btn-primary">Submit</button>

                        </div>

                    </div>

                </form>

            </div>
        </div>


    </div>
</section>

</body>

<jsp:include page="../include/footer.jsp"/>