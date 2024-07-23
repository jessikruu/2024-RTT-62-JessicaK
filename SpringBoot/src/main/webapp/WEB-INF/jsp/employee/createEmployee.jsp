<jsp:include page="../include/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- page header -->
<c:if test="${empty form.employeeId}">
    <h1 class="text-center">Create Employee</h1>
</c:if>
<c:if test="${not empty form.employeeId}">
    <h1 class="text-center">Edit Employee</h1>
</c:if>




<div>
    <c:if test="${not empty errorMessage}">
        <section>
            <div class="text-danger alert alert-danger" style="text-align: center">
                    ${errorMessage}
            </div>
        </section>
    </c:if>

    <div class="container">
        <div class="row pt-5">

            <div class="col-12">
<%--                method="post"--%>

                <form class="form-container row g-3" action="/employee/createSubmit" >

                    <input type="hidden" name="employeeId" value="${form.employeeId}">


                    <%--                    <form class="row gy-2 gx-3 align-items-center">--%>
                    <%--                        <div class="col-auto">--%>
                    <%--                            <label class="visually-hidden" for="firstNameID">Name</label>--%>
                    <%--                            <input type="text" id="firstNameID" name="firstName" placeholder="First Name"--%>
                    <%--                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('email')}">is-invalid</c:if>"--%>
                    <%--                                   value="${form.firstName}" required>--%>
                    <%--                            <c:if test="${bindingResult.hasFieldErrors('firstName')}">--%>
                    <%--                                <div class="text-danger">--%>
                    <%--                                    <c:forEach items="${bindingResult.getFieldErrors('firstName')}" var="error">--%>
                    <%--                                        ${error.defaultMessage}<br>--%>
                    <%--                                    </c:forEach>--%>
                    <%--                                </div>--%>
                    <%--                            </c:if>--%>

                    <%--                        </div>--%>
                    <%--&lt;%&ndash;                        <div class="col-auto">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                            <label class="visually-hidden" for="autoSizingInputGroup">Username</label>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                            <div class="input-group">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                                <div class="input-group-text">@</div>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                                <input type="text" class="form-control" id="autoSizingInputGroup" placeholder="Username">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                                &ndash;%&gt;--%>
                    <%--&lt;%&ndash;                            </div>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                        </div>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                        <div class="col-auto">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                            <label class="visually-hidden" for="autoSizingSelect">Preference</label>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                            <select class="form-select" id="autoSizingSelect">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                                <option selected>Choose...</option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                                <option value="1">One</option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                                <option value="2">Two</option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                                <option value="3">Three</option>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                            </select>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                        </div>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                        <div class="col-auto">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                            <div class="form-check">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                                <input class="form-check-input" type="checkbox" id="autoSizingCheck">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                                <label class="form-check-label" for="autoSizingCheck">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                                    Remember me&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                                </label>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                            </div>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                        </div>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                        <div class="col-auto">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                            <button type="submit" class="btn btn-primary">Submit</button>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;                        </div>&ndash;%&gt;--%>
                    <%--                    </form>--%>


                    <input type="hidden" name="employeeId" value="${form.employeeId}">


                    <!-- email input -->
                    <div class="col-auto row mb-3 m-1">
                        <label class="visually-hidden" for="firstNameID">Name</label>
                        <div class="col-sm-12">
                            <input type="text" id="firstNameID" name="firstName" placeholder="First Name"
                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('firstName')}">is-invalid</c:if>"
                                   value="${form.firstName}">
                            <c:if test="${bindingResult.hasFieldErrors('firstName')}">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('firstName')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </c:if>
                        </div>

                    </div>

                    <%--                    <div class="row align-items-center justify-content-center">--%>

                    <%--                        <div class="col-2 p-2">--%>
                    <%--                            <label for="firstNameID" class="col-form-label">First Name:</label>--%>
                    <%--                        </div>--%>
                    <%--                        <div class="col-4">--%>
                    <%--                            <input type="text" id="firstNameID" name="firstName"--%>
                    <%--                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('email')}">is-invalid</c:if>"--%>
                    <%--                                   value="${form.firstName}">--%>
                    <%--                        </div>--%>
                    <%--                    </div>--%>
                    <%--                    <c:if test="${bindingResult.hasFieldErrors('firstName')}">--%>
                    <%--                        <div class="row align-items-center justify-content-center">--%>
                    <%--                            <div class="offset-2 col-4">--%>
                    <%--                                <div class="text-danger">--%>
                    <%--                                    <c:forEach items="${bindingResult.getFieldErrors('firstName')}" var="error">--%>
                    <%--                                        ${error.defaultMessage}<br>--%>
                    <%--                                    </c:forEach>--%>
                    <%--                                </div>--%>
                    <%--                            </div>--%>
                    <%--                        </div>--%>
                    <%--                    </c:if>--%>


                    <!-- lastName input -->


                    <div class="col-auto row mb-3 m-1">
                        <label class="visually-hidden" for="lastNameID">Last Name</label>
                        <div class="col-sm-12">
                            <input type="text" id="lastNameID" name="lastName" placeholder="Last Name"
                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('lastName')}">is-invalid</c:if>"
                                   value="${form.lastName}">
                            <c:if test="${bindingResult.hasFieldErrors('lastName')}">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('firstName')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </c:if>
                        </div>

                    </div>

                    <%--                    <div class="row align-items-center justify-content-center">--%>

                    <%--                        <div class="col-2 p-2">--%>
                    <%--                            <label for="lastNameID" class="col-form-label">Last Name:</label>--%>
                    <%--                        </div>--%>
                    <%--                        <div class="col-4">--%>
                    <%--                            <input type="text" id="lastNameID" name="lastName"--%>
                    <%--                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('email')}">is-invalid</c:if>"--%>
                    <%--                                   value="${form.lastName}">--%>
                    <%--                        </div>--%>
                    <%--                    </div>--%>
                    <%--                    <c:if test="${bindingResult.hasFieldErrors('lastName')}">--%>
                    <%--                        <div class="row align-items-center justify-content-center">--%>
                    <%--                            <div class="offset-2 col-4">--%>
                    <%--                                <div class="text-danger">--%>
                    <%--                                    <c:forEach items="${bindingResult.getFieldErrors('lastName')}" var="error">--%>
                    <%--                                        ${error.defaultMessage}<br>--%>
                    <%--                                    </c:forEach>--%>
                    <%--                                </div>--%>
                    <%--                            </div>--%>
                    <%--                        </div>--%>
                    <%--                    </c:if>--%>


                    <%--                    extension 2 input--%>

                    <div class="col-auto row mb-3 m-1">
                        <label class="visually-hidden" for="extension">Extension</label>
                        <div class="col-sm-12">

                            <input type="text" id="extension" name="extension" placeholder="Ext:"
                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('extension')}">is-invalid</c:if>"
                                   value="${form.extension}">
                            <c:if test="${bindingResult.hasFieldErrors('extension')}">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('extension')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </c:if>
                        </div>

                    </div>


                    <!-- email input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="emailID" class="col-form-label">Email:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="emailID" name="email"
                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('email')}">is-invalid</c:if>"
                                   value="${form.email}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('email')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('email')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <!-- extension input -->

                    <%--                    <div class="row align-items-center justify-content-center">--%>

                    <%--                        <div class="col-2 p-2">--%>
                    <%--                            <label for="extensionID" class="col-form-label">Extension:</label>--%>
                    <%--                        </div>--%>
                    <%--                        <div class="col-4">--%>
                    <%--                            <input type="text" id="extensionID" name="extension"--%>
                    <%--                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('extension')}">is-invalid</c:if>"--%>
                    <%--                                   value="${form.extension}">--%>
                    <%--                        </div>--%>
                    <%--                    </div>--%>
                    <%--                    <c:if test="${bindingResult.hasFieldErrors('extension')}">--%>
                    <%--                        <div class="row align-items-center justify-content-center">--%>
                    <%--                            <div class="offset-2 col-4">--%>
                    <%--                                <div class="text-danger">--%>
                    <%--                                    <c:forEach items="${bindingResult.getFieldErrors('extension')}" var="error">--%>
                    <%--                                        ${error.defaultMessage}<br>--%>
                    <%--                                    </c:forEach>--%>
                    <%--                                </div>--%>
                    <%--                            </div>--%>
                    <%--                        </div>--%>
                    <%--                    </c:if>--%>

                    <!-- jobTitle input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="jobTitleID" class="col-form-label">Job Title:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="jobTitleID" name="jobTitle"
                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('jobTitle')}">is-invalid</c:if>"
                                   value="${form.jobTitle}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('jobTitle')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('jobTitle')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>


                    <!-- vacationHours input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="vacationHoursID" class="col-form-label">Vacation Hours:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="vacationHoursID" name="vacationHours"
                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('vacationHours')}">is-invalid</c:if>"
                                   value="${form.vacationHours}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('vacationHours')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('vacationHours')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <!-- profileImageURL input -->

                    <div class="row align-items-center justify-content-center">

                        <div class="col-2 p-2">
                            <label for="profileImageURLID" class="col-form-label">Profile Image URL:</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="profileImageURLID" name="profileImageURL"
                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('profileImageURL')}">is-invalid</c:if>"
                                   value="${form.profileImageURL}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('profileImageURL')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('profileImageURL')}"
                                               var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>


                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2 p-2">
                            <label for="reportsTo" class="col-form-label">Reports To:</label>
                        </div>
                        <div class="col-4">
                            <select id="reportsTo" name="reportsTo" class="form-control">
                                <option disabled selected value="">Select Employee&#129485;</option>
                                <c:forEach items="${reportsToEmployees}" var="employee">
                                    <option
                                            value="${employee.id}"
                                            <c:if test="${employee.id eq form.reportsTo}">selected</c:if>
                                    >
                                            ${employee.firstName} ${employee.lastName}</option>
                                </c:forEach>
                            </select>

                        </div>
                    </div>


                    <div class="row align-items-center justify-content-center pb-3">

                        <div class="col-2 p-2">
                            <label for="officeId" class="col-form-label">Reporting Office:</label>
                        </div>
                        <div class="col-4">
                            <select id="officeId" name="officeId" class="form-control">
                                <option disabled selected value>Select Office &#127970;</option>
                                <%--                                name is pointing to the bean variable--%>
                                <c:forEach items="${reportingToOffice}" var="office">
                                    <option value="${office.id}"
                                            <c:if test="${office.id eq form.officeId}">selected</c:if>
                                    >
                                            ${office.city}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>


                    <div class="row justify-content-center">

                        <div class="col-auto">

                            <button type="submit" class="btn btn-primary  custom-primary custom-primary:hover">&#9998;
                                Submit
                            </button>

                        </div>

                    </div>

                </form>

            </div>
        </div>


    </div>
</div>
</section>


<jsp:include page="../include/footer.jsp"/>