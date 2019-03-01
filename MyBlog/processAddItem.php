<?php 




session_start();

require_once 'db_connector.php';

$postTitle = $_GET['PostTitle'];
$postInformation = $_GET['PostInformation'];
$user_id = $_SESSION['userid'];

$sql_statement = "INSERT INTO `post_table` (`id`, `post_name`, `post_info`, `user_table_id`) VALUES (NULL, '$postTitle', '$postInformation', '$user_id');";

if($connection){
    $result = mysqli_query($connection, $sql_statement);
    if($result){
        echo "Data inserted successfully!";
        echo "click <a href='index.php'>here</a> here to return";
    }
    else{
        echo "Error in the sql " . mysqli_error($connection);
    }
}
else{
    echo "Error connecting " .mysql_connect_error();
}

?>
