<jsp:include page="../include/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <h1>Create customer</h1>


    <section>
        <div class="container">
            <form method="get" action="/customer/createSubmit">
                <input type="hidden" class="form-control" id="id" name="id" value="${form.id}">
                <div class="mt-3">
                    <label for="firstName" class="form-label">First Name</label>
                    <input type="text" class="form-control" id="firstName" name="firstName" value="${form.firstName}"
                        aria-describedby="firstNAmeHelp">
                    <div id="firstnameHelp" class="form-text">Please let us know your first name</div>
                </div>
                <c:if test="${errors.hasFieldErrors('firstName')}">
                    <div style="color:red">
                        <c:forEach items="${errors.getFieldErrors('firstName')}" var="error">
                            ${error.defaultMessage}<br>
                        </c:forEach>
                    </div>
                </c:if>
                <div class="mt-3">
                    <label for="lastName" class="form-label">Last Name</label>
                    <input type="text" class="form-control" id="lastName" name="lastName" value="${form.lastName}">
                </div>
                <c:if test="${errors.hasFieldErrors('lastName')}">
                                    <div style="color:red">
                                        <c:forEach items="${errors.getFieldErrors('lastName')}" var="error">
                                            ${error.defaultMessage}<br>
                                        </c:forEach>
                                    </div>
                                </c:if>
                <div class="mt-3">
                    <label for="phone" class="form-label">Phone</label>
                    <input type="text" class="form-control" id="phone" name="phone" value="${form.phone}">
                </div>
                <c:if test="${errors.hasFieldErrors('phone')}">
                                    <div style="color:red">
                                        <c:forEach items="${errors.getFieldErrors('phone')}" var="error">
                                            ${error.defaultMessage}<br>
                                        </c:forEach>
                                    </div>
                                </c:if>
                <div class="mt-3">
                    <label for="city" class="form-label">City</label>
                    <input type="text" class="form-control" id="city" name="city" value="${form.city}">
                </div>
                <c:if test="${errors.hasFieldErrors('city')}">
                                    <div style="color:red">
                                        <c:forEach items="${errors.getFieldErrors('city')}" var="error">
                                            ${error.defaultMessage}<br>
                                        </c:forEach>
                                    </div>
                                </c:if>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </section>
    <jsp:include page="../include/footer.jsp" />
    </body>

    </html>