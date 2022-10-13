<?php

    $nim = "I.2211134";
    $nama = "Neddy";
    $umur = 35;
    $nilai = 95.22;
    $status = TRUE;

    echo "Nim : ".$nim. "<br>";
    echo "Nama : ".$nama. "<br>";
    echo "Umur : ".$umur;
    print "<br>";
    printf("Nilai : %.3f<br>", $nilai);
    if($status){
        echo "Status : Aktif";
    }else{
        echo "Status : Tidak Akrif";
    }


?>