<?php 
require_once 'showTopMenu.php';
require_once 'db_connector.php';

$searchForTitle = $_GET['postName'];
$searchForPost = $_GET['postinformation'];



$sql_statement = "SELECT * FROM `post_table` WHERE `post_name` LIKE '%$searchForTitle%' OR 
`post_info` LIKE '%$searchForPost%'";


if($connection){
    $result = mysqli_query($connection, $sql_statement);
    if($result){
        while ($row = mysqli_fetch_assoc($result)){
            echo "post id " . $row['id'] . "<br>";
            echo "post title " . $row['post_name'] . "<br>";
            echo "post information " . $row['post_info'] . "<br>";
            echo "===========<br>";
        }
    }
    else{
        echo "Error in the sql " . mysqli_error($connection);
    }
}
else{
    echo "Error connecting " .mysql_connect_error();
}

?>