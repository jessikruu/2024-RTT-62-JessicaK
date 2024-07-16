<jsp:include page="../include/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- page header -->

<h1 class="text-center">Create Employee</h1>

<body class="bottom-of-page">
<section>

    <div class="container">
        <div class="row pt-5 justify-content-center">

            <div class="col-12">

                <form class="form-container" action="/employee/createSubmit">

                    <div class="row g-3 align-items-center justify-content-center pb-3">

                        <div class="col-1">
                            <label for="firstNameID" class="col-form-label">First Name</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="firstNameID" name="firstName" aria-describedby="form-control">
                        </div>
                    </div>


                    <div class="row g-3 align-items-center justify-content-center pb-3">

                        <div class="col-1">
                            <label for="lastNameID" class="col-form-label">Last Name</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="lastNameID" name="lastName" aria-describedby="form-control">
                        </div>
                    </div>

                    <div class="row g-3 align-items-center justify-content-center pb-3">

                        <div class="col-1">
                            <label for="emailID" class="col-form-label">Email</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="emailID" name="email" aria-describedby="form-control">
                        </div>
                    </div>

                    <div class="row g-3 align-items-center justify-content-center pb-3">

                        <div class="col-1">
                            <label for="extension" class="col-form-label">Extension</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="extension" name="extension" aria-describedby="form-control">
                        </div>
                    </div>


                    <div class="row g-3 align-items-center justify-content-center pb-3">

                        <div class="col-1">
                            <label for="jobTitle" class="col-form-label">Job Title</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="jobTitle" name="jobTitle" aria-describedby="form-control">
                        </div>
                    </div>


                    <div class="row g-3 align-items-center justify-content-center pb-3">

                        <div class="col-1">
                            <label for="vacationHours" class="col-form-label">Vacation Hours</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="vacationHours" name="vacationHours" aria-describedby="form-control">
                        </div>
                    </div>


                    <div class="row g-3 align-items-center justify-content-center pb-3">

                        <div class="col-1">
                            <label for="profileImageURL" class="col-form-label">Profile Image URL</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="profileImageURL" name="profileImageURL" aria-describedby="form-control">
                        </div>
                    </div>


                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="reportsTo" class="col-form-label">Reports To:</label>
                        </div>
                        <div class="col-4">
                            <select id="reportsTo" name="reportsTo" class="form-control">
                                <c:forEach items="${reportsToEmployees}" var="employee">
                                    <option value="${employee.id}">${employee.firstName} ${employee.lastName}</option>
                                </c:forEach>
                            </select>

                        </div>
                    </div>


                    <div class="row align-items-center justify-content-center pb-3">

                        <div class="col-2">
                            <label for="officeId" class="col-form-label">Reporting Office:</label>
                        </div>
                        <div class="col-4">
                            <select id="officeId" name="officeId" class="form-control">
<%--                                name is pointing to the bean variable--%>
                                <c:forEach items="${reportingToOffice}" var="office">
                                    <option value="${office.id}">${office.city}</option>
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