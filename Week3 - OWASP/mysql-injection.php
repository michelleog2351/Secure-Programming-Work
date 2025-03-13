<?php
  $connection = mysqli_connect("localhost:3306","root","password");
  mysqli_select_db($connection,"mysecureapplication");

if (!empty($_POST['email']) && !empty($_POST['password']))
{
    $query    = 'SELECT * FROM `user` WHERE `email` = \''.$_POST['email'].'\' AND `password` = \''.md5($_POST['password']).'\'';
    echo 'Used query: ',$query,'<br /><br />';

    $result = mysqli_query($connection,$query);
    $matches  = mysqli_num_rows($result);

    if($row=mysqli_fetch_array($result))
    {
        $user = mysqli_fetch_assoc($result);
        echo 'Hello '.$row['email'].'!';
    }
    else
    {
        echo 'Invalid credentials!';
    }
}

?>
<form method="post" action="mysql-injection.php">
    <p>Log in to get privileges!</p>
    Mail:     <input type="text"    name="email"    value="<?=!empty($_POST['email'])    ? $_POST['email']    : ''?>" /><br />
    Password: <input type="password" name="password" value="<?=!empty($_POST['password']) ? $_POST['password'] : ''?>" /><br />
    <br />
    <input type="submit" name="submit" />
</form>
