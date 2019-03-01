

<html>
<title>Austin's Blog</title>
<head>
<link rel="stylesheet" type="text/css" href="custom-styles.css">
</head>
</html>
<body>
<h1>Austin's Blog</h1>
<div class="menu-container">
<?php
if (!isset($_SESSION['username'])):
?>
<span class="menu-item"><a href="login.html">Login</a></span>
<?php else: ?>
<span class="menu-item">Hello <?php echo $_SESSION['username']; ?> <a href="logout.php">Logout</a></span>
<?php endif; ?>

| <span class="menu-item"><a href="index.php?pageNumber=1">Search</a> </span> | <span class="menu-item"><a href="index.php?pageNumber=2">Create a New Post</a></span>
</div>





</body>
