<jsp:include page="../include/header.jsp"/>
<link rel="stylesheet" href="/pub/css/global.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<h1>Employee Info</h1>

<section>
    <div class="tableBackground">
        <p>${employeeKey.firstName} ${employeeKey.lastName}</p>
        <div class="container">
            <div class="row justify-content-center">

                <div class="col-auto">
                    <table class="table table-responsive" style="width: 750pt">
                        <tr>
                            <td style="font-weight: bolder;">Employee ID:</td>
                            <td>${employeeKey.id}</td>
                        </tr>
                        <tr>
                            <td style="font-weight: bolder;">Office ID:</td>
                            <td>${employeeKey.officeId}</td>
                        </tr>
                        <tr>
                            <td style="font-weight: bolder;">Full Name:</td>
                            <td>${employeeKey.firstName} ${employeeKey.lastName}</td>
                        </tr>
                        <tr>
                            <td style="font-weight: bolder;">Extension:</td>
                            <td>${employeeKey.extension}</td>
                        </tr>
                        <tr>
                            <td style="font-weight: bolder;">Email:</td>
                            <td>${employeeKey.email}</td>
                        </tr>
                        <tr>
                            <td style="font-weight: bolder;">Job Title:</td>
                            <td>${employeeKey.jobTitle}</td>
                        </tr>
                        <tr>
                            <td style="font-weight: bolder;">Vacation Hrs:</td>
                            <td>${employeeKey.vacationHours}</td>
                        </tr>


                    </table>


                </div>
            </div>
        </div>

    </div>
</section>

<section>
    <div class="container">

        <p>
            <a class="btn btn-primary" data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
                Customers Found (${customers.size()})
            </a>
        </p>
        <div class="collapse" id="collapseExample">
            <div class="card card-body">

        <div class="row pt-5">
            <div class="col-12">
                <h2 class="text-center">Active Customers</h2>
            </div>
        </div>
        <div class="row pt-3 justify-content-center">
            <div class="col-8">
                <table class="table">
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>Contact Name</th>
                        <th>state</th>
                        <th>postal</th>
                        <th>country</th>
                    </tr>
                    <c:forEach items="${customers}" var="customer">
                        <tr onclick="window.location.href = '/customer/info?id=${customer.id}'" class="clickable-row">
                            <td>${customer.id}</td>
                            <td>${customer.customerName}</td>
                            <td>${customer.contactFirstName} ${customer.contactLastName}</td>
                            <td>${customer.state}</td>
                            <td>${customer.zipCode}</td>
                            <td>${customer.country}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
        </div></div>
</section>
<a href="/">Back to Home</a>
<jsp:include page="../include/footer.jsp"/>