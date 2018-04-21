<ul><?php
    for($i = 1; $i <= 20; $i++)
    {
        echo "<li><span style='color:";
        if ($i % 2 == 0)
        {
            echo "green";
        }
        else
        {
            echo "blue";
        }
        echo "'>$i</span></li>";
    }
    ?>
</ul>

