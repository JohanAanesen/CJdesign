<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="Oppslagstavler">
    <meta name="author" content="CJ Design">
    <link rel="icon" href="http://v4-alpha.getbootstrap.com/favicon.ico">

    <!-- FontAwesome icons -->
    <script src="https://use.fontawesome.com/168e1f666f.js"></script>

    <title>CJ Design</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">

    <!-- My CSS -->
    <link href="../static/css/caro.css" type="text/css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="http://v4-alpha.getbootstrap.com/examples/carousel/carousel.css" rel="stylesheet">

</head>
<body>

<nav class="navbar navbar-light navbar-static-top">
    <a href="#" class="navbar-brand text-info"><img src="/static/{{index .Bilde 0}}" height="40px" /> <!--CJ Dekor--></a>
    <ul class="nav nav-pills">
        <li class="nav-item active">
            <a class="nav-link text-info" href="/">Hjem <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-info" href="/portefolje">Portefølje</a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-info" href="/kontakt">Kontakt</a>
        </li>

    </ul>
    <ul class="nav nav-pills">
        <li class="nav-item nav-right">
            <a class="nav-link text-info" href="/login"><i class="fa fa-sign-in" aria-hidden="true"></i> Login</a>
        </li>
    </ul>
</nav>

<!-- Carousel
================================================== -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1" class=""></li>
        <li data-target="#myCarousel" data-slide-to="2" class=""></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="carousel-item active">
            <img class="first-slide" src="/static/{{index .Bilde 1}}" alt="First slide">
              <!--   src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="First slide"> -->
            <div class="container">
                <!--   <div class="carousel-caption text-left">
                       <h1>Example headline.</h1>
                       <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                       <p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p>
                   </div>-->
            </div>
        </div>
        <div class="carousel-item">
            <img class="second-slide" src="/static/{{index .Bilde 2}}" alt="Second slide">
            <div class="container">
                <!--    <div class="carousel-caption">
                        <h1>Another example headline.</h1>
                        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                        <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
                    </div>-->
            </div>
        </div>
        <div class="carousel-item">
            <img class="third-slide" src="/static/{{index .Bilde 3}}" alt="Third slide">
            <div class="container">
            <!--    <div class="carousel-caption text-right">
                    <h1>One more for good measure.</h1>
                    <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                    <p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p>
                </div> -->
            </div>
        </div>
    </div>
    <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div><!-- /.carousel -->


<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container marketing">

    <!-- Three columns of text below the carousel -->
    <div class="row">
        <div class="col-lg-4">
            <img class="img-circle" src="/static/{{index .Bilde 4}}" alt="Generic placeholder image" width="140" height="140">
            <h2>{{index .Heading 0}}</h2>
            <p>{{index .Body 0}}</p>
            <p><a class="btn btn-secondary" href="#" role="button">View details »</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
            <img class="img-circle" src="/static/{{index .Bilde 5}}" alt="Generic placeholder image" width="140" height="140">
            <h2>{{index .Heading 1}}</h2>
            <p>{{index .Body 1}}</p>
            <p><a class="btn btn-secondary" href="#" role="button">View details »</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
            <img class="img-circle" src="/static/{{index .Bilde 6}}" alt="Generic placeholder image" width="140" height="140">
            <h2>{{index .Heading 2}}</h2>
            <p>{{index .Body 2}}</p>
            <p><a class="btn btn-secondary" href="#" role="button">View details »</a></p>
        </div><!-- /.col-lg-4 -->
    </div><!-- /.row -->


    <!-- START THE FEATURETTES -->

    <hr class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-7">
            <h2 class="featurette-heading">{{index .Heading 3}}</h2>
            <p class="lead">{{index .Body 3}}</p>
        </div>
        <div class="col-md-5">
            <img class="featurette-image img-fluid center-block" data-src="holder.js/500x500/auto" alt="500x500" src="/static/{{index .Bilde 7}}" data-holder-rendered="true">
        </div>
    </div>

    <hr class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-7 col-md-push-5">
            <h2 class="featurette-heading">{{index .Heading 4}}</h2>
            <p class="lead">{{index .Body 4}}</p>
        </div>
        <div class="col-md-5 col-md-pull-7">
            <img class="featurette-image img-fluid center-block" data-src="holder.js/500x500/auto" alt="500x500" src="/static/{{index .Bilde 8}}" data-holder-rendered="true">
        </div>
    </div>

    <hr class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-7">
            <h2 class="featurette-heading">{{index .Heading 5}}</h2>
            <p class="lead">{{index .Body 5}}</p>
        </div>
        <div class="col-md-5">
            <img class="featurette-image img-fluid center-block" data-src="holder.js/500x500/auto" alt="500x500" src="/static/{{index .Bilde 9}}" data-holder-rendered="true">
        </div>
    </div>

    <hr class="featurette-divider">

    <!-- /END THE FEATURETTES -->


    <!-- FOOTER -->
    <footer>
        <p class="pull-right"><a class="text-info" href="#">Back to top</a></p>
        <p>© 2017 CJ Dekor <!-- · <a href="#">Privacy</a> · <a href="#">Terms</a>--></p>
    </footer>

</div><!-- /.container -->


<!-- Bootstrap core JavaScript / jQuery
================================================== -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

<svg xmlns="http://www.w3.org/2000/svg"
     width="500"
     height="500"
     viewBox="0 0 500 500"
     preserveAspectRatio="none"
     style="
        display: none;
        visibility: hidden;
        position: absolute;
        top: -100%;
        left: -100%;
      "
>
    <defs>
        <style type="text/css"></style>
    </defs>
    <text
            x="0"
            y="25"
            style="
          font-weight:bold;
          font-size:25pt;
          font-family:Arial, Helvetica, Open Sans, sans-serif
        "
    >
        500x500
    </text>
</svg>
</body>
</html>
