<?php 
session_start();

$_SESSION = array();


session_destroy();
echo "You have been logged out";


?>