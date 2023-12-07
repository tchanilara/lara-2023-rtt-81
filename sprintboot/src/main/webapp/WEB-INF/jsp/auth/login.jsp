<jsp:include page="../include/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0"> Login</h1>
            </div>
        </div>
    </div>
</section>

 <section>
        <div class="container">
            <form method="post" action="/auth/loginSubmit">
                <div class="mt-3">
                    <label for="email" class="form-label">Username</label>
                    <input type="text" class="form-control" id="username" name="username"
                        aria-describedby="emailHelp">
                </div>
                <div class="mt-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="text" class="form-control" id="password" name="password">
                </div>



                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </section>