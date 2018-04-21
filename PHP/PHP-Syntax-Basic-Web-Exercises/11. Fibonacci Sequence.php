<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
    <?php
        if(isset($_GET['num'])){
            $size = $_GET['num'];
            $num1 = 1;
            $num2 = 1;
            echo $num1." ";
            echo $num2." ";

            for($i = 3; $i <= $size; $i++){
                $num3 = $num1 + $num2;
                echo $num3." ";
                $num1 = $num2;
                $num2 = $num3;
            }
        }
    ?>
</body>
</html>