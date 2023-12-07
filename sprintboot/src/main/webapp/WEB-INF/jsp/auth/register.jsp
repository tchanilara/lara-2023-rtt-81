<jsp:include page="../include/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0"> User Registration</h1>
            </div>
        </div>
    </div>
</section>

 <section>
        <div class="container">
            <form method="get" action="/auth/registerSubmit">
                <div class="mt-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="text" class="form-control" id="email" name="email" value="${form.email}"
                        aria-describedby="emailHelp">
                </div>
                <c:if test="${errors.hasFieldErrors('email')}">
                    <div style="color:red">
                        <c:forEach items="${errors.getFieldErrors('email')}" var="error">
                            ${error.defaultMessage}<br>
                        </c:forEach>
                    </div>
                </c:if>
                <div class="mt-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="text" class="form-control" id="password" name="password" value="${form.password}">
                </div>
                <c:if test="${errors.hasFieldErrors('password')}">
                                    <div style="color:red">
                                        <c:forEach items="${errors.getFieldErrors('password')}" var="error">
                                            ${error.defaultMessage}<br>
                                        </c:forEach>
                                    </div>
                                </c:if>
               <div class="mb-3 mt-3">
                                   <label for="confirmPassword" class="form-label">Confirm Password</label>
                                   <input type="text" class="form-control" id="password1" name="password1" value="${form.password1}">
                               </div>
                               <c:if test="${errors.hasFieldErrors('password1')}">
                                                   <div style="color:red">
                                                       <c:forEach items="${errors.getFieldErrors('password1')}" var="error">
                                                           ${error.defaultMessage}<br>
                                                       </c:forEach>
                                                   </div>
                                               </c:if>


                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </section>