<form>
    Celsius: <input type="text" name="cel" />
    <input type="submit" value="Convert">
</form>
<?php
if(isset($_GET['cel']))
{
    $cel = floatval($_GET['cel']);
    $result = $cel * 9 / 5 + 32 ;

    echo "$cel &deg;C = $result &deg;F";
}
?>
<form>
    Fahrenheit: <input type="text" name="fah" />
    <input type="submit" value="Convert">
</form>
<?php
if(isset($_GET['fah']))
{
    $fah = floatval($_GET['fah']);
    $result = ($fah - 32) * 5 / 9;

    echo "$fah &deg;F = $result &deg;C";
}
?>