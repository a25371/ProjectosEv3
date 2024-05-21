<?php
$user = $_POST['User'];
$pass = $_POST['Password'];

$link = mysqli_connect('localhost', 'root','', 'groupon');
if (!$link) {
    die('No pudo conectar: ' . mysql_error());
}

$q=mysqli_query($link, "SELECT * FROM usuario WHERE EMAIL='{$user}' AND PASS='{$pass}'");

while($e=mysqli_fetch_assoc($q)){
              $output[]=$e;
}
print(json_encode($output));

mysqli_close($link);
