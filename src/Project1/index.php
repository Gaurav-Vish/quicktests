<html>
<head>
  <title>Website</title>
  <style type="text/css">
  body{
    font-family: Verdana;
    font-size: 12px;
  }
  a{
    color: #000;
    margin-right: 10px;
  }
  #menu{
    font-size: 10px;
    margin-bottom: 1px solid #000;
    margin-left: auto;
    margin-right: auto;
    width: 650px;
    padding: 5px;
  }
  #header, #content{
    margin-left: auto;
    margin-right: auto;
    width: 650px;
    padding: 5px;
  }
  </style>
</head>
<body>
  <div id="header">
    <h1>Website</h1>
  </div>
  <div id="menu">
    <a href="index.php">Home</a>
    <a href="index.php?p=aboutus">About uus</a>
    <a href="index.php?p=contactus">Contact us</a>
    <a href="index.php?p=news">News</a>
  </div>
  <div id="content">
    <?php
    $pages_dir ='pages';
    if(!empty($_GET['p'])){
      $pages = scandir($pages_dir,0);
      unset($pages['0'],$pages['1']);

      //print_r($pages);
      $p = $_GET['p'];
      if (in_array($p.'.inc.php',$pages)) {
        include($pages_dir.'/'.$p.'.inc.php');
      }
      else {
        echo "Sorry, Page not found";
      }
      //echo $p;
    }
    else {
      include($pages_dir.'/home'.'.inc.php');
    }

    ?>
  </div>
</body>
</html>
