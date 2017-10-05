
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../static/favicon.ico">

    <title>CJ Design</title>

    <!-- FontAwesome icons -->
    <script src="https://use.fontawesome.com/168e1f666f.js"></script>

    <!-- Bootstrap core CSS -->
    <link href="http://v4-alpha.getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="http://v4-alpha.getbootstrap.com/examples/dashboard/dashboard.css" rel="stylesheet">
</head>

<body>
<nav class="navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse">
    <button class="navbar-toggler navbar-toggler-right hidden-lg-up" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="#">Settings</a>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <!--    <li class="nav-item active">
                    <a class="nav-link" href="#">Hjem <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Settings</a>
                </li>-->
            </ul>
        <ul class="navbar-nav mr-right">
            <li class="nav-item nav-right">
                <a class="nav-link" href="../logout"><i class="fa fa-sign-out" aria-hidden="true"></i> Log out</a>
            </li>
        </ul>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <nav class="col-sm-3 col-md-2 hidden-xs-down bg-faded sidebar">
            <ul class="nav nav-pills flex-column">
                <li class="nav-item">
                    <a class="nav-link" href="/admin">Overview</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="#">Hjem<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/portefolje">Portefølje</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/kontakt">Kontakt</a>
                </li>
            </ul>
        </nav>

        <main class="col-sm-9 offset-sm-3 col-md-10 offset-md-2 pt-3">
            <h1>Hjem</h1>
        </main>
        <div style="margin-left: 20% !important; margin-right: 5%; width: 80%">
            <div style="height: 100px">
            <h5>Logo</h5>
            <img src="../static/{{index .Bilde 0}}" />
                <div style="float: right; width: 50%">
                    <p>Last opp nytt bilde:</p>
                    <form enctype="multipart/form-data" action="../upload" method="post">
                        <input type="file" name="uploadfile" />
                        <input type="hidden" name="fil" value="0"/>
                        <input type="submit" value="upload" />
                    </form>
                </div>
            </div>
            <hr>
            <!------------------------------->
            <div style="height: 200px">
                <h5>Karusell 1</h5>
                <img height="150px" src="../static/{{index .Bilde 1}}" />
                <div style="float: right; width: 50%">
                    <p>Last opp nytt bilde:</p>
                    <form enctype="multipart/form-data" action="../upload" method="post">
                        <input type="file" name="uploadfile" />
                        <input type="hidden" name="fil" value="1"/>
                        <input type="submit" value="upload" />
                    </form>
                </div>
            </div>
            <hr>
            <div style="height: 200px">
                <h5>Karusell 2</h5>
                <img height="150px" src="../static/{{index .Bilde 2}}" />
                <div style="float: right; width: 50%">
                    <p>Last opp nytt bilde:</p>
                    <form enctype="multipart/form-data" action="../upload" method="post">
                        <input type="file" name="uploadfile" />
                        <input type="hidden" name="fil" value="2"/>
                        <input type="submit" value="upload" />
                    </form>
                </div>
            </div>
            <hr>
            <div style="height: 200px">
                <h5>Karusell 3</h5>
                <img height="150px" src="../static/{{index .Bilde 3}}" />
                <div style="float: right; width: 50%">
                    <p>Last opp nytt bilde:</p>
                    <form enctype="multipart/form-data" action="../upload" method="post">
                        <input type="file" name="uploadfile" />
                        <input type="hidden" name="fil" value="3"/>
                        <input type="submit" value="upload" />
                    </form>
                </div>
            </div>
            <hr>
            <!------------------------------->
            <div style="height: 400px">
                <div style="float:left;width: 40%;" height>
                    <h5>Header 1</h5>
                    <img height="150px" src="../static/{{index .Bilde 4}}" />
                    <p>{{index .Heading 0}}</p>
                    <p>{{index .Body 0}}</p>
                </div>
                <div style="float: right; width: 50%">
                    <p>Last opp nytt bilde:</p>
                    <form enctype="multipart/form-data" action="../upload" method="post">
                        <input type="file" name="uploadfile" />
                        <input type="hidden" name="fil" value="4"/>
                        <input type="submit" value="upload" />
                    </form>
                    <br>
                    <p>Last opp ny Header: </p>
                    <form action="/uploadheader" method="post">
                        Header:<input type="text" name="header">
                        <input type="hidden" name="key" value="0"/>
                        <input type="submit" value="upload">
                    </form>
                    <br>
                    <p>Last opp ny Tekst: </p>
                    <form action="/uploadbody" method="post">
                        Tekst:<input type="text" name="body">
                        <input type="hidden" name="key" value="0"/>
                        <input type="submit" value="upload">
                    </form>
                </div>
            </div>
            <hr>
            <div style="height: 400px">
                <div style="float:left;width: 40%;" height>
                    <h5>Header 2</h5>
                    <img height="150px" src="../static/{{index .Bilde 5}}" />
                    <p>{{index .Heading 1}}</p>
                    <p>{{index .Body 1}}</p>
                </div>
                <div style="float: right; width: 50%">
                    <p>Last opp nytt bilde:</p>
                    <form enctype="multipart/form-data" action="../upload" method="post">
                        <input type="file" name="uploadfile" />
                        <input type="hidden" name="fil" value="5"/>
                        <input type="submit" value="upload" />
                    </form>
                    <br>
                    <p>Last opp ny Header: </p>
                    <form action="/uploadheader" method="post">
                        Header:<input type="text" name="header">
                        <input type="hidden" name="key" value="1"/>
                        <input type="submit" value="upload">
                    </form>
                    <br>
                    <p>Last opp ny Tekst: </p>
                    <form action="/uploadbody" method="post">
                        Tekst:<input type="text" name="body">
                        <input type="hidden" name="key" value="1"/>
                        <input type="submit" value="upload">
                    </form>
                </div>
            </div>
            <hr>
            <div style="height: 400px">
                <div style="float:left;width: 40%;" height>
                    <h5>Header 3</h5>
                    <img height="150px" src="../static/{{index .Bilde 6}}" />
                    <p>{{index .Heading 2}}</p>
                    <p>{{index .Body 2}}</p>
                </div>
                <div style="float: right; width: 50%">
                    <p>Last opp nytt bilde:</p>
                    <form enctype="multipart/form-data" action="../upload" method="post">
                        <input type="file" name="uploadfile" />
                        <input type="hidden" name="fil" value="6"/>
                        <input type="submit" value="upload" />
                    </form>
                    <br>
                    <p>Last opp ny Header: </p>
                    <form action="/uploadheader" method="post">
                        Header:<input type="text" name="header">
                        <input type="hidden" name="key" value="2"/>
                        <input type="submit" value="upload">
                    </form>
                    <br>
                    <p>Last opp ny Tekst: </p>
                    <form action="/uploadbody" method="post">
                        Tekst:<input type="text" name="body">
                        <input type="hidden" name="key" value="2"/>
                        <input type="submit" value="upload">
                    </form>
                </div>
            </div>
            <hr>
            <!------------------------------->
            <div style="height: 400px">
                <div style="float:left;width: 40%;" height>
                    <h5>Feature 1</h5>
                    <img height="150px" src="../static/{{index .Bilde 7}}" />
                    <p>{{index .Heading 3}}</p>
                    <p>{{index .Body 3}}</p>
                </div>
                <div style="float: right; width: 50%">
                    <p>Last opp nytt bilde:</p>
                    <form enctype="multipart/form-data" action="../upload" method="post">
                        <input type="file" name="uploadfile" />
                        <input type="hidden" name="fil" value="7"/>
                        <input type="submit" value="upload" />
                    </form>
                    <br>
                    <p>Last opp ny Header: </p>
                    <form action="/uploadheader" method="post">
                        Header:<input type="text" name="header">
                        <input type="hidden" name="key" value="3"/>
                        <input type="submit" value="upload">
                    </form>
                    <br>
                    <p>Last opp ny Tekst: </p>
                    <form action="/uploadbody" method="post">
                        Tekst:<input type="text" name="body">
                        <input type="hidden" name="key" value="3"/>
                        <input type="submit" value="upload">
                    </form>
                </div>
            </div>
            <hr>
            <div style="height: 400px">
                <div style="float:left;width: 40%;" height>
                    <h5>Feature 2</h5>
                    <img height="150px" src="../static/{{index .Bilde 8}}" />
                    <p>{{index .Heading 4}}</p>
                    <p>{{index .Body 4}}</p>
                </div>
                <div style="float: right; width: 50%">
                    <p>Last opp nytt bilde:</p>
                    <form enctype="multipart/form-data" action="../upload" method="post">
                        <input type="file" name="uploadfile" />
                        <input type="hidden" name="fil" value="8"/>
                        <input type="submit" value="upload" />
                    </form>
                    <br>
                    <p>Last opp ny Header: </p>
                    <form action="/uploadheader" method="post">
                        Header:<input type="text" name="header">
                        <input type="hidden" name="key" value="4"/>
                        <input type="submit" value="upload">
                    </form>
                    <br>
                    <p>Last opp ny Tekst: </p>
                    <form action="/uploadbody" method="post">
                        Tekst:<input type="text" name="body">
                        <input type="hidden" name="key" value="4"/>
                        <input type="submit" value="upload">
                    </form>
                </div>
            </div>
            <hr>
            <div style="height: 400px">
                <div style="float:left;width: 40%;" height>
                    <h5>Feature 1</h5>
                    <img height="150px" src="../static/{{index .Bilde 9}}" />
                    <p>{{index .Heading 5}}</p>
                    <p>{{index .Body 5}}</p>
                </div>
                <div style="float: right; width: 50%">
                    <p>Last opp nytt bilde:</p>
                    <form enctype="multipart/form-data" action="../upload" method="post">
                        <input type="file" name="uploadfile" />
                        <input type="hidden" name="fil" value="9"/>
                        <input type="submit" value="upload" />
                    </form>
                    <br>
                    <p>Last opp ny Header: </p>
                    <form action="/uploadheader" method="post">
                        Header:<input type="text" name="header">
                        <input type="hidden" name="key" value="5"/>
                        <input type="submit" value="upload">
                    </form>
                    <br>
                    <p>Last opp ny Tekst: </p>
                    <form action="/uploadbody" method="post">
                        Tekst:<input type="text" name="body">
                        <input type="hidden" name="key" value="5"/>
                        <input type="submit" value="upload">
                    </form>
                </div>
            </div>
            <hr>

        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</body>
</html>
