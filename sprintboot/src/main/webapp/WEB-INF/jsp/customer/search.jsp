<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>
<section>
    <div class="container">
        <h1> Customer Search </h1>

        <form action="/customer/search">
            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" value="${firstName}" >
            </div>
            <div class="mb-3">
                <label for="lastName" class="form-label">Last Name</label>
                <input type="text" class="form-control" id="lastName" name="lastName" value="${lastName}" >
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        <c:if test="${not empty customerVar}">
            <h1>Customers Found ${customerVar.size()}</h1>
            <table class="table">

            <tr>
                <td> Id</td>
                <td> First Name</td>
                <td> Last Name</td>
                <td> Phone</td><td> City</td>
                <td> Update</td>

            </tr>
            <c:forEach items="${customerVar}" var="customer">
                <tr>
                                <td> ${customer.id}</td>
                                <td> ${customer.firstName}</td>
                                <td> ${customer.lastName}</td>
                                <td> ${customer.phone}</td><td> ${customer.city}</td>
                                <td> <a href="/customer/edit/${customer.id}">Edit</a></td>
                            </tr>
                            </c:forEach>
           </table>
        </c:if>
    </div>
</section>
<jsp:include page="../include/footer.jsp"/>