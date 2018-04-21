<head>
    <style>
        div {
            display: inline-block;
            width: 150px;
            padding: 2px;
            margin: 5px;
        }
    </style>
</head>
<body>
<?php
for ($i = 0; $i < 256; $i += 51)
{
    for ($j = 0; $j < 256; $j += 51)
    {
        for ($k = 0; $k < 256; $k += 51)
        {
            echo "<div style='background:rgb($i, $j, $k)'>rgb($i, $j, $k)</div>";
        }
    }
}
?>
</body>
