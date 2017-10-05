<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../static/favicon.ico">

    <title>CJ Design Login</title>

    <!-- Bootstrap core CSS -->
    <link href="http://v4-alpha.getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="http://v4-alpha.getbootstrap.com/examples/signin/signin.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="http://v4-alpha.getbootstrap.com/assets/js/ie10-viewport-bug-workaround.js"></script>
</head>

<body>

<div class="container">

    <form action="/admin" method="POST" class="form-signin">

        <h2 class="form-signin-heading">Please sign in</h2>

     <!--   <label for="inputText" class="sr-only">Username</label> -->
        <input type="text" name="username" class="form-control" placeholder="Username" required="" autofocus="">

     <!--   <label for="inputPassword" class="sr-only">Password</label> -->
        <input type="password" name="password" class="form-control" placeholder="Password" required="">

   <!--     <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
    -->
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>

</div> <!-- /container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->


</body>
</html>
