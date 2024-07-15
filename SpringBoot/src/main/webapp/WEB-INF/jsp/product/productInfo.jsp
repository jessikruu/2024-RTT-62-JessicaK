<jsp:include page="../include/header.jsp"/>
<link rel="stylesheet" href="/pub/css/global.css">


<h1>Product Info</h1>


<body>
<div class="tableBackground">
    <div class="container">
        <div class="row justify-content-center">

        <div class="col-auto">
        <table class="table table-success table-striped table-bordered table-responsive" style="width: 750pt">
            <tr>
                <td style="font-weight: bolder;">Vehicle ID:</td>
                <td>${productKey.id}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Product Code:</td>
                <td>${productKey.productCode}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Vehicle Name:</td>
                <td>${productKey.productName}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Description:</td>
                <td>${productKey.productDescription}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Vendor:</td>
                <td>${productKey.productVendor}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Amount in Stock:</td>
                <td>${productKey.quantityInStock}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">Buy Price:</td>
                <td>$${productKey.buyPrice}</td>
            </tr>
            <tr>
                <td style="font-weight: bolder;">MSRP:</td>
                <td>$${productKey.msrp}</td>
            </tr>


        </table>
    </div>
    </div>
    </div>

</div>
<a href="/">Back to Home</a>
</body>
<jsp:include page="../include/footer.jsp"/>