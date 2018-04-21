<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
	<style>
		table * {
			border: 1px solid black;
			width: 50px;
			height: 50px;
		}
    </style>
</head>
<body>
<table>
    <tr>
        <td>
            Red
        </td>
        <td>
            Green
        </td>
        <td>
            Blue
        </td>
    </tr>
    <?php
        $num = 0;

        for($i = 0; $i < 5; $i++){
            $num += 51;
            echo "<tr>";

            echo "<td style='background-color: RGB($num, 0, 0)'></td>";
            echo "<td style='background-color: RGB(0, $num, 0)'></td>";
            echo "<td style='background-color: RGB(0, 0, $num)'></td>";

            echo "</tr>";
        }
    ?>
</table>
</body>
</html>