<?php
$conn=new mysqli('localhost','root','root02','playrobot');
if($conn->connect_error){
  echo $error->$conn->connect_error;
}
 ?>
