<?php

// Desde el móvil Android
 $user = $_POST['EMAIL'];
 $pass = $_POST['PASS'];

// Variables con valor estático para pruebas
// $user = 'a@svalero.com';
// $pass = '1234';

$link = mysqli_connect('localhost', 'root','', 'justeat');
if (!$link) {
    die('No pudo conectar: ' . mysql_error());
}

$q=mysqli_query($link, "SELECT * FROM usuario WHERE EMAIL='{$user}' AND PASS='{$pass}'");

while($e=mysqli_fetch_assoc($q)){
              $output[]=$e;
}
print(json_encode($output));

mysqli_close($link);

